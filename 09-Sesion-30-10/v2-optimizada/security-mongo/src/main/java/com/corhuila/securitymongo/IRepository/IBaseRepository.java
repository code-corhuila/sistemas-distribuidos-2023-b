package com.corhuila.securitymongo.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.securitymongo.Entity.Auditoria;

@Repository
public interface IBaseRepository <T extends Auditoria, ID> extends MongoRepository<T, ID> {
  
}
