package com.corhuila.securitymongo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.securitymongo.DTO.ApiResponseDto;
import com.corhuila.securitymongo.Entity.User;
import com.corhuila.securitymongo.IService.IUserService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/user")
public class UserController{
	@Autowired
	private IUserService service; 
	
	@GetMapping
	public ResponseEntity<ApiResponseDto<List<User>>> findByStateTrue() {
		try {
			return ResponseEntity.ok(new ApiResponseDto<List<User>>("Datos obtenidos", service.findByStateTrue(), true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<List<User>>(e.getMessage(), null, false));
		}
	}

	@GetMapping("{id}")
	public ResponseEntity<ApiResponseDto<User>> show(@PathVariable String id) {
		try {
			User entity = service.findById(id);
			return ResponseEntity.ok(new ApiResponseDto<User>("Registro encontrado", entity, true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<User>(e.getMessage(), null, false));
		}
	}

	@PostMapping
	public ResponseEntity<ApiResponseDto<User>> save(@RequestBody User entity) {
		try {
			return ResponseEntity.ok(new ApiResponseDto<User>("Datos guardados", service.save(entity), true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<User>(e.getMessage(), null, false));
		}
	}

	@PutMapping("{id}")
	public ResponseEntity<ApiResponseDto<User>> update(@PathVariable String id, @RequestBody User entity) {
		try {
			service.update(id, entity);
			return ResponseEntity.ok(new ApiResponseDto<User>("Datos actualizados", null, true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<User>(e.getMessage(), null, false));
		}
	}

	@DeleteMapping("{id}")
	public ResponseEntity<ApiResponseDto<User>> delete(@PathVariable String id) {
		try {
			service.delete(id);
			return ResponseEntity.ok(new ApiResponseDto<User>("Registro eliminado", null, true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<User>(e.getMessage(), null, false));
		}
	}
}
