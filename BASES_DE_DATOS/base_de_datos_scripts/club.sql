create database club;
use club;
create table presidente (
	dni char(9) primary key,
    nombre varchar(25) not null,
    apellido1 varchar(25) not null,
    apellido2 varchar(25),
    fecha_nacimiento date not null,
    anyo_nombramiento date not null
);

create table equipo(
	cod_equipo int primary key auto_increment,
    nombre_equipo varchar(50) not null,
    estadio varchar(25) not null,
    aforo int not null,
    anyo_fundacion date not null,
    ciudad varchar(100),
    dni char(9) not null,
    foreign key (dni) references presidente (dni)
);

create table jugador (
	cod_jugador int primary key not null auto_increment,
    nombre varchar(25) not null,
    fecha_nacimiento date not null,
    posicion varchar(30) not null,
    cod_equipo int not null,
    foreign key (cod_equipo) references equipo(cod_equipo)
);

create table partido (
	cod_partido int primary key auto_increment,
    gol_visitante varchar(25) not null,
    gol_local varchar(25) not null,
    fecha_partido date not null
);

create table marca(
	cod_jugador int not null,
    cod_partido int not null,
    id_gol int not null,
    minuto time not null
);
