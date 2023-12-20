create database casa;
use casa;
create table cliente(
	dni char(9) primary key,
    nombre varchar(25) not null,
    direccion varchar(50) not null,
    fecha_nacimiento date not null
);

create table procurador(
	dni char(9) primary key,
    casos_ganados int not null,
    nombre varchar(50) not null,
    apellido varchar(50) not null,
    numero_colegiado int not null
);

create table asunto(
	num_expediente int primary key,
    estado varchar(25) not null,
    fecha_inicio date not null,
    fecha_fin date not null,
    dni char(9) not null,
    foreign key(dni) references cliente (dni)
);

create table llevar(
	dni char(9) not null,
    num_expediente int not null,
    primary key (dni, num_expediente),
    foreign key (dni) references procurador (dni),
    foreign key (num_expediente) references asunto (num_expediente)
);