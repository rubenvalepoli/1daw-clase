-- 1. Crea un usuario llamado tunombre_vuelo con la contraseña vuelo123

	create user 'ruben_vuelo'@'localhost' identified by 'vuelo123';
    
-- 2. Concede al usuario tunombre_vuelo permisos de SELECT e INSERT en la tabla vuelos.

	grant select, insert on aeropuerto.vuelos to ruben_vuelo@localhost;

-- 3. Crea un rol llamado gestor con permisos de SELECT y UPDATE en la tabla clientes.

	create role gestor;
    grant select, update on aeropuerto.clientes to gestor;

-- 4. Asigna este rol al usuario tunombre_vuelo.

	grant gestor to ruben_vuelo@localhost;

-- 5. Elimina todos los permisos asignados al usuario tunombre_vuelo.

	revoke select, insert, update on aeropuerto.* from ruben_vuelo@localhost;
    
-- 6. Elimina al usuario tunombre_vuelo

	drop user ruben_vuelo@localhost;

