# Ruta API

* Protocolo: http / https
* Server: localhost 
* Port: 9090
* Path general: v1/api/
* Path del controlador: Person
http://localhost:9090/v1/api/Person


=======================
* Extends: Traer todos los datos que tiene la clase padre. 
* Clase generica: @MappedSuperclass, no llevar @Entity y es abstracta.
* Clase de implementación: @Entity, no llevar @MappedSuperclass y no es abstracta.


======================
# Sistema ubicación

- Base de datos: ubicacion
- Tabla: Continente, Pais, Departamento, Ciudad
- Clase implementación: Continente, Pais, Departamento, Ciudad
- Clase generica: state, createdAt, updatedAt, deletedAt

Nota: De cada Continente, Pais, Departamento y Ciudad se conoce que tiene como atributos name, code y atributos de la clase generica. Aplicar herencia.