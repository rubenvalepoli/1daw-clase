create database if not exists banco;
use banco;

create table if not exists sucursal(
	CodSucursal int primary key auto_increment,
    nombre varchar(25) not null,
    direccion varchar(50) not null,
    localidad varchar(50) not null
);

create table if not exists cuenta (
	CodCuenta int primary key auto_increment,
    CodSucursal int not null,
    foreign key (CodSucursal) references sucursal (CodSucursal)
);

create table if not exists cliente(
	dni char(9) primary key,
    nombre varchar(25) not null,
    direccion varchar(50) not null,
    localidad varchar(50) not null,
    fechanacimiento date not null,
    sexo varchar(15) not null
);

create table if not exists cliente_cuenta(
	CodCuenta int not null,
    dni char(9) not null,
    primary key (CodCuenta, dni),
    foreign key (CodCuenta) references cuenta (CodCuenta),
    foreign key (dni) references cliente (dni)
);

create table if not exists transaccion(
	NumTransaccion int not null,
    fecha date not null,
    cantidad int not null,
    CodCuenta int not null,
    foreign key (CodCuenta) references cuenta (CodCuenta)
);


show databases;
show tables;
desc transaccion;
alter table transaccion add column hora date not null;
alter table sucursal modify column localidad varchar(60) not null;
alter table cliente add column ss int not null;
alter table cliente drop primary key;
alter table cliente drop column ss;

