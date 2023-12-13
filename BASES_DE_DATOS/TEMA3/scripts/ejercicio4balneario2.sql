create database bronchales;
use bronchales;

create table balneario(
	id_balneario int primary key not null,
    nombre varchar (50) not null
);

create table tratamiento(
	id_tratamiento int primary key not null,
    nombre varchar (50) not null
);

create table oferta (
	coste decimal (6,2),
    id_balneario int not null,
    id_tratamiento int not null,
    foreign key (id_balneario) references balneario (id_balneario),
    foreign key (id_tratamiento) references tratamiento (id_tratamiento),
    primary key (id_balneario, id_tratamiento)
);