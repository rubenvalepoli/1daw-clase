-- EJERCICIO 1. Obtener todos los detalles de todos los artículos de Cáceres..

    -- select * from ARTICULOS where CIUDAD = "Caceres";

-- EJERCICIO 2. Obtener todos los valores (distintos) de IDP para los proveedores que abastecen el artículo T1.

		-- select * from ARTICULOS;
		-- select distinct * from ARTICULOS where IDT = "T1";

-- EJERCICIO 3. Obtener la lista de pares de atributos (COLOR, CIUDAD) de la tabla componentes eliminando los pares duplicados.

		-- select * from COMPONENTES;
        -- select distinct COLOR, CIUDAD from COMPONENTES;

-- EJERCICIO 4. Obtener de la tabla de artículos los valores de IDT y CIUDAD donde el nombre de la ciudad acaba en D o contiene al menos una E.
		-- select * from ARTICULOS;
		-- select IDT, CIUDAD from ARTICULOS where CIUDAD like ('%d ') or CIUDAD like ('%e%');

-- EJERCICIO 5. Obtener los valores de IDP para los proveedores que suministran para el artículo T1 el componente C1.

	-- select * from PROVEEDORES, ARTICULOS, COMPONENTES;
    -- select idp from ENVIOS where (idt = "T1") and (idc = "C1")


-- EJERCICIO 6. Obtener los valores de TNOMBRE en orden alfabético para los artículos abastecidos por el proveedor P1.

	-- select a.tnombre, p.idp from ARTICULOS a, PROVEEDORES p where (idp = "P1")order by a.tnombre ASC;

-- EJERCICIO 7. Realiza un script que inserte en la base de datos 2 proveedores, 2 componentes y dos artículos. Ejecuta el script.

/*	use Componentes;
    insert into PROVEEDORES values ("P6","PEPE",10,"MALAGA"); 
    insert into PROVEEDORES values ("P7","PEPA",20,"VALENCIA"); 
    insert into COMPONENTES values ("C7","A9B","VERDE",20,"CACERES"); 
    insert into COMPONENTES values ("C8","PU9","ROJO",10,"MURCIA"); 
    insert into ARTICULOS values ("T8","GRAPADORA","MURCIA"); 
    insert into ARTICULOS values ("T9","BOLSA","VALENCIA"); 
    
    select * from PROVEEDORES;
    select * from COMPONENTES;
    select * from ARTICULOS;*/


-- EJERCICIO 8. Eliminar el primer componente de los que has creado.

	-- delete from PROVEEDORES where IDP = "P6";
    -- select * from PROVEEDORES;

-- EJERCICIO 9. Actualiza el nombre del último proveedor que has introducido al valor “CIPFP MISLATA”.

	-- use Componentes; 
    -- update PROVEEDORES set PNOMBRE = "CIPFP MISLATA" where (IDP = "P7");
	-- select * from PROVEEDORES;





