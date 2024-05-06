create database empresa;
use empresa;
CREATE TABLE departamentos (
    id NUMBER PRIMARY KEY,
    nombre VARCHAR2(50)
);


CREATE TABLE empleados (
	id NUMBER PRIMARY KEY,
	nombre VARCHAR2(50),
	salario NUMBER,
    departamento_id NUMBER,
    FOREIGN KEY (departamento_id) REFERENCES departamentos(id)

);



INSERT INTO departamentos (id, nombre) VALUES (1, 'Ventas');
INSERT INTO departamentos (id, nombre) VALUES (2, 'Marketing');
INSERT INTO departamentos (id, nombre) VALUES (3, 'Tecnología');

INSERT INTO empleados (id, nombre, salario, departamento_id) VALUES (1, 'Juan', 3000, 1);
INSERT INTO empleados (id, nombre, salario, departamento_id) VALUES (2, 'María', 3500, 1);
INSERT INTO empleados (id, nombre, salario, departamento_id) VALUES (3, 'Pedro', 3200, 2);	 	 	







-- EJERCICIO 1. Crea un procedimiento para insertar un nuevo empleado. Este procedimiento recibirá como parámetros el nombre, salario y departamento del nuevo empleado y lo insertará en la tabla “empleados”.

create or replace procedure insertar_empleado(
	nombre_empleado in varchar2,
    salario_empleado in number,
    departamento_empleado in varchar2
) as 
begin
	insert into empleados(nombre, salario, departamento)
    values(nombre_empleado, salario_empleado, departamento_empleado);
    
    commit;
end insertar_empleado;


begin
	insertar_empleado('Juan', 2000,'Ventas');
end;

