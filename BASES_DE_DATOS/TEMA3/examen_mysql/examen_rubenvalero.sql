create database if not exists ruben;
use ruben;

create table decano(
	dni char(9) primary key,
    nombre varchar(25) not null,
    ap1 varchar(25) not null,
    ap2 varchar(25)
);

create table facultad(
	cod_facultad int primary key,
    nombre varchar(50) not null,
    dni char(9) not null,
    foreign key (dni) references decano (dni)
);

create table docente(
	dni char(9) primary key,
    nombre varchar(25) not null,
    ap1 varchar(25) not null,
    ap2 varchar(25),
    cod_facultad int not null,
    foreign key (cod_facultad) references facultad (cod_facultad)
);
    
create table asignatura (
	cod_asignatura int primary key,
    nombre varchar(25) not null
);

create table imparte(
	dni char(9),
    cod_asignatura int,
    primary key (dni, cod_asignatura),
    foreign key (dni) references docente (dni),
    foreign key (cod_asignatura) references asignatura (cod_asignatura)
);

