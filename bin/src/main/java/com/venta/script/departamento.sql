DROP DATABASE IF EXISTS bdartefacto;

CREATE DATABASE bdartefacto;

USE bdartefacto;

CREATE TABLE venta (
	nrofac int auto_increment   not null primary key ,
	codart int  ,
	cliente varchar (30) ,
	meses  int,
	fecha  date  
);

CREATE TABLE artefacto (
	codart int auto_increment   not null Primary Key ,
	nomart varchar (30) NULL ,
	preart numeric(8, 1) NULL 
);

INSERT INTO venta VALUES (null,1,'CLAUDIA VASQUEZ',6,'2020-01-22');
INSERT INTO venta VALUES (null,1,'CARLOS PAREDES',8 ,'2020-02-10');
INSERT INTO venta VALUES (null,1,'JUAN SANCHEZ',7 ,'2020-01-12');
INSERT INTO venta VALUES (null,2,'ADELA MEZA',13 ,'2020-01-27');
INSERT INTO venta VALUES (null,2,'GLORIA DELGADO',11 ,'2020-03-02');
INSERT INTO venta VALUES (null,3,'VIRNA MEJIA',13 ,'2020-02-11');
INSERT INTO venta VALUES (null,4,'JOSE LINARES',12,'2020-01-01');
INSERT INTO venta VALUES (null,4,'JENIFER CRUZADO',12 ,'2020-03-10');
INSERT INTO venta VALUES (null,5,'RAMON CERCADO',12 ,current_date());
INSERT INTO venta VALUES (null,4,'TERESA EGUSQUIZA',12 ,current_date());
INSERT INTO venta VALUES (null,3,'CAROLINA RETAMOZO',8,'2020-03-05');
INSERT INTO venta VALUES (null,2,'NURITH GUILLEN',12,'2020-02-19');
INSERT INTO venta VALUES (null,5,'DANIEL VERGARA',11,'2020-02-11');
INSERT INTO venta VALUES (null,5,'JOHANA LOPEZ',12,'2020-03-04');
INSERT INTO venta VALUES (null,6,'huachua Ernestina',13 ,'2020-01-05');
INSERT INTO venta VALUES (null,4,'Cardenas Juana',12,'2020-01-22');
INSERT INTO venta VALUES (null,3,'Leon Malpartida',12 ,current_date());
INSERT INTO venta VALUES (null,4,'nzales carrillo',11 ,current_date());
INSERT INTO venta VALUES (null,2,'Mio Gamboa',12 ,'2020-01-15');
INSERT INTO venta VALUES (null,2,'Maldonado Huaman',12 ,'2020-01-12');
INSERT INTO venta VALUES (null,2,'Gaspar Acosta',11 ,'2020-02-04');
INSERT INTO venta VALUES (null,1,'Echegaray Felix',12 ,'2020-02-18');
INSERT INTO venta VALUES (null,2,'Cano Siu',10 ,current_date());
INSERT INTO venta VALUES (null,2,'Melgarejo percy',12,current_date());
INSERT INTO venta VALUES (null,5,'Grijalva Alan ',7 ,current_date());
INSERT INTO venta VALUES (null,6,'Marin LOPEZ',6 ,current_date());
INSERT INTO venta VALUES (null,3,'JOHANA LOPEZ',8,'2020-02-27');
INSERT INTO venta VALUES (null,2,'huachua Ernestina',6,'2020-03-15');
INSERT INTO venta VALUES (null,4,'Cardenas Juana',8,'2020-03-14');
INSERT INTO venta VALUES (null,5,'Leon Malpartida',10 ,current_date());
INSERT INTO venta VALUES (null,6,'nzales carrillo',11 ,'2020-02-04');
INSERT INTO venta VALUES (null,2,'Mio Gamboa',12 ,current_date());
INSERT INTO venta VALUES (null,5,'Maldonado Huaman',12 ,'2020-03-02');
INSERT INTO venta VALUES (null,1,'Gaspar Acosta',8,current_date());
INSERT INTO venta VALUES (null,3,'Echegaray Felix',12 ,current_date());

INSERT INTO artefacto VALUES (null,'Horno ',256);
INSERT INTO artefacto VALUES (null,'Cocinas de 6 Hornillas',1500);
INSERT INTO artefacto VALUES (null,'Refrigeradoras 16pc',3478);
INSERT INTO artefacto VALUES (null,'Televisor de 50 pulg', 4600);
INSERT INTO artefacto VALUES (null,'Televisor de 24 pulg', 490);
INSERT INTO artefacto VALUES (null,'Filmadoras', 750);
INSERT INTO artefacto VALUES (null,'Lavadoras de 16 pc', 2570);
INSERT INTO artefacto VALUES (null,'Refrigeradoras de 12 pc', 3120);
INSERT INTO artefacto VALUES (null,'congeladoras de 14pc', 4570);

select * from venta;
select * from artefacto;