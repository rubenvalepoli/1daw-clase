use coches;

-- select * from CLIENTE where (ciudad = "madrid");

-- select nombre from MARCA order by(nombre)asc;

-- select cifc, cantidad from DISTRIBUCION where (cantidad > 18);  

-- select cifc, cantidad from DISTRIBUCION where (cantidad between 10 and 18);   

-- select cifc from DISTRIBUCION where (cantidad > 5) or (cantidad <10);

-- select m.cifm, c.cifcl from MARCA m, CLIENTE c where (m.ciudad = c.ciudad); 


-- select m.cifm, c.cifcl from MARCA m, CLIENTE c where (m.ciudad != c.ciudad); 


-- select d.codcoche, c.ciudad from CONCESIONARIO c, DISTRIBUCION d where (c.ciudad = "Barcelona") and (c.cifc = d.cifc);

-- select v.codcoche from VENTA v, CLIENTE c where (c.ciudad = "Madrid") and (c.cifcl = v.cifcl);


