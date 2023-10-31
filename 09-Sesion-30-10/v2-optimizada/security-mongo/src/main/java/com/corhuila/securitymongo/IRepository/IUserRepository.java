package com.corhuila.securitymongo.IRepository;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.corhuila.securitymongo.DTO.IUserDto;
import com.corhuila.securitymongo.Entity.User;
@Repository
public interface IUserRepository extends IBaseRepository<User, String>{
	
	@Query(value = "{ 'state': true }")
	    List<User> findAllUsersWithStateTrue();

    @Query(value = "["
            + "{'$match': { 'state': true }},"
            + "{'$lookup': { 'from': 'person', 'localField': 'personId', 'foreignField': '_id', 'as': 'person' }},"
            + "{'$unwind': '$person'},"
            + "{'$project': { '_id': '$person._id', 'persona': { '$concat': ['$person.name', ' ', '$person.lastname'] }, 'userId': '$_id', 'user': 1 }}"
            + "]")
    List<IUserDto> getListPersonUser();
}
