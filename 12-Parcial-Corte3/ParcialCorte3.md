# Proyecto:
### El modelo de base de datos es una representación estructurada diseñada para gestionar usuarios y permisos en un sistema. Incluye las entidades user, role, module, view, module_role, module_view, person, user_role y view, con relaciones bien definidas. Estas conexiones permiten asignar roles y permisos a usuarios en módulos y vistas específicos. El diseño proporciona una base eficiente para controlar el acceso y la funcionalidad del sistema, garantizando una gestión efectiva de usuarios y sus respectivos privilegios, así como la definición clara de módulos y vistas en el sistema. 

# Modelo de Base de datos para gestión de usuarios y permisos

El modelo de base de datos es una representación estructurada diseñada para gestionar usuarios y permisos en un sistema. Incluye las siguientes entidades:

1. **User:**
   - Atributos: id, created_at, created_user, deleted_at, deted_user, state, updated_at, updated_user, password, user, person_id.
   - Relaciones: 
      - Se relaciona con Person a través de person_id.

2. **Role:**
   - Atributos: id, created_at, created_user, deleted_at, deted_user, state, updated_at, updated_user, description, name.

3. **Module:**
   - Atributos: id, created_at, created_user, deleted_at, deted_user, state, updated_at, updated_user, description, name, route.

4. **View:**
   - Atributos: id, created_at, created_user, deleted_at, deted_user, state, updated_at, updated_user, description, name, route.

5. **UserRole:**
   - Atributos: id, created_at, created_user, deleted_at, deted_user, state, updated_at, updated_user, role_id, user_id.
   - Relaciones: 
      - Se relaciona con Role a través de role_id.
      - Se relaciona con User a través de user_id.

6. **ModuleRole:**
   - Atributos: id, created_at, created_user, deleted_at, deted_user, state, updated_at, updated_user, module_id, role_id.
   - Relaciones: 
      - Se relaciona con Module a través de module_id.
      - Se relaciona con Role a través de role_id.

7. **ModuleView:**
   - Atributos: id, created_at, created_user, deleted_at, deted_user, state, updated_at, updated_user, module_id, view_id.
   - Relaciones: 
      - Se relaciona con Module a través de module_id.
      - Se relaciona con View a través de view_id.

Estas conexiones permiten asignar roles y permisos a usuarios en módulos y vistas específicos. El diseño proporciona una base eficiente para controlar el acceso y la funcionalidad del sistema, garantizando una gestión efectiva de usuarios y sus respectivos privilegios, así como la definición clara de módulos y vistas en el sistema.

# Ejercicios planteados.

# Ejercicio 1: listar vistas y módulos por rol

Se desea obtener la lista de vistas a las que un rol tiene acceso, mostrando también a qué módulo pertenece cada vista y el estado tanto de la vista como del módulo. para ello, el sistema debe recibir como parámetro el nombre del rol tal cual aparece en el registro de role.name. La información solicitada debe presentarse en las siguientes columnas:

- vista
- estado de la vista
- módulo
- estado del módulo

# Ejercicio 2: detalle de usuarios y roles por módulo

Se pretende obtener un detalle de usuarios y los roles asignados a cada uno en un módulo específico. Se solicita que el sistema reciba como parámetro el nombre del módulo (module.name) y devuelva la siguiente información:

- usuario
- rol
- estado del usuario
- estado del rol

# Ejercicio 3: usuarios sin roles asignados

El objetivo es identificar a los usuarios que no tienen roles asignados en el sistema. Se requiere que el sistema devuelva una lista de usuarios y sus respectivos estados, excluyendo aquellos que tengan roles asociados. La información solicitada debe presentarse en las siguientes columnas:

- usuario
- estado del usuario

# Ejercicio 4: detalle de roles y usuarios por vista

El propósito es obtener un detalle de roles y los usuarios asignados a cada uno en una vista específica. Se solicita que el sistema reciba como parámetro el nombre de la vista (view.name) y devuelva la siguiente información:

