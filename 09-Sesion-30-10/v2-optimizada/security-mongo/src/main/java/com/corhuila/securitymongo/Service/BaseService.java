package com.corhuila.securitymongo.Service;

import org.springframework.beans.BeanUtils;

import com.corhuila.securitymongo.Entity.Auditoria;
import com.corhuila.securitymongo.IRepository.IBaseRepository;
import com.corhuila.securitymongo.IService.IBaseService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


public abstract class BaseService<T extends Auditoria> implements IBaseService<T> {

    protected abstract IBaseRepository<T, String> getRepository();

    @Override
    public List<T> all() {
        return getRepository().findAll();
    }

    @Override
    public List<T> findByStateTrue() {
        return getRepository().findAll();
    }

	@Override
    public T findById(String id) throws Exception {
        Optional<T> op = getRepository().findById(id);

        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        }

        return op.get();
    }

    @Override
    public T save(T entity) throws Exception{
    	try {
            entity.setCreatedAt(LocalDateTime.now());
            return getRepository().save(entity);
        } catch (Exception e) {
            // Captura la excepción
        	throw new Exception("Error al guardar la entidad: " + e.getMessage());
        }
    }

    @Override
    public void update(String id, T entity) throws Exception {
        Optional<T> op = getRepository().findById(id);

        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        }else if(op.get().getDeletedAt() != null) {
        	throw new Exception("Registro inhabilitado");
        }

        T entityUpdate = op.get();

        String[] ignoreProperties = {"id","createdAt","deleteAt"};
        BeanUtils.copyProperties(entity, entityUpdate,ignoreProperties);
        entityUpdate.setUpdatedAt(LocalDateTime.now());
        getRepository().save(entityUpdate);
    }

    @Override
    public void delete(String id) throws Exception {
        Optional<T> op = getRepository().findById(id);

        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        }

        T entityUpdate = op.get();
        entityUpdate.setDeletedAt(LocalDateTime.now());

        getRepository().save(entityUpdate);
    }
}