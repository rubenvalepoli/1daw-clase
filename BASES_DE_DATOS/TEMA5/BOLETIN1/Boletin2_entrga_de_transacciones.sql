/*
DROP DATABASE IF EXISTS test;
CREATE DATABASE test CHARACTER SET utf8mb4;
USE test;

CREATE TABLE cliente (
    id INT UNSIGNED PRIMARY KEY,
    nombre CHAR (20)
);

START TRANSACTION;
INSERT INTO cliente VALUES (1, 'Pepe');
COMMIT;


-- 1. ¿Qué devolverá esta consulta?
-- Deveria devolver MAria y juan sin pepe


SELECT *
FROM cliente;

SET AUTOCOMMIT=0;
INSERT INTO cliente VALUES (2, 'Maria');
INSERT INTO cliente VALUES (20, 'Juan');
DELETE FROM cliente WHERE id = 1;


-- 2. ¿Qué devolverá esta consulta?
-- Deveria devolver pepe

SELECT *
FROM cliente;

ROLLBACK;

-- 3. ¿Qué devolverá esta consulta?
-- devuelve todos los datos de cliente 

SELECT *
FROM cliente;
*/

/*
DROP DATABASE IF EXISTS test;
CREATE DATABASE test CHARACTER SET utf8mb4;
USE test;

CREATE TABLE producto (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE
);

INSERT INTO producto (id, nombre) VALUES (1, 'Primero');
INSERT INTO producto (id, nombre) VALUES (2, 'Segundo');
INSERT INTO producto (id, nombre) VALUES (3, 'Tercero');

-- 1. Comprobamos las filas que existen en la tabla
SELECT *
FROM producto;

-- 2. Ejecutamos una transacción que incluye un SAVEPOINT
START TRANSACTION;
INSERT INTO producto (id, nombre) VALUES (4, 'Cuarto');
SAVEPOINT sp1;
INSERT INTO producto (id, nombre) VALUES (5, 'Cinco');
INSERT INTO producto (id, nombre) VALUES (6, 'Seis');
ROLLBACK TO sp1;

-- 3. ¿Qué devolverá esta consulta?
-- Primero, segundo, tercero y cuarto y cinco y seis no porque hemos hecho un roll back de sp1 que era un sabepoint
SELECT *
FROM producto;
*/

-- select @@GLOBAL.transaction_isolation;
-- select @@autocommit;
-- SET AUTOCOMMIT=0;


-- 6.7.1


DROP DATABASE IF EXISTS test;
CREATE DATABASE test CHARACTER SET utf8mb4;
USE test;

CREATE TABLE cuentas (
    id INTEGER UNSIGNED PRIMARY KEY,
    saldo DECIMAL(11,2) CHECK (saldo >= 0)
);

INSERT INTO cuentas VALUES (1, 1000);
INSERT INTO cuentas VALUES (2, 2000);
INSERT INTO cuentas VALUES (3, 0);

-- 1. Configuramos que en esta sesión vamos a utilizar el nivel de aislamiento READ UNCOMMITTED
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;
-- SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED;
 -- SET SESSION TRANSACTION ISOLATION LEVEL REPEATABLE READ;
 -- SET SESSION TRANSACTION ISOLATION LEVEL SERIALIZABLE;


-- 2. Ejecutamos una transacción para transfereir dinero entre dos cuentas
START TRANSACTION;
UPDATE cuentas SET saldo = saldo - 100 WHERE id = 1;
   SELECT * FROM cuentas WHERE id = 1;
-- 3. Deshacemos las operaciones realizadas en la transacción
     ROLLBACK;


