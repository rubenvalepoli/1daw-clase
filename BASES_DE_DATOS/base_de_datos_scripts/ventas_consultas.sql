use ventas;

-- EJERCICIO 1. Devuelve un listado con todos los pedidos que ha realizado Adela Salas Díaz.

 	-- select p.id from pedido p where p.id_cliente =(select c.id from cliente c where c.nombre = "Adela");

-- EJERCICIO 2. Devuelve el número de pedidos en los que ha participado el comercial Daniel Sáez Vega

	 -- select count(p.id) from pedido p where p.id_comercial = (select c.id from comercial c where c.nombre = "Daniel");

-- EJERCICIO 3. Devuelve un listado de los clientes que no han realizado ningún pedido.

	-- select c.nombre from cliente c where c.id not in (select p.id_cliente from pedido p)

-- EJERCICIO 4. Devuelve un listado con los datos de los clientes y los pedidos, de todos los clientes que han realizado un 
-- pedido durante el año 2017 con un valor mayor o igual al valor medio de los pedidos realizados durante ese mismo año.

	-- select c.nombre, p.id from cliente c inner join pedido p where (p.fecha = "2017") and p.cantidad >= (select avg(p.id) from pedido p);
	-- select * from pedido;


-- EJERCICIO 5. Devuelve la fecha y la cantidad del pedido de menor valor realizado por el cliente Pepe Ruiz Santana.

	-- select p.fecha, p.total from pedido p where p.id_cliente = (select c.id from cliente c where c.nombre = "Pepe") group by p.total having min(p.total)




