use ciclismo2;

-- EJERCICIO 1. Obtener el dorsal y el nombre de los ciclistas que hayan ganado alguna etapa, mostrando el número de etapas que han ganado.

	-- select c.dorsal, c.nombre,count(e.netapa) from ciclista c inner join etapa e on c.dorsal = e.dorsal group by c.dorsal;

-- EJERCICIO 2. Obtener el nombre y la edad de los ciclistas que han llevado dos o más maillots en una misma etapa.

	-- select c.nombre, c.edad, count(l.codigo) from ciclista c inner join llevar l on c.dorsal =  l.dorsal group by c.dorsal, l.netapa having count(distinct l.codigo)>=2;

-- EJERCICIO 3. Obtener el nombre de los equipos que tengan más de 5 ciclistas.

	-- select c.nomeq from ciclista c group by c.nomeq having count(c.dorsal)>5;
	-- select c.nomeq from ciclista c group by c.dorsal having (count(c.nomeq) >= 5);

-- EJERCICIO 4. Obtener el nombre de los ciclistas que han ganado más de un puerto.

	-- select c.nombre from ciclista c inner join puerto p on c.dorsal = p.dorsal group by c.nombre having(count(p.dorsal) > 1);

-- EJERCICIO 5. Obtener el valor del atributo netapa de aquellas etapas tales que todos los puertos que están en ellas tienen más de 700 metros de altura.

   	-- select e.netapa from etapa e inner join puerto p on e.netapa = p.netapa group by p.netapa having min(p.altura >700);


