create database lanjaron;
use lanjaron;
create table balneario(
	id_balneario int primary key not null,
    nombre mediumtext not null
);

create table tratamiento(
	id_tratamiento int primary key not null,
    nombre mediumtext not null
);
create table terapeuta(
	id_terapeuta int primary key not null,
    nombre mediumtext not null
);

create table coste(
	coste decimal (6,2),
    id_balneario int not null,
    id_tratamiento int not null,
    id_terapeuta int not null,
    primary key (id_balneario, id_tratamiento, id_terapeuta),
    foreign key (id_balneario) references balneario (id_balneario),
    foreign key (id_tratamiento) references tratamiento (id_tratamiento), 
    foreign key (id_terapeuta) references terapeuta (id_terapeuta)
);