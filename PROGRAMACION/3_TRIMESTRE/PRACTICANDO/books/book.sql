-- DROP DATABASE books;
CREATE DATABASE IF NOT EXISTS books;
USE books;

CREATE TABLE author(
	id INT PRIMARY KEY,
    name VARCHAR(200) NOT NULL
);

CREATE TABLE editorial(
	id INT PRIMARY KEY,
    name VARCHAR(200) NOT NULL
);

CREATE TABLE characters(
	id INT PRIMARY KEY,
    name VARCHAR(200) NOT NULL
);


CREATE TABLE book(
	id INT PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    year INT NOT NULL,
    character_id INT NOT NULL,
    editorial_id INT NOT NULL,
	FOREIGN KEY (character_id) REFERENCES characters(id), 
	FOREIGN KEY (editorial_id) REFERENCES editorial(id)    
);


CREATE TABLE author_book(
    author_id INT NOT NULL,
    book_id INT NOT NULL,
    PRIMARY KEY (author_id, book_id),
    FOREIGN KEY (author_id) REFERENCES author(id), 
    FOREIGN KEY (book_id) REFERENCES book(id) 
);

-- INSERCIONES

-- Inserciones para la tabla author
INSERT INTO author (id, name) VALUES (1, 'J.R.R. Tolkien');
INSERT INTO author (id, name) VALUES (2, 'Christopher Tolkien');
INSERT INTO author (id, name) VALUES (3, 'Gabriel García Márquez');
INSERT INTO author (id, name) VALUES (4, 'J.K. Rowling');
INSERT INTO author (id, name) VALUES (5, 'George Orwell');
INSERT INTO author (id, name) VALUES (6, 'Harper Lee');
INSERT INTO author (id, name) VALUES (7, 'Miguel de Cervantes');
INSERT INTO author (id, name) VALUES (8, 'Jane Austen');
INSERT INTO author (id, name) VALUES (9, 'Carlos Ruiz Zafón');
INSERT INTO author (id, name) VALUES (10, 'Gabriel García Márquez');
INSERT INTO author (id, name) VALUES (11, 'Patrick Rothfuss');

-- Inserciones para la tabla characters
INSERT INTO characters (id, name) VALUES (1, 'Frodo');
INSERT INTO characters (id, name) VALUES (2, 'Aureliano Buendía');
INSERT INTO characters (id, name) VALUES (3, 'Harry Potter');
INSERT INTO characters (id, name) VALUES (4, 'Winston Smith');
INSERT INTO characters (id, name) VALUES (5, 'Atticus Finch');
INSERT INTO characters (id, name) VALUES (6, 'Don Quijote');
INSERT INTO characters (id, name) VALUES (7, 'Elizabeth Bennet');
INSERT INTO characters (id, name) VALUES (8, 'Daniel Sempere');
INSERT INTO characters (id, name) VALUES (9, 'Santiago Nasar');
INSERT INTO characters (id, name) VALUES (10, 'Kvothe');

-- Inserciones para la tabla editorial
INSERT INTO editorial (id, name) VALUES (1, 'Editorial Minotauro');
INSERT INTO editorial (id, name) VALUES (2, 'Editorial Sudamericana');
INSERT INTO editorial (id, name) VALUES (3, 'Bloomsbury');
INSERT INTO editorial (id, name) VALUES (4, 'Secker & Warburg');
INSERT INTO editorial (id, name) VALUES (5, 'J. B. Lippincott & Co.');
INSERT INTO editorial (id, name) VALUES (6, 'Francisco de Robles');
INSERT INTO editorial (id, name) VALUES (7, 'T. Egerton');
INSERT INTO editorial (id, name) VALUES (8, 'Planeta');
INSERT INTO editorial (id, name) VALUES (9, 'Editorial La Oveja Negra');
INSERT INTO editorial (id, name) VALUES (10, 'DAW Books');

-- Inserciones para la tabla book
INSERT INTO book (id, name, year, character_id, editorial_id) VALUES (1, 'El Señor de los Anillos: La Comunidad del Anillo', 1954, 1, 1);
INSERT INTO book (id, name, year, character_id, editorial_id) VALUES (2, 'Cien años de soledad', 1967, 2, 2);
INSERT INTO book (id, name, year, character_id, editorial_id) VALUES (3, 'Harry Potter y la piedra filosofal', 1997, 3, 3);
INSERT INTO book (id, name, year, character_id, editorial_id) VALUES (4, '1984', 1949, 4, 4);
INSERT INTO book (id, name, year, character_id, editorial_id) VALUES (5, 'Matar a un ruiseñor', 1960, 5, 5);
INSERT INTO book (id, name, year, character_id, editorial_id) VALUES (6, 'Don Quijote de la Mancha', 1605, 6, 6);
INSERT INTO book (id, name, year, character_id, editorial_id) VALUES (7, 'Orgullo y prejuicio', 1813, 7, 7);
INSERT INTO book (id, name, year, character_id, editorial_id) VALUES (8, 'La sombra del viento', 2001, 8, 8);
INSERT INTO book (id, name, year, character_id, editorial_id) VALUES (9, 'Crónica de una muerte anunciada', 1981, 9, 9);
INSERT INTO book (id, name, year, character_id, editorial_id) VALUES (10, 'El nombre del viento', 2007, 10, 10);

-- Inserciones para la tabla author_book (las relaciones entre autores y libros)
INSERT INTO author_book (author_id, book_id) VALUES (1, 1);
INSERT INTO author_book (author_id, book_id) VALUES (2, 1);
INSERT INTO author_book (author_id, book_id) VALUES (3, 2);
INSERT INTO author_book (author_id, book_id) VALUES (4, 3);
INSERT INTO author_book (author_id, book_id) VALUES (5, 4);
INSERT INTO author_book (author_id, book_id) VALUES (6, 5);
INSERT INTO author_book (author_id, book_id) VALUES (7, 6);
INSERT INTO author_book (author_id, book_id) VALUES (8, 7);
INSERT INTO author_book (author_id, book_id) VALUES (9, 8);
INSERT INTO author_book (author_id, book_id) VALUES (10, 9);
INSERT INTO author_book (author_id, book_id) VALUES (11, 10);






