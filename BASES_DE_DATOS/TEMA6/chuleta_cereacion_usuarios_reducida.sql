-- Creacion de usuarios 
	CREATE USER 'user1'@'localhost' IDENTIFIED BY '12345';
    
 -- Opciones para la contraseña y bloqueo de usuario
	CREATE USER 'user1'@'localhost' IDENTIFIED BY '12345' PASSWORD EXPIRE;
  	CREATE USER 'user1'@'localhost' IDENTIFIED BY '12345' PASSWORD EXPIRE INTERVAL 30 DAY;
 	CREATE USER 'user1'@'localhost' IDENTIFIED BY '12345' PASSWORD EXPIRE NEVER;
 	CREATE USER 'user1'@'localhost' IDENTIFIED BY '12345' ACCOUNT LOCK/UNLOCK;
    
-- Numero maximo de consultas/conexiones/updates

	CREATE USER 'user1'@'localhost' IDENTIFIED BY '12345' WITH MAX_QUERIES_PER_HOUR 100;
	CREATE USER 'user1'@'localhost' IDENTIFIED BY '12345' WITH MAX_UPDATES_PER_HOUR 100;
	CREATE USER 'user1'@'localhost' IDENTIFIED BY '12345' WITH MAX_CONNECTIONS_PER_HOUR 10;

-- Numero maximo de conexiones sinmultaneas que permite cada usuario

	CREATE USER 'user1'@'localhost' IDENTIFIED BY '12345' WITH MAX_USER_CONNECTIONS 10;
    
-- modificar usuario

	ALTER USER IF EXISTS 'user1'@'localhost' identified by 'password';
	RENAME USER 'user1'@'localhost' to 'user2'@'localhost';
	DROP USER 'user1'@'localhost';
    
-- Asignar privilegios 
	
    GRANT ALL ON * TO 'user1'@'localhost';
	GRANT {permiso} ON {nombreBD}.{nombreTabla} TO 'user1'@'localhost';
    
 -- Asignar/quitar permisos a la columna de una tabla concreta
 
	GRANT {permiso} (columna) on {nombreBD}.{nombreTabla} to 'user1'@'localhost';
	REVOKE {permiso} ON {nombreBD}.{nombreTabla} FROM 'user1'@'localhost';
    
-- TRANSACCIONES

	set @@AUTOCOMMIT=0/1;	-- para variable de sesion
	set @@GLOBAL.AUTOCOCOMMIT=0/1;	-- para valriable gloval
	start transaction;
    commit;
    savepoint 'nombre';
    rollback;
	rollback "nombre del savepoint al que queremos ir";