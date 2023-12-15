create database tienda_ropa;
use tienda_ropa;

create table factura(
	num_factura int primary key not null,
    cantidad int not null,
    total int not null,
    fecha date not null,
    dto mediumtext not null	
);

create table cliente(
	id_cliente int primary key not null,
    dni varchar (20) not null ,
    num varchar(10) not null,
	ap1 mediumtext not null,
    ap2 mediumtext not null
);

create table cliente_2(
	id_cliente int not null,
    telefono varchar(15) not null,
    primary key (id_cliente, telefono),
    foreign key (id_cliente) references cliente (id_cliente) 
);

create table cliente_3(
	id_cliente int not null,
    calle varchar(50) not null,
	cp int not null,
    primary key (id_cliente, calle),
    foreign key (id_cliente) references cliente (id_cliente) 
);


create table producto(
	cod_producto int primary key not null,
    nombre mediumtext not null,
    talla varchar(7) not null,
    ap2 mediumtext not null,
	color mediumtext not null,
    precio int not null,
    descripcion mediumtext not null
);

create table proveedor(
	cif int primary key not null,
    nombre mediumtext not null,
	calle mediumtext not null,
    cp int not null,
    mail mediumtext not null
);

create table proveedor_2(
	cif int not null,
	telefono varchar(15) not null,
    primary key (cif, telefono),
    foreign key (cif) references proveedor (cif)
);

create table proveedor_3(
	cif int not null,
	calle varchar(50) not null,
    cp int not null,
    primary key (cif, calle),
    foreign key (cif) references proveedor (cif)
);


create table trabajador(
	id_trabajador int primary key not null,
    ss int not null,
    nombre mediumtext not null,
    ap1 mediumtext not null,
    ap2 mediumtext not null,
	calle mediumtext not null,
    num varchar(10) not null,
    cp int not null
);

create table trabajador_2(
	id_trabajador int not null,
    telefono varchar(15) not null,
    primary key (id_trabajador, telefono),
    foreign key (id_trabajador) references trabajador (id_trabajador)
);

create table trabajador_3(
	id_trabajador int not null,
    calle varchar(50) not null,
    cp int not null,
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
	cif int not null,
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
