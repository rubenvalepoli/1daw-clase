use jardineria;

-- EJERCICIO 1. Devuelve el nombre del cliente con mayor límite de crédito. Indica dos manera de resolverlo.

	 -- select nombre_cliente from cliente where limite_credito = (select max(limite_credito) from cliente);

-- EJERCICIO 2. Devuelve el producto que menos unidades tiene en stock. Indica dos maneras de resolverlo.

	-- select distinct p.nombre from producto p where p.cantidad_en_stock = (select min(cantidad_en_stock) from producto);

-- EJERCICIO 3. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto Soria.

	-- select e.nombre, e.apellido1, e.apellido2, e.email 
    -- from empleado e where e.codigo_jefe = (select e.codigo_empleado from empleado e 
    -- where (e.nombre = "Alberto") and (e.apellido1 ="Soria"));

-- EJERCICIO 4. Devuelve el nombre, apellido1 y puesto de los empleados que no representen a ningún cliente.

	-- select e.nombre, e.apellido1, e.puesto 
    -- from empleado e 
	-- where e.codigo_empleado not in (select e.codigo_empleado from empleado e inner join cliente c on (e.codigo_empleado = c.codigo_empleado_rep_ventas));

-- EJERCICIO 5. Devuelve un listado que muestre solamente los clientes que sí han realizado algún pago.

	-- select c.nombre_cliente 
    -- from cliente c inner join pago p on 
    -- (c.codigo_cliente = p.codigo_cliente);

-- EJERCICIO 6. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas de algún cliente que haya realizado la compra de algún producto de la gama Frutales.

	-- select distinct o.* from oficina o natural join empleado e where e.codigo_empleado not in (select e2.codigo_empleado from empleado e2 
    -- natural join cliente c2 natural join pedido pe2 natural join detalle_pedido dp2 natural join producto pr2 where pr2.gama like "%frutal%");
    
-- EJERCICIO 7. Devuelve un listado con los clientes que han realizado algún pedido pero no han realizado ningún pago.

	-- select distinct c.nombre_cliente 
    -- from cliente c inner join pedido pe on (c.codigo_cliente = pe.codigo_cliente)
    -- where c.codigo_cliente not in 
    -- (select c.codigo_cliente from cliente c inner join pago p on (c.codigo_cliente = p.codigo_cliente));

-- EJERCICIO 8. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.

	-- select distinct pr.nombre from producto pr
    -- inner join detalle_pedido d on (pr.codigo_producto = d.codigo_producto)
    -- inner join pedido pe on (pe.codigo_pedido = d.codigo_pedido);

-- EJERCICIO 9. Devuelve el listado de clientes indicando el nombre del cliente y cuántos pedidos ha realizado. Tenga en cuenta que pueden existir clientes que no han realizado ningún pedido.

	-- select c.nombre_cliente, count(p.codigo_pedido) as "Nº pedidos"from cliente c natural join pedido p group by c.codigo_cliente; 

-- EJERCICIO 10. Devuelve el nombre de los clientes que hayan hecho pedidos en 2008 ordenados alfabéticamente.

	-- select distinct c.nombre_cliente from cliente c, pedido p where p.fecha_pedido between "2008-01-01" and "2008-12-31" order by c.nombre_cliente;




