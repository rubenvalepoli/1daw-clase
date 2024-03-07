create database alumnos2;
use alumnos2;
create table alumno(
	id_alumno int primary key not null,
    nombre varchar(20) not null
);

create table expediente (
	id_alumno int not null,
    foreign key (id_alumno) references alumno (id_alumno),
    numero int not null,
    pdf varchar (20),
    primary key (id_alumno, numero)
);