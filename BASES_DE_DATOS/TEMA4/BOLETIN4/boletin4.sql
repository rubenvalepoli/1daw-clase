use ciclismo2;

-- EJERCICIO 1. Obtener el dorsal y el nombre de los ciclistas que hayan ganado alguna etapa, mostrando el número de etapas que han ganado.

	-- select c.dorsal, c.nombre,count(e.netapa) from ciclista c inner join etapa e on c.dorsal = e.dorsal group by c.dorsal;

-- EJERCICIO 2. Obtener el nombre y la edad de los ciclistas que han llevado dos o más maillots en una misma etapa.

-- FALTA
 -- select c.nombre, c.edad from ciclista c inner join llevar l on c.dorsal =  l.dorsal ;

-- EJERCICIO 3. Obtener el nombre de los equipos que tengan más de 5 ciclistas.

	-- select c.nomeq from ciclista c inner join equipo e on c.nomeq = e.nomeq group by e.nomeq having (count(c.nomeq) >= 5);
	-- select c.nomeq from ciclista c group by c.nomeq having (count(c.nomeq) >= 5);

-- EJERCICIO 4. Obtener el nombre de los ciclistas que han ganado más de un puerto.

	-- select c.nombre from ciclista c inner join puerto p on c.dorsal = p.dorsal group by c.nombre having(count(p.dorsal) > 1);

-- EJERCICIO 5. Obtener el valor del atributo netapa de aquellas etapas tales que todos los puertos que están en ellas tienen más de 700 metros de altura.

	-- select distinct e.netapa from etapa e inner join puerto p on e.netapa = p.netapa where (p.altura > 700);

