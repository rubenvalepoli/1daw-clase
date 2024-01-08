-- use ciclismo2;


-- nos enseña todo lo que hay dentro de ciclista

	-- select * from ciclista; 

-- EJERCICIO 1. Obtener el nombre del ciclista que tiene más de 20 años.

	-- select nombre, edad from ciclista where edad > 20; -- muestra el nombre y la edad de los ciclistas mayores de 20 años

	-- select nombre, edad from ciclista where (edad > 30) and (edad < 35); -- muestra el nombre y la edad de los ciclistas mayores de 30 años y menores de 35

-- EJERCICIO 2. Nombre de los ciclistas que pertenezcan a ‘Kelme’.

	-- select nombre from ciclista where (nomeq = "Kelme");

-- EJERCICIO 3. Obtener el nombre de cada puerto indicando el número (netapa) y los kilómetros de la etapa en la que se encuentra el puerto.

	-- select p.nompuerto, e.netapa, e.km from puerto p, etapa e; 


