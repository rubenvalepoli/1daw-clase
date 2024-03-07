-- use ciclismo2;


-- nos enseña todo lo que hay dentro de ciclista

	-- select * from ciclista; 

-- EJERCICIO 1. Obtener el nombre del ciclista que tiene más de 20 años.

	-- select nombre, edad from ciclista where edad > 20; -- muestra el nombre y la edad de los ciclistas mayores de 20 años

	-- select nombre, edad from ciclista where (edad > 30) and (edad < 35); -- muestra el nombre y la edad de los ciclistas mayores de 30 años y menores de 35

-- EJERCICIO 2. Nombre de los ciclistas que pertenezcan a ‘Kelme’.

	-- select nombre from ciclista where (nomeq = "Kelme");

-- EJERCICIO 3. Obtener el nombre de cada puerto indicando el número (netapa) y los kilómetros de la etapa en la que se encuentra el puerto.

	-- select p.nompuerto, e.netapa, e.km from puerto p, etapa e where (e.netapa = p.netapa); 
    
    
-- EJERCICIO 4. Nombre de aquellos ciclistas que tengan una edad entre 25 y 30 años y que pertenezcan a los equipos Kelme y Banesto.

	-- select nombre, edad, nomeq from ciclista where ((edad > 24) and (edad < 31)) and((nomeq = "Kelme") or (nomeq = "Banesto"));

-- EJERCICIO 5. Obtener el nombre y el director de los equipos a los que pertenezca algún ciclista mayor de 33 años.

	-- select e.nomeq, e.director from equipo e, ciclista c where (edad > 33);
    
-- EJERCICIO 6. Obtener el nombre y el equipo de los ciclistas menores de 30 años que hayan ganado alguna etapa.

	-- select distinct c.nombre, c.nomeq, c.edad, e.dorsal from ciclista c, etapa e where (edad < 31) and (c.dorsal = e.dorsal);

-- EJERCICIO 7. Obtener el nombre y el equipo de los ciclistas mayores de 32 años que hayan ganado algún puerto.

 	-- select distinct c.nombre, c.nomeq, c.edad, p.dorsal from ciclista c, puerto p where (edad > 31) and (c.dorsal = p.dorsal);

-- EJERCICIO 8. Obtener el nombre y el equipo de los ciclistas que han ganado alguna etapa llevando el maillot amarillo, mostrando tambien el numero de etapa

	 select distinct c.nombre, c.nomeq, e.netapa, m.color from ciclista c, etapa e, maillot m, llevar l where (m.color = "amarillo") and (m.codigo = l.codigo) and (e.netapa = l.netapa) and (c.dorsal = e.dorsal);
    
-- EJERCICIO 9. Obtener las poblaciones de salida y de llegada de las etapas donde se encuentran puertos con altura superior a 1300 metros

	-- select e.salida, e.llegada, p.altura from etapa e, puerto p where (e.netapa = p.netapa);
    
-- EJERCICIO 10. Obtener la edad media de los ciclistas que han ganado alguna etapa.

	-- select AVG(c.edad) from ciclista c, etapa e where (c.dorsal = e.dorsal);
    
-- EJERCICIO 11. Obtener la edad del ciclista más joven, la del más veterano y la edad media de los ciclistas que han participado en la vuelta.

	-- select max(edad), min(edad), avg(edad) from ciclista; 
    