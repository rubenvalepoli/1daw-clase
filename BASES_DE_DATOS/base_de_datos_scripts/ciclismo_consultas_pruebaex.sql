-- use ciclismo2;
-- EJ1
-- select nombre, edad from ciclista where edad>20;

-- EJ2

-- select nombre,nomeq from ciclista where nomeq="Kelme";

-- EJ3

-- select p.nompuerto, e.netapa, e.km from puerto p, etapa e where p.netapa = e.netapa; 

-- EJ4

-- select nombre, edad, nomeq from ciclista where (edad between "25" and "30") && (nomeq = "Kelme") or (nomeq = "Banesto");

-- EJ5

-- select e.nomeq, e.director from equipo e,ciclista c where (c.edad > 33) and (e.nomeq = c.nomeq);

-- EJ 6

-- select c.nombre, c.nomeq from ciclista c,etapa e where (c.edad < 30) and (c.dorsal = e.dorsal);

-- EJ 7

 -- select c.nombre, c.nomeq from ciclista c,puerto p where (c.edad > 32) and (c.dorsal = p.dorsal);

-- EJ 8

 -- select c.nombre, c.nomeq, m.color from ciclista c,etapa e,maillot m,llevar l where(c.dorsal = e.dorsal) and (l.codigo = m.codigo) and (e.netapa = l.netapa) and (m.color = "Amarillo");

-- EJ 9

-- select p.altura, e.salida, e.llegada from puerto p, etapa e where (p.altura > 1300) and (p.netapa = e.netapa);

-- EJ11

select min(edad), max(edad), avg(edad) from ciclista;


 





