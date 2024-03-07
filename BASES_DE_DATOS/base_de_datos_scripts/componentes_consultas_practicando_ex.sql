use Componentes;
-- select * from ARTICULOS where (ciudad = "Caceres")
-- SELECT distinct(e.idp) from ENVIOS e, PROVEEDORES p where (e.idt = "T1")
-- SELECT distinct (c.color), c.ciudad from COMPONENTES c;
-- select IDT, CIUDAD from ARTICULOS where CIUDAD like '%D' or CIUDAD like '%E%';
-- select IDP, IDT, IDC from ENVIOS where (IDT = "T1") and (IDC = "C1");
-- select a.TNOMBRE from ARTICULOS a, ENVIOS e where (e.IDP = "P1") and (e.IDT = a.IDT) order by (TNOMBRE) asc;  

/*insert into PROVEEDORES (IDP,PNOMBRE,CATEGORIA,CIUDAD) values ("P6","GEMA","30","VALENCIA");
insert into PROVEEDORES (IDP,PNOMBRE,CATEGORIA,CIUDAD) values ("P7","CONCHI","40","CORCOBA");
insert into COMPONENTES (IDC,CNOMBRE,COLOR,PESO,CIUDAD) values ("C7","E7R","AZUL","20","MALAGA");
insert into COMPONENTES (IDC,CNOMBRE,COLOR,PESO,CIUDAD) values ("C8","O9D","ROJO","30","MADRID");
insert into ARTICULOS (IDT,TNOMBRE,CIUDAD) values ("T8","GRAPADORA","CACERES");
insert into ARTICULOS (IDT,TNOMBRE,CIUDAD) values ("T9","TRIPODE","ASTURIAS");*/

-- delete from COMPONENTES where IDC = "C7";

-- update PROVEEDORES set PNOMBRE = "CIPFPMISLATA" where IDP = "P7"; 
-- SELECT * FROM PROVEEDORES;

-- select * from PROVEEDORES where concat(IDP,CIUDAD);








