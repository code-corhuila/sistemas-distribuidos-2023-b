package com.corhuila.securitymongo.IService;

import com.corhuila.securitymongo.DTO.IUserDto;
import com.corhuila.securitymongo.Entity.User;

import java.util.List;

public interface IUserService extends IBaseService<User> {
	
	List<IUserDto> getListPersonUser();
}
