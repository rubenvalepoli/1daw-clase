create database clase;
use clase;
create table alumno (
	id_alumno int primary key,
    nombre mediumtext
);

create table expediente (
	id_expediente int primary key,
    pdf varchar (20),
    id_alumno int,
    foreign key (id_alumno) references alumno (id_alumno)
);