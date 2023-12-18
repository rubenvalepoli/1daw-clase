create database if not exists tienda_ropa;
use tienda_ropa;

create table factura(
	num_factura int primary key auto_increment,
    cantidad int not null,
    total int not null,
    fecha date not null,
    dto float(3,2) not null	
);

create table cliente(
	id_cliente int primary key auto_increment,
    dni char(9) not null ,
    nombre varchar(25) not null,
	ap1 varchar(25) not null,
    ap2 varchar(25) not null
);

create table telefonos_cliente(
	id_cliente int not null,
    telefono char(12) not null,
    primary key (id_cliente, telefono),
    foreign key (id_cliente) references cliente (id_cliente) 
);

create table dieccion_cliente(
	id_cliente int not null,
    calle varchar(50) not null,
    num int(3) not null,
	cp int(5) not null,
    primary key (id_cliente, calle),
    foreign key (id_cliente) references cliente (id_cliente) 
);


create table producto(
	cod_producto int primary key auto_increment,
    nombre varchar(15) not null,
    talla varchar(3) not null,
	color varchar(15) not null,
    precio float not null,
    descripcion varchar(250)
);

create table proveedor(
	cif char(9) primary key,
    nombre varchar(25) not null,
    mail varchar(30) not null
);

create table telefono_proveedor(
	cif char(9) not null,
	telefono char(12) not null,
    primary key (cif, telefono),
    foreign key (cif) references proveedor (cif)
);

create table direccion_proveedor(
	cif char(9) not null,
	calle varchar(50) not null,
    num int(3) not null,
    cp int(5) not null,
    primary key (cif, calle),
    foreign key (cif) references proveedor (cif)
);


create table trabajador(
	id_trabajador int primary key auto_increment,
    ss int not null,
    nombre varchar(25) not null,
    ap1 varchar(25) not null,
    ap2 varchar(25) not null
);

create table telefono_trabajador(
	id_trabajador int not null,
    telefono char(12) not null,
    primary key (id_trabajador, telefono),
    foreign key (id_trabajador) references trabajador (id_trabajador)
);

create table direccion_trabajador(
	id_trabajador int not null,
    calle varchar(50) not null,
    num int(3) not null,
    cp int(5) not null,
    primary key (id_trabajador, calle),
    foreign key (id_trabajador) references trabajador (id_trabajador)
);

create table comercial(
	id_comercial int primary key not null,
    foreign key (id_comercial) references trabajador (id_trabajador)
);

create table gerente(
	id_gerente int primary key not null,
    foreign key (id_gerente) references trabajador (id_trabajador)
);

create table dependiente(
	id_dependiente int primary key not null,
    foreign key (id_dependiente) references trabajador (id_trabajador)
);

create table recibe(
	cod_producto int not null,
	id_cliente int not null,
	num_factura int not null,
    primary key (cod_producto, id_cliente),
    foreign key (cod_producto) references producto (cod_producto),
    foreign key (id_cliente) references cliente (id_cliente),
    foreign key (num_factura) references factura (num_factura)
);

create table vende(
	cod_producto int not null,
	id_cliente int not null,
	id_dependiente int not null,
    primary key (cod_producto, id_cliente),
    foreign key (cod_producto) references producto (cod_producto),
    foreign key (id_cliente) references cliente (id_cliente),
    foreign key (id_dependiente) references dependiente (id_dependiente)
);

create table compra(
	cod_producto int not null,
	id_comercial int not null,
	cif char(9) not null,
    primary key (cod_producto, id_comercial),
    foreign key (cod_producto) references producto (cod_producto),
    foreign key (id_comercial) references comercial (id_comercial),
    foreign key (cif) references proveedor (cif)
);

create table contrata(
	id_dependiente int not null,
	id_comercial int not null,
	id_gerente int not null,
    primary key (id_dependiente, id_comercial),
    foreign key (id_dependiente) references dependiente (id_dependiente),
    foreign key (id_comercial) references comercial (id_comercial),
    foreign key (id_gerente) references gerente (id_gerente)
);
