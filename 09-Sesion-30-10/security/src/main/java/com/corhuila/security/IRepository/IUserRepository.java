package com.corhuila.security.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.corhuila.security.DTO.IUserDto;
import com.corhuila.security.Entity.User;
@Repository
public interface IUserRepository extends IBaseRepository<User, Long>{
	@Query(value = " SELECT "
			+ "	p.id, "
			+ "    CONCAT(p.name,' ',P.lastname) as persona, "
			+ "    u.id, "
			+ "    u.user "
			+ "FROM  "
			+ "	user u "
			+ "	INNER JOIN person p ON u.person_id = p.id "
			+ "WHERE   "
			+ "	p.state = true  "
			+ "	and u.state = true; ", nativeQuery = true)
	List<IUserDto> getListPersonUser();
}
