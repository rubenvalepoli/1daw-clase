-- Nombre:Rubén Valero Policarpo.
-- Tipo de examen: A.

-- use ciclismo2;

-- EJERCICIO 1

	-- select e.nomeq, e.director, avg (c.edad) from equipo e, ciclista c where (c.edad >31) and (c.nomeq = e.nomeq);

-- EJERCICIO 2

	-- select reverse(e.llegada) as "transformacion1", substring(e.salida,3,3) as "transformacion2" from etapa e where e.salida like ("%a%") and e.llegada like ("%a%");

-- EJERCICIO 3
     
    -- select upper(replace(color,"a","aaa"))from maillot where (color != 'Rojo') && (color != 'Verde') order by (color) desc ; 

-- EJERCICIO 4

	-- select distinct (c.nombre) from ciclista c, llevar l, maillot m where (m.color = "rosa") and c.nombre like("%i%") and (c.dorsal = l.dorsal) and (l.codigo = m.codigo);

-- EJERCICIO 5

	-- select * from equipo;
	 -- update equipo set director = "ruben" where nomeq = "Wordperfect";
    
-- EJERCICIO 6

	-- select * from ciclista;
	-- insert into ciclista(dorsal,nombre,nomeq) values (1111,'ruben',"Wordperfect");

-- EJERCICIO 7
	-- select * from ciclista;
	-- delete from ciclista where (dorsal = 1111);

