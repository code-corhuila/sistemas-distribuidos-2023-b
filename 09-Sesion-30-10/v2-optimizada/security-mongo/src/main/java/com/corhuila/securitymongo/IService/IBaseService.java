package com.corhuila.securitymongo.IService;

import java.util.List;

import com.corhuila.securitymongo.Entity.Auditoria;

public interface IBaseService <T extends Auditoria> {
	List<T> all();
    List<T> findByStateTrue();
    T findById(String id) throws Exception;
    T save(T entity) throws Exception;
    void update(String id, T entity) throws Exception;
    void delete(String id) throws Exception;
}
