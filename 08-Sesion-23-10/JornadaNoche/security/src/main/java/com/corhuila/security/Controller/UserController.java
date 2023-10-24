package com.corhuila.security.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.security.Entity.User;
import com.corhuila.security.IService.IUserService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/user")
public class UserController extends BaseController<User,IUserService> {
    public UserController(IUserService service) {
        super(service, "User");
    }
}
