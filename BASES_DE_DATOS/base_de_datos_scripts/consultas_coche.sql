 use coches;

-- EJERCICIO 1. Obtener los datos de todos los clientes de Madrid.

	-- select ciudad,nombre,apellidos,cifcl from CLIENTE where (ciudad = "madrid");

-- EJERCICIO 2. Obtener los nombres de todas las marcas de coches ordenadas alfabéticamente.

	-- select nombre from MARCA order by nombre;

-- EJERCICIO 3. Obtener el identificador de todos los concesionarios cuya cantidad de coches distribuida sea mayor que 18.

	-- select d.cantidad, c.cifc from DISTRIBUCION d, CONCESIONARIO c where (cantidad > 17);

-- EJERCICIO 4. Obtener el identificador de todos los concesionarios cuya cantidad de coches distribuida esté comprendida entre 10 y 18, ambos inclusive.

	-- select c.cifc, d.cantidad from DISTRIBUCION d, CONCESIONARIO c where (cantidad >9) and (cantidad < 19);

-- EJERCICIO 5. Obtener el identificador de todos los concesionarios cuya cantidad distribuida está comprendida entre 10 y 18, ambos incluidos.

	-- select c.cifc, d.cantidad from DISTRIBUCION d, CONCESIONARIO c where (cantidad >9) and (cantidad < 19);

-- EJERCICIO 6. Obtener el identificador de los concesionarios que han adquirido más de 10 coches de algún tipo, o menos de 5 (como se indica, de un tipo, no en total).

	-- select c.cifc, d.cantidad from DISTRIBUCION d, CONCESIONARIO c where (d.cantidad < 6)or (d.cantidad > 9) and (c.cifc = d.cifc);

-- EJERCICIO 7. Obtener todas las parejas de identificadores de marcas y clientes que sean de la misma ciudad.

	-- select m.cifm, c.cifcl from MARCA m, CLIENTE c where (c.ciudad = m.ciudad);

-- EJERCICIO 8. Obtener todas las parejas de identificadores de clientes y marcas que no sean de la misma ciudad.

	-- select m.cifm, c.cifcl from MARCA m, CLIENTE c where (c.ciudad != m.ciudad);

-- EJERCICIO 9. Obtener los códigos de los coches distribuidos por algún concesionario de Barcelona.

	-- select d.codcoche, c.ciudad from DISTRIBUCION d, CONCESIONARIO c where (ciudad = "barcelona")

-- EJERCICIO 10. Obtener el código de los coches vendidos a clientes de Madrid.

	-- select c.codcoche, a.ciudad, c.nombre from COCHE c, CLIENTE a, VENTA v where (a.ciudad = "madrid") and (v.codcoche = c.codcoche) and (a.cifcl = v.cifcl);
