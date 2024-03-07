/* create database proveedores;

use proveedores;

create table tabla1 (
	num1 int primary key
);

create table tabla2 (
	num2 int primary key,
    num3 int,
    foreign key (num3) references tabla1(num1) on update restrict
);
insert into tabla1 values (1);
insert into tabla2 values (2,3);
*/

/*select * from tabla2; visualiza toda la informacion de la tabla 2*/






