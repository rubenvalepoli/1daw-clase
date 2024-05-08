drop database movie;
create database  movie;
use movie;



create table actor(
	id integer primary key,
    name varchar(200) not null
);


create table director(
	id integer primary key,
    name varchar(200) not null
);



create table movie(
	id integer primary key,
    name varchar(200) not null,
    year int not null,
    id_director integer not null,
    foreign key (id_director) references director (id)
);



create table characterMovie(
	id integer primary key,
    movieId int not null,
    actorId int not null,
    charactername varchar(200) not null,
	foreign key (movieId) references movie (id),
	foreign key (actorId) references actor (id)
);


-- INSERCONES

-- Actor

INSERT INTO actor (id, name) VALUES (1, 'Marlon Brando');
INSERT INTO actor (id, name) VALUES (2, 'Al Pacino');
INSERT INTO actor (id, name) VALUES (3, 'James Caan');
INSERT INTO actor (id, name) VALUES (4, 'Tim Robbins');
INSERT INTO actor (id, name) VALUES (5, 'Morgan Freeman');
INSERT INTO actor (id, name) VALUES (6, 'Bob Gunton');
INSERT INTO actor (id, name) VALUES (7, 'Liam Neeson');
INSERT INTO actor (id, name) VALUES (8, 'Ben Kingsley');
INSERT INTO actor (id, name) VALUES (9, 'Ralph Fiennes');
INSERT INTO actor (id, name) VALUES (10, 'Humphrey Bogart');
INSERT INTO actor (id, name) VALUES (11, 'Ingrid Bergman');
INSERT INTO actor (id, name) VALUES (12, 'Paul Henreid');
INSERT INTO actor (id, name) VALUES (13, 'Robert De Niro');
INSERT INTO actor (id, name) VALUES (14, 'Christian Bale');
INSERT INTO actor (id, name) VALUES (15, 'Heath Ledger');
INSERT INTO actor (id, name) VALUES (16, 'Gary Oldman');
INSERT INTO actor (id, name) VALUES (17, 'Sean Connery');
INSERT INTO actor (id, name) VALUES (18, 'Christian Slater');
INSERT INTO actor (id, name) VALUES (19, 'F. Murray Abraham');
INSERT INTO actor (id, name) VALUES (20, 'Brad Pitt');
INSERT INTO actor (id, name) VALUES (21, 'Edward Norton');
INSERT INTO actor (id, name) VALUES (22, 'Helena Bonham Carter');
INSERT INTO actor (id, name) VALUES (23, 'Harrison Ford');
INSERT INTO actor (id, name) VALUES (24, 'Karen Allen');
INSERT INTO actor (id, name) VALUES (25, 'John Rhys-Davies');
INSERT INTO actor (id, name) VALUES (26, 'Alison Doody');

-- Director

INSERT INTO director (id, name) VALUES (1, 'Francis Ford Coppola');
INSERT INTO director (id, name) VALUES (2, 'Frank Darabont');
INSERT INTO director (id, name) VALUES (3, 'Steven Spielberg');
INSERT INTO director (id, name) VALUES (4, 'Michael Curtiz');
INSERT INTO director (id, name) VALUES (5, 'Christopher Nolan');
INSERT INTO director (id, name) VALUES (6, 'Jean Jaques Annaud');
INSERT INTO director (id, name) VALUES (7, 'David Fincher');

-- Movie

INSERT INTO movie (id, name, year, id_director) VALUES (1, 'El padrino', 1972, 1);
INSERT INTO movie (id, name, year, id_director) VALUES (2, 'Cadena perpetua', 1994, 2);
INSERT INTO movie (id, name, year, id_director) VALUES (3, 'La lista de Schindler', 1993, 3);
INSERT INTO movie (id, name, year, id_director) VALUES (4, 'Casablanca', 1942, 4);
INSERT INTO movie (id, name, year, id_director) VALUES (5, 'El padrino: Parte II', 1974, 1);
INSERT INTO movie (id, name, year, id_director) VALUES (6, 'El caballero oscuro', 2008, 5);
INSERT INTO movie (id, name, year, id_director) VALUES (7, 'El nombre de la rosa', 1986, 6);
INSERT INTO movie (id, name, year, id_director) VALUES (8, 'El club de la lucha', 1999, 7);
INSERT INTO movie (id, name, year, id_director) VALUES (9, 'En busca del arca perdida', 1981, 3);
INSERT INTO movie (id, name, year, id_director) VALUES (10, 'Indiana Jones y la última cruzada', 1989, 3);


-- caractername


INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (1, 1, 1, 'Vito Corleone');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (2, 1, 2, 'Michael Corleone');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (3, 1, 3, 'Sonny Corleone');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (4, 2, 4, 'Andy Dufresne');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (5, 2, 5, 'Ellis Boyd Redding');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (6, 2, 6, 'Warden Norton');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (7, 3, 7, 'Oskar Schindler');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (8, 3, 8, 'Itzhak Stern');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (9, 3, 9, 'Amon Göth');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (10, 4, 10, 'Rick Blaine');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (11, 4, 11, 'Ilsa Lund');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (12, 4, 12, 'Victor Laszlo');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (13, 5, 1, 'Vito Corleone');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (14, 5, 2, 'Michael Corleone');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (15, 5, 3, 'Sonny Corleone');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (16, 6, 14, 'Bruce Wayne');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (17, 6, 15, 'Joker');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (18, 6, 16, 'Jim Gordon');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (19, 7, 17, 'Guillermo de Baskerville');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (20, 7, 18, 'Adso de Melk');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (21, 7, 19, 'Bernardo Gui');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (22, 8, 20, 'Tyler Durden');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (23, 8, 21, 'Narrador');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (24, 8, 22, 'Marla Singer');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (25, 9, 23, 'Indiana Jones');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (26, 9, 24, 'Marion Ravenwood');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (27, 9, 25, 'Sallah');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (28, 10, 23, 'Indiana Jones');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (29, 10, 17, 'Henry Jones');
INSERT INTO characterMovie (id, movieId, actorId, charactername) VALUES (30, 10, 26, 'Elsa Schneider');

SELECT a.* FROM actor a
    INNER JOIN characterMovie cm
    ON cm.actorId = a.id
    and cm.id = 1
