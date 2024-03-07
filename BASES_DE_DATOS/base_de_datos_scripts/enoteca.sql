create database enoteca;
use enoteca;
create table catador(
	dniCatador char(9) primary key,
    nombre varchar(25) not null,
    experiencia boolean not null,
    dnipareja char(9) not null
);

create table vino(
	codBarras varchar(20) primary key,
    anyada date not null,
    precio decimal (10,2) not null,
    bodega varchar(80) not null,
    tipoVino varchar(100) not null
);

create table composicion(
	codBarras varchar(20) not null,
    tipoUva varchar(50) not null,
    porcentaje decimal(5,2) not null
);

create table cata(
	dniCatador char(9) not null,
    codBarras varchar(20) not null,
    notaAromas int not null,
    notaSabor int not null,
    primary key(dniCatador, codBarras),
    foreign key (codBarras) references vino (codBarras)
);