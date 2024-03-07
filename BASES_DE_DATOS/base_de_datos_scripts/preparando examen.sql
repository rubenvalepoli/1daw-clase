-- use coches;


-- update CLIENTE set fechanacimiento = '1896-10-24' where (cifcl = 5);

-- insert into CLIENTE (cifcl,nombre,apellidos,ciudad,fechanacimiento) values (7,"Sole","Reyes","Cordoba","1973-07-02");

-- delete from CLIENTE where (cifcl = 7);

-- select * from CLIENTE where (ciudad = "Madrid"); 

-- select c.nombre from COCHE c where c.nombre like ("%a%") group by nombre order by nombre desc ;

-- select nombre as marca from COCHE where codcoche between 2 and 8;

-- select * from CLIENTE;



use ciclismo2;

-- show tables;

-- desc llevar;

-- select * from ciclista;

-- select nombre from ciclista where (edad > 20);

-- select nombre from ciclista where (nomeq = 'Kelme');

-- select p.nompuerto, e.netapa, e.km from puerto p, etapa e where (p.netapa = e.netapa);

-- select distinct nomeq from ciclista;

-- select c.nombre, c.dorsal, e.netapa from ciclista c, etapa e where c.dorsal like("%5%") and (c.dorsal = e.dorsal) and e.netapa between 4 and 11 ; 

-- select nompuerto, pendiente from puerto order by pendiente asc;

-- select reverse(nompuerto), categoria from puerto where (categoria = 1) group by nompuerto having nompuerto like("%e%");

select c.nombre, c.dorsal, e.netapa from ciclista c, etapa e group by llegada having  llegada > 50 ;

select * from etapa;




