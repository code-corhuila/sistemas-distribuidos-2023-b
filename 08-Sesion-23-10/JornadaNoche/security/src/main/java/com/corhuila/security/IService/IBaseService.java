package com.corhuila.security.IService;

import java.util.List;

import com.corhuila.security.Entity.Auditoria;

public interface IBaseService <T extends Auditoria> {
	List<T> all();
    List<T> findByStateTrue();
    T findById(Long id) throws Exception;
    T save(T entity) throws Exception;
    void update(Long id, T entity) throws Exception;
    void delete(Long id) throws Exception;
}
