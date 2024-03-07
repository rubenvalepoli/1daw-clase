create database altea;
use altea;
create table balneario(
	id_balneario int primary key,
    nombre varchar(100)
);

create table trataminetos(
	id_ttmto int primary key,
    nombre varchar(100),
    id_balneario int,
    coste decimal(6,2),
    foreign key (id_balneario) references balneario (id_balneario)
);
