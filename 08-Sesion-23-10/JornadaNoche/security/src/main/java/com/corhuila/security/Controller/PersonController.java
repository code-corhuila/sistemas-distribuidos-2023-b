package com.corhuila.security.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.security.Entity.Person;
import com.corhuila.security.IService.IPersonService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/person")
public class PersonController extends BaseController<Person,IPersonService> {
    public PersonController(IPersonService service) {
        super(service, "Person");
    }
}
