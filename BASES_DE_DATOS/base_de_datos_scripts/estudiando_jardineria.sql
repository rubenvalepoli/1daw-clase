use jardineria;

-- EJERCICIO 1. Devuelve el nombre del cliente con mayor límite de crédito. Indica dos manera de resolverlo.

	-- select c.nombre_cliente from cliente c where c.limite_credito = (select max(c.limite_credito) from cliente c);

	-- select c.nombre_cliente from cliente c where c.limite_credito in (select max(c.limite_credito) from cliente c);

-- EJERCICIO 2. Devuelve el producto que menos unidades tiene en stock. Indica dos maneras de resolverlo.

	-- select p.nombre from producto p where p.cantidad_en_stock = (select min(p.cantidad_en_stock) from producto p);
	
    -- select p.nombre from producto p where p.cantidad_en_stock in (select min(p.cantidad_en_stock) from producto p);
    
-- EJERCICIO 3. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto Soria.

	-- select e.nombre, e.apellido1, e.apellido2, e.email from empleado e where e.codigo_jefe = (select e.codigo_empleado from empleado e where e.nombre = "Alberto" and e.apellido1 = "Soria");

-- EJERCICIO 4. Devuelve el nombre, apellido1 y puesto de los empleados que no representen a ningún cliente.

	-- select e.nombre, e.apellido1, e.apellido2, e.email from empleado e where e.codigo_empleado not in (select c.codigo_empleado_rep_ventas from cliente c);

    
-- EJERCICIO 5. Devuelve un listado que muestre solamente los clientes que sí han realizado algún pago.

	-- select c.nombre_cliente from cliente c where c.codigo_cliente in (select p.codigo_cliente from pago p);

-- EJERCICIO 6. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas de algún cliente que haya realizado la compra de algún producto de la gama Frutales.

	-- select o.* from oficina o where o.codigo_oficina not in 
    -- (select e.codigo_oficina from empleado e where e.codigo_empleado in 
    -- (select c.codigo_empleado_rep_ventas from cliente c inner join pedido p on 
    -- (c.codigo_cliente = p.codigo_cliente) inner join detalle_pedido d on 
    -- (p.codigo_pedido = d.codigo_pedido) inner join producto pr on 
    -- (pr.codigo_producto = d.codigo_producto) where pr.gama like "Frutales"));
    
-- EJERCICIO 7. Devuelve un listado con los clientes que han realizado algún pedido pero no han realizado ningún pago.

	-- select c.nombre_cliente from cliente c where c.codigo_cliente in (select p.codigo_cliente from pedido p) and c.codigo_cliente not in (select pa.codigo_cliente from pago pa);

-- EJERCICIO 8. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.

	-- select distinct p.nombre from producto p where p.codigo_producto in (select d.codigo_producto from detalle_pedido d);

-- EJERCICIO 9. Devuelve el listado de clientes indicando el nombre del cliente y cuántos pedidos ha realizado. Tenga en cuenta que pueden existir clientes que no han realizado ningún pedido.

	-- select c.nombre_cliente, count(p.codigo_pedido) from cliente c inner join pedido p on (c.codigo_cliente = p.codigo_cliente) group by c.codigo_cliente;

-- EJERCICIO 10. Devuelve el nombre de los clientes que hayan hecho pedidos en 2008 ordenados alfabéticamente.

	-- select distinct c.nombre_cliente from cliente c inner join pedido p on (c.codigo_cliente = p.codigo_cliente) where (p.fecha_pedido like "2008%") order by c.nombre_cliente asc;



-- ESTUDIANDO

-- 1. Encontrar los nombres de los clientes que han realizado pedidos con un valor total superior a 50€ y que además viven en la ciudad de Madrid.

	-- select c.nombre_cliente from cliente c inner join pago p on (c.codigo_cliente = p.codigo_cliente) where (p.total > 50) and (c.ciudad like "Madrid");

-- 2. Listar los productos que se han vendido en al menos dos pedidos diferentes.

-- 	select d.codigo_producto from detalle_pedido d where exists 
--    (select d.codigo_pedido from detalle_pedido d
--    group by d.codigo_producto having count(d.codigo_producto)>= 2);

-- 3. Mostrar el nombre del cliente y el total de su pedido para cada pedido realizado en el año 2023.

	

-- 4. Obtener el nombre del empleado que ha vendido la mayor cantidad de productos en total.

-- 5. Listar los nombres de los clientes que han realizado pedidos en los últimos 30 días y que además han comprado un producto de la categoría "Electrónica".


	