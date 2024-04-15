-- 1. Seleccionamos la base de datos
USE test;

-- 2. Configuramos que en esta sesión vamos a utilizar el nivel de aislamiento READ UNCOMMITTED
-- SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;
-- SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED;
-- SET SESSION TRANSACTION ISOLATION LEVEL REPEATABLE READ;
 SET SESSION TRANSACTION ISOLATION LEVEL SERIALIZABLE;

-- 3. Iniciamos una transacción y observamos los datos que existen en la tabla cuentas
START TRANSACTION;
SELECT * FROM cuentas WHERE id = 1;

-- 4. Observamos los datos que existen en la tabla cuentas
   SELECT * FROM cuentas WHERE id = 1;