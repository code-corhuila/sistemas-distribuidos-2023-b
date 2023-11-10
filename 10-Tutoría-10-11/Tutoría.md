# Paso 1: Definir estructura del DTO

```
public interface ILoginDto {
	String getUser();
	int getAutorizacion();
	Boolean getState();
}
```

# Paso 2: definir la consulta SQL
```
@Query(value = " SELECT  "
			+ "	user, "
			+ "    1 as autorizacion, "
			+ "    state "
			+ " FROM  "
			+ "		user "
			+ " WHERE  "
			+ "	user = :user AND  "
			+ "    password = :password; ", nativeQuery = true)
	List<ILoginDto> getLogin2(@Param("user") String user, @Param("password") String password);
```

# Paso 3: Definir el método en la interfaz del servicio.
```
List<ILoginDto> getLogin2(String user, String password);
```

# Paso 4: Definir la implementación del método
```
@Override
public List<ILoginDto> getLogin2(String user, String password) throws Exception{
    List<ILoginDto> loginResults = repository.getLogin2(user, password);
    
    if (loginResults.isEmpty()) {
        throw new Exception("Usuario o la contraseña no son válidos");
    }
    
    boolean estado = verificarEstado(loginResults);
    
    if (!estado) {
        throw new Exception("La cuenta se encuentra deshabilitada");
    }

    return loginResults;
}

private boolean verificarEstado(List<ILoginDto> loginResults) {
    for (ILoginDto loginDto : loginResults) {
        if (!loginDto.getState()) {
            return false;
        }
    }
    return true;
}
```

# Paso 5: Definir el end-point  
```
@GetMapping("get-login2")
public ResponseEntity<ApiResponseDto<List<ILoginDto>>> getLogin2(@RequestParam String user, @RequestParam String password) {
    try {
        return ResponseEntity.ok(new ApiResponseDto<List<ILoginDto>>("Datos obtenidos", true, service.getLogin2(user, password)));
    } catch (Exception e) {
        return ResponseEntity.internalServerError().body(new ApiResponseDto<List<ILoginDto>>(e.getMessage(), false, null));
    }
}
```