- rol
- usuario
- estado del rol
- estado del usuario

# Ejercicio 5: módulos activos y sus vistas

Se busca obtener la lista de módulos activos en el sistema y las vistas asociadas a cada uno. El sistema debe devolver la información en las siguientes columnas:

- módulo
- estado del módulo
- vista
- estado de la vista

# Ejercicio 6: usuarios con roles específicos

Se desea conocer la lista de usuarios que tienen roles específicos en el sistema. El sistema debe recibir como parámetro el nombre del rol (role.name) y devolver la siguiente información:

- usuario
- estado del usuario

# Ejercicio 7: vistas sin asignación de módulo

El objetivo es identificar las vistas que no están asignadas a ningún módulo en el sistema. Se requiere que el sistema devuelva una lista de vistas y sus respectivos estados, excluyendo aquellas que estén asociadas a un módulo. la información solicitada debe presentarse en las siguientes columnas:

- vista
- estado de la vista

# Ejercicio 8: usuarios con roles inactivos

Se pretende obtener la lista de usuarios que tienen roles inactivos en el sistema. El sistema debe devolver la información en las siguientes columnas:

- usuario
- rol
- estado del usuario
- estado del rol

# Ejercicio 9: roles agrupados por estado

Se desea obtener un listado de roles agrupados por su estado en el sistema. La información solicitada debe presentarse en las siguientes columnas:

- estado del rol
- cantidad de roles

# Ejercicio 10: vistas ordenadas por módulo

se busca obtener una lista de vistas ordenadas alfabéticamente por el nombre del módulo al que pertenecen. La información solicitada debe presentarse en las siguientes columnas:

- vista
- módulo
- estado de la vista


# Ejercicio 11: detalle completo de usuarios y roles por módulo

Se pretende obtener un detalle completo de usuarios y los roles asignados a cada uno en un módulo específico, incluyendo información adicional de los roles y vistas asociadas. Se solicita que el sistema reciba como parámetro el nombre del módulo (module.name) y devuelva la siguiente información:

- usuario + nombre de la persona
- rol
- estado del usuario
- estado del rol
- vista
- estado de la vista

# Ejercicio 12: información completa de usuarios y sus módulos, roles y vistas asociadas

Se desea obtener información completa sobre los usuarios, incluyendo los módulos, roles y vistas asociadas. El sistema debe proporcionar una consulta que involucre todas las tablas del sistema. la información solicitada debe presentarse de la siguiente manera:

- usuario: nombre de la persona y nombre de usuario.
- estado del usuario.
- módulo: nombre y descripción.
- rol: nombre y descripción.
- vista: nombre, descripción y ruta.
- estado del módulo.
- estado del rol.
- estado de la vista.


# El ejercicio debe llevarse a cabo siguiendo las pautas establecidas. Para lograrlo, el estudiante deberá desarrollar el servicio que posibilite la obtención de información conforme al planteamiento de cada ejercicio.

1. **List Views and Modules by Role**
   - Name: `list-views-modules-by-role`

2. **User and Role Details by Module**
   - Name: `user-role-details-by-module`

3. **Users without Assigned Roles**
   - Name: `users-without-roles`

4. **Role and User Details by View**
   - Name: `role-user-details-by-view`

5. **Active Modules and Associated Views**
   - Name: `active-modules-and-views`

6. **Users with Specific Roles**
   - Name: `users-with-specific-roles`

7. **Views without Module Assignment**
   - Name: `views-without-module-assignment`

8. **Users with Inactive Roles**
   - Name: `users-with-inactive-roles`

9. **Roles Grouped by Status**
   - Name: `roles-grouped-by-status`

10. **Views Ordered by Module**
    - Name: `views-ordered-by-module`

11. **Complete User and Role Details by Module**
    - Name: `complete-user-role-details-by-module`

12. **Complete Information of Users and Their Modules, Roles, and Views**
    - Name: `complete-user-information-modules-roles-views`



# Asignación

