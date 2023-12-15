create database empleados;
use empleados;
create table empleado(
	 id_empleado int primary key not null,
     nombre mediumtext not null
);

create table fijo (
	id_empleado int primary key not null,
    sueldo decimal (10,2) not null,
    alojamiento varchar(50) not null,
    foreign key (id_empleado) references empleado (id_empleado)
);

create table temporal(
	id_empleado int primary key not null,
    num int not null,
    colegio varchar (100) not null,
    foreign key (id_empleado) references empleado (id_empleado)
);