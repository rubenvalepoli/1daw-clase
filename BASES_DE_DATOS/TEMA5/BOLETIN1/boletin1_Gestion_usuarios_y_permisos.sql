use jardineria;

-- EJERCICIO 1. Crea un usuario 'admin' con contraseña 'password' y permisos para acceder y administrar todas las bases de datos.;
	 create user 'admin'@'localhost' identified by 'password';
     grant all on *.* to admin@localhost;

-- EJERCICIO 2. Concede los privilegios SELECT, INSERT, UPDATE y DELETE sobre todas las tablas de la base de datos 'jardineria' al usuario 'admin'

	-- grant select,insert,update,delete on jardineria.* to admin@localhost;

-- EJERCICIO 3. Cambia la contraseña del usuario 'admin' a 'newpassword'.

	-- alter user if exists admin@localhost identified by 'newpassword';

-- EJERCICIO 4. Otorga el privilegio de modificación de tablas al usuario 'admin' sobre la tabla 'producto'.

	-- grant update on jardineria.producto to admin@localhost;

-- EJERCICIO 5. Elimina el privilegio de borrado sobre la tabla 'cliente' al usuario 'admin':

	-- REVOKE delete ON jardineria.cliente FROM admin@localhost;

-- EJERCICIO 6. Crea un nuevo usuario 'analista' con contraseña 'securepass' y permisos solo para acceder a la tabla 'pedido'.
-- EJERCICIO 7. Establece la caducidad de la contraseña del usuario 'analista' para que expire en 90 días.
-- EJERCICIO 8. Concede al usuario 'analista' permisos para SELECT y UPDATE en la columna 'estado' de la tabla 'pedido'.
-- EJERCICIO 9. Elimina al usuario 'analista' el privilegio de actualización sobre la columna 'fecha_entrega' de la tabla 'pedido.
-- EJERCICIO 10. Crea un usuario 'cliente1' con contraseña 'clientpass' y permisos solo para acceder y modificar sus propios pagos.
-- EJERCICIO 11. Bloquea la cuenta del usuario 'cliente1'.
-- EJERCICIO 12. Desbloquea la cuenta del usuario 'cliente1'.
-- EJERCICIO 13. Elimina al usuario 'cliente1' todos los privilegios sobre la tabla 'pago':
-- EJERCICIO 14. Crear un usuario 'vendedor' con contraseña 'salespass' y permisos para acceder y administrar todas las tablas excepto 'detalle_pedido'
-- EJERCICIO 15. Conceder al usuario 'vendedor' permisos para SELECT, INSERT y UPDATE sobre la tabla 'pedido'.