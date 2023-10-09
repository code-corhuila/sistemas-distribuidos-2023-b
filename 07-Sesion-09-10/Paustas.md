1. Crear proyecto con la siguiente estructura: 
- Nombre: corte2_primer_nombre_primer_apellido
- COM: corhuila
- Dependencias: Spring Boot DevTools, Spring Web, Spring Data JPA, MySQL Driver
- Java: 8, 11, 17(Sugerida)
- Spring Boot: 2.7.16, 3.0.11, 3.1.4(Sugerida)
- Descripción: Prueba corte 2 - Distribuidos
- Paquetes de aplicación (PascalCase):
    - com.corhuila.corte2_primer_nombre_primer_apellido.Entity
    - com.corhuila.corte2_primer_nombre_primer_apellido.IRepository
    - com.corhuila.corte2_primer_nombre_primer_apellido.IService
    - com.corhuila.corte2_primer_nombre_primer_apellido.Service
    - com.corhuila.corte2_primer_nombre_primer_apellido.Controller
- Nomenclatura de archivos (PascalCase): 
    - Entity: NombreEntidad.java
    - IRepository: INombreEntidadRepository.java
    - IService: INombreEntidadService.java
    - Service: NombreEntidadService.java
    - Controller: NombreEntidadController.java
2. Crear la base de datos en MySQL con el nombre corte2_primer_nombre_primer_apellido (camel_case)
    - Crear la tabla con el nombre estudiante con los siguientes campos:
        - id: int, primary key, autoincremental
        - nombre: varchar(50)
        - apellido: varchar(50)
        - edad: int
    - Crear la tabla de materias del estudiante con los siguientes campos:
        - id: int, primary key, autoincremental
        - nombre: varchar(50)
        - id_estudiante: int, foreign key
3. Crer sentencias sql para la construcción de la base de datos

# Nota a tener en cuenta a la hora de correr el proyecto.
1. Entregar archivo sql con las sentencias de creación de la base de datos (corte2_primer_nombre_primer_apellido)
2. Entrgar backend (corte2_primer_nombre_primer_apellido)
3. Use el validation para el application.properties
4. Entregar documentación de la api con postman (archivo json) (corte2_primer_nombre_primer_apellido)
    - Collection: Estudiante, Materia
    - Verbos: GET, POST, PUT, DELETE
    - Rutas: /estudiante, /materia
    - Body: raw, JSON
    - Nombre por verbos: 
        - GET: FindAll, FindById
        - POST: Save 
        - PUT: Update
        - DELETE: DeleteById

========================================
server.port= 9191
spring.jpa.hibernate.ddl-auto = 
spring.datasource.url = jdbc:mysql:
spring.datasource.username = 
spring.datasource.password = 

# Usar base de datos con los siguientes parametros.
server.port= 9000
spring.jpa.hibernate.ddl-auto = update
spring.datasource.url = jdbc:mysql://149.100.155.52/u342060465_corte2
spring.datasource.username = u342060465_corte2
spring.datasource.password = la que se entregue en clase.

# Para caracterizar el trabajo de cada estudiante, se debe crear en nombre de las tablas con el nombre base más el numero_documento del estudiante.
# Ejemplo: ustudiante y materia_estudiante, si el ducumento del Jesús González es 1234567890, el nombre de las tablas debe ser estudiante_1234567890 y materia_estudiante_1234567890

# Url a tener en cuenta: 
1. https://start.spring.io/
2. https://spring.io/tools
3. https://netbeans.apache.org/
4. https://dev.mysql.com/downloads/mysql/
5. https://code.visualstudio.com/download
6. https://www.postman.com/downloads/
7. https://www.thunderclient.com/
8. https://www.jetbrains.com/idea/download/?section=windows
9. http://dia-installer.de/index.html.es
10. https://app.diagrams.net/