package com.corhuila.security.IService;

import com.corhuila.security.DTO.IUserDto;
import com.corhuila.security.Entity.User;
import java.util.List;

public interface IUserService extends IBaseService<User> {
	
	List<IUserDto> getListPersonUser();
}
