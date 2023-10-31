package com.corhuila.securitymongo.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.securitymongo.DTO.ApiResponseDto;
import com.corhuila.securitymongo.DTO.IUserDto;
import com.corhuila.securitymongo.Entity.User;
import com.corhuila.securitymongo.IService.IUserService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/user")
public class UserController extends BaseController<User,IUserService> {
    public UserController(IUserService service) {
        super(service, "User");
    }
    
    @GetMapping("/get-list-person-user")
	public ResponseEntity<ApiResponseDto<List<IUserDto>>> getListPersonUser() {
		try {
			return ResponseEntity.ok(new ApiResponseDto<List<IUserDto>>("Datos obtenidos", service.getListPersonUser(), true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IUserDto>>(e.getMessage(), null, false));
		}
	}
}
