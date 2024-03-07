use jardineria;


	-- EJERCICIO 1. Partiendo de la estructura de una subconsulta, encuentra los clientes que han
	-- realizado ningún pedido y que como forma de pago predeterminada no han seleccionado
	-- PAYPAL. En el resultado, se debe intercambiar el nombre del cliente para que aparezca en mayúsculas.

		-- OPCION 1
        
			 select distinct upper(c.nombre_cliente) from cliente c where c.codigo_cliente not in 
			 (select pe.codigo_cliente from pedido pe where pe.codigo_cliente in 
			 (select pa.codigo_cliente from pago pa where pa.forma_pago not like "PAYPAL"));
        
		-- OPCION 2
        
			 select distinct upper(c.nombre_cliente) from cliente c where c.codigo_cliente not in 
			 (select pe.codigo_cliente from pedido pe inner join pago pa on 
			 (pe.codigo_cliente = pa.codigo_cliente) and pa.forma_pago not like "PAYPAL");
			
        

	-- EJERCICIO 2. Lista el nombre de los clientes que hayan realizado pagos superiores a la media de todos los pagos. Se deben evitar duplicidades.



		 select distinct c.nombre_cliente from cliente c inner join pago p on (p.codigo_cliente = c.codigo_cliente)
         where p.total > (select avg(p.total) from pago p);
        
		

	-- EJERCICIO 3. Partiendo de la estructura de una subconsulta, lista el código y la fecha de los
	-- pedidos realizados en el año 2006 cuyo método de pago haya sido Transferencia.
    
    
		select p.codigo_pedido, p.fecha_pedido from pedido p where (p.fecha_pedido like "2006%") and
        p.codigo_cliente in (select pa.codigo_cliente from pago pa where pa.forma_pago = "Transferencia");


	-- EJERCICIO 4. Muestra el nombre y apellido de los empleados que trabajan en la misma oficina
	-- que el empleado Takuma Nomura. En el resultado de dicha consulta, no debe aparecer el nombre de dicho empleado.
    

		select e.nombre, e.apellido1 from empleado e inner join oficina o on (e.codigo_oficina = o.codigo_oficina) 
		where o.codigo_oficina = (select e.codigo_oficina from empleado e 
		where e.nombre ="Takuma" and e.apellido1 ="Nomura")and e.nombre not like "Takuma";


	-- EJERCICIO 5. Partiendo de la estructura de una subconsulta, devuelve el nombre y el país de
	-- los clientes que no tengan representantes de ventas que trabajan en oficinas cuyo nombre de
	-- ciudad no contenga la letra e. El resultado deberá estar ordenado en función del país, y de manera descendente.
    
    
		select c.nombre_cliente, c.pais from cliente c where c.codigo_empleado_rep_ventas not in 
        (select e.codigo_empleado from empleado e where e.codigo_oficina in 
        (select o.codigo_oficina from oficina o where o.ciudad not like "%e%" order by o.pais desc)); 






