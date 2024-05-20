
set @@Autocommit=0;

start transaction;
update  vuelos set asientos_disponiles = asientos_disponibles -1;
insert reservas (reserva_id,cliente_id,vuelo_id,fecha_reserva)value  (3, 1, 1, '2024-06-20');
commit;

