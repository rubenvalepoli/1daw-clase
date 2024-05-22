-- EJERCICIO 1. Crea un usuario 'admin' con contraseña 'password' y permisos para acceder y
 -- administrar todas las bases de datos.
 
	CREATE USER admin1@localhost identified BY 'password';
    Grant all on *.* to admin@localhost;
    
-- EJERCICIO 2. Concede los privilegios SELECT, INSERT, UPDATE y DELETE sobre todas las
-- tablas de la base de datos 'jardineria' al usuario 'admin    
    
    grant select, insert, update, delete on jardineria.* to admin@localhost;
    
-- EJERCICIO 3. Cambia la contraseña del usuario 'admin' a 'newpassword'.

	Alter user admin1@localhost identified BY 'newpassword';

-- EJERCICIO 4. Otorga el privilegio de modificación de tablas al usuario 'admin' sobre la tabla
-- 'producto'.

	    grant update on jardineria.producto to admin@localhost;

-- EJERCICIO 5. Elimina el privilegio de borrado sobre la tabla 'cliente' al usuario 'admin':

	REVOKE delete on jardineria.cliente from admin@localhost;

-- EJERCICIO 6. Crea un nuevo usuario 'analista' con contraseña 'securepass' y permisos solo
-- para acceder a la tabla 'pedido'

	
	CREATE USER analista1@localhost identified BY 'securepass';
    Grant select on jardineria.pedido to analista1@localhost;

-- EJERCICIO 7. Establece la caducidad de la contraseña del usuario 'analista' para que expire en
-- 90 días.

	Alter USER 'analista1'@'localhost' PASSWORD EXPIRE INTERVAL 90 DAY;
    
-- EJERCICIO 8. Concede al usuario 'analista' permisos para SELECT y UPDATE en la columna
-- 'estado' de la tabla 'pedido'.

	Grant select,update (estado) on jardineria.pedido to analista1@localhost;

-- EJERCICIO 9. Elimina al usuario 'analista' el privilegio de actualización sobre la columna
-- 'fecha_entrega' de la tabla 'pedido.

	revoke update (fecha_entrega) on jardineria.pedido from analista1@localhost;

-- EJERCICIO 10. Crea un usuario 'cliente1' con contraseña 'clientpass' y permisos solo para
-- acceder y modificar sus propios pagos

	CREATE USER cliente1@localhost identified BY 'clientpass';
    Grant select,update on jardineria.pagos to analista1@localhost where codigo_cliente=current_user();

-- EJERCICIO 11. Bloquea la cuenta del usuario 'cliente1'.

	Alter user cliente1@localhost account Lock;
    
-- EJERCICIO 12. Desbloquea la cuenta del usuario 'cliente1'

	Alter user cliente1@localhost account unlock;

-- EJERCICIO 13. Elimina al usuario 'cliente1' todos los privilegios sobre la tabla 'pago;

	revoke select, update, delete, insert on jardineria.pago from cliente1@localhost;

-- EJERCICIO 14. Crear un usuario 'vendedor' con contraseña 'salespass' y permisos para
-- acceder y administrar todas las tablas excepto 'detalle_pedido'

	create user vendedor1@localhost identified by 'salespass';
    grant select, update, delete, insert on jardineria.* to vendedor@localhost;
    revoke select, update, delete, insert on jardineria.detalle_pedido from vendedor@localhost;

-- EJERCICIO 15. Conceder al usuario 'vendedor' permisos para SELECT, INSERT y UPDATE
-- sobre la tabla 'pedido'.

    grant select, update, insert on jardineria.pedido to vendedor@localhost;
