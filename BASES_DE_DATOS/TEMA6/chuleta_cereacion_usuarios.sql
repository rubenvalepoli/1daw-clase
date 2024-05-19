-- Creacion de usuarios 
	CREATE USER 'nombre usuario' IDENTIFIED BY '12345';
       
-- modificar usuario

	ALTER USER IF EXISTS user1@localhost identified by 'password';
    
-- renombrar usuario 

	RENAME USER user1@localhost to usuario1@localhost;

-- borrar un usuario

	DROP USER user1@localhost;
    
 -- Obligando a que el usuario cambie de contraseña al proximo inicio de sesión.
	CREATE USER 'nombre usuario' IDENTIFIED BY '12345' PASSWORD EXPIRE;
       
-- Obligamos a cambiar la contraseña cada cierto número de días
   	CREATE USER 'nombre usuario' IDENTIFIED BY '12345' PASSWORD EXPIRE INTERVAL 30 DAY;
  	CREATE USER 'nombre usuario' IDENTIFIED BY '12345' PASSWORD EXPIRE NEVER;
 	CREATE USER 'nombre usuario' IDENTIFIED BY '12345' ACCOUNT LOCK/UNLOK;
    
-- Numero maximo de consultas por hora
	CREATE USER 'nombre usuario' IDENTIFIED BY '12345' WITH MAX_QUERIES_PER_HOUR 100;
    
-- Numero maximo de actualizaciones por hora
	CREATE USER 'nombre usuario' IDENTIFIED BY '12345' WITH MAX_UPDATES_PER_HOUR 100;
    
-- Numero maximo de conexiones por hora
	CREATE USER 'nombre usuario' IDENTIFIED BY '12345' WITH MAX_CONNECTIONS_PER_HOUR 10;

-- Numero maximo de conexiones sinmultaneas que permite cada usuario
	CREATE USER 'nombre usuario' IDENTIFIED BY '12345' WITH MAX_USER_CONNECTIONS 10;
    
-- Asignar permisos 

	GRANT {permiso} ON {nombreBAdeDeDatos}.{nombreDeTabla} TO {usuario};
        
 -- Asignar permisos a la columna de una tabla concreta
 
	Grant select,update (estado) on jardineria.pedido to analista1@localhost;

 -- Borrar privilegios

	REVOKE {permiso} ON {nombreBAdeDeDatos}.{nombreDeTabla} FROM {usuario};
    
---------------------------------------------------------------------------

-- TRANSACCIONES

	start transaction;
	set AUTOCOMMIT=0;
    commit;
    savepoint 'nombre';
    rollback;
	rollback "nombre del saabe point al que queremos ir";

    



