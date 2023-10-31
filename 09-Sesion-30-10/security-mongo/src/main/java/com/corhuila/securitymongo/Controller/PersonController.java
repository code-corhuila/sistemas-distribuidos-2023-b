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
import com.corhuila.securitymongo.Entity.Person;
import com.corhuila.securitymongo.IService.IPersonService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/person")
public class PersonController {
   
	@Autowired
	private IPersonService service; 
	
	@GetMapping
	public ResponseEntity<ApiResponseDto<List<Person>>> findByStateTrue() {
		try {
			return ResponseEntity.ok(new ApiResponseDto<List<Person>>("Datos obtenidos", service.findByStateTrue(), true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<List<Person>>(e.getMessage(), null, false));
		}
	}

	@GetMapping("{id}")
	public ResponseEntity<ApiResponseDto<Person>> show(@PathVariable String id) {
		try {
			Person entity = service.findById(id);
			return ResponseEntity.ok(new ApiResponseDto<Person>("Registro encontrado", entity, true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<Person>(e.getMessage(), null, false));
		}
	}

	@PostMapping
	public ResponseEntity<ApiResponseDto<Person>> save(@RequestBody Person entity) {
		try {
			return ResponseEntity.ok(new ApiResponseDto<Person>("Datos guardados", service.save(entity), true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<Person>(e.getMessage(), null, false));
		}
	}

	@PutMapping("{id}")
	public ResponseEntity<ApiResponseDto<Person>> update(@PathVariable String id, @RequestBody Person entity) {
		try {
			service.update(id, entity);
			return ResponseEntity.ok(new ApiResponseDto<Person>("Datos actualizados", null, true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<Person>(e.getMessage(), null, false));
		}
	}

	@DeleteMapping("{id}")
	public ResponseEntity<ApiResponseDto<Person>> delete(@PathVariable String id) {
		try {
			service.delete(id);
			return ResponseEntity.ok(new ApiResponseDto<Person>("Registro eliminado", null, true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<Person>(e.getMessage(), null, false));
		}
	}
}
