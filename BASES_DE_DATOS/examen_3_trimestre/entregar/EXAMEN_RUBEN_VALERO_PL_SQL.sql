-- BLOQUE 3 PL/SQL (ORACLE)
-- Script1 2 puntos
/*Se pide que escribas un subprograma (función o procedimiento) en PL/SQL que, dado un cliente (que
se le pasará como parámetro), nos devuelva el número de reservas que ha realizado dicho cliente.*/


create or replace function numero_reservas (id in number)return number
	is
		total number; 
	begin
        select count(r.reserva_id) into total from reservas r inner join clientes c on (c.cliente_id = r.cliente_id) where (c.cliente_id=id);
		return total;
	end;
	/
	
	declare
		resultado number;
	begin
		resultado := numero_reservas (1);
		DBMS_OUTPUT.PUT_LINE('El cliente ha reservado : ' || resultado ||' vuelo');
	end;
	



-- Script2 4 puntos
/*En una aerolínea, se necesita automatizar la actualización del estado de un vuelo basado en la
disponibilidad de asientos. Para ello, se solicita la creación de un trigger que se active después de
cada inserción en la tabla reserva. Este trigger actualizará automáticamente el estado del vuelo
correspondiente en la tabla vuelos, cambiándolo a "Agotado" si ya no quedan asientos disponibles.*/

	CREATE OR REPLACE TRIGGER t_actualizar_estado AFTER insert ON reservas
	for each row
	declare
		cursor c_recorrer_asientos is
		select asientos_disponibles from vuelos where vuelo_id = :new.vuelo_id;
	begin
		for v_asiento in c_recorrer_asientos loop
        	if v_asiento.asientos_disponibles = 0
        	then
				update vuelos set estado = 'Agotado' where vuelo_id = :new.vuelo_id;
			end if;
		end loop;
	end;








