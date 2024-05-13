DROP DATABASE IF exists books;
CREATE DATABASE IF NOT EXISTS books;
USE books;

CREATE TABLE author(
	id INT PRIMARY KEY auto_increment,
    name VARCHAR(200) NOT NULL
);

CREATE TABLE editorial(
	id INT PRIMARY KEY auto_increment,
    name VARCHAR(200) NOT NULL
);


CREATE TABLE book(
	id INT PRIMARY KEY auto_increment,
    name VARCHAR(200) NOT NULL,
    year INT NOT NULL,
    editorial_id INT NOT NULL,
	FOREIGN KEY (editorial_id) REFERENCES editorial(id)
    On delete cascade
    On update cascade
);


CREATE TABLE characters(
	id INT PRIMARY KEY auto_increment,
    name VARCHAR(200) NOT NULL,
    book_id INT NOT NULL,
	FOREIGN KEY (book_id) REFERENCES book(id) 
);


CREATE TABLE author_book(
    author_id INT NOT NULL auto_increment,
    book_id INT NOT NULL,
    PRIMARY KEY (author_id,book_id),
    FOREIGN KEY (author_id) REFERENCES author(id), 
    FOREIGN KEY (book_id) REFERENCES book(id) 
);

-- INSERCIONES

-- Inserciones para la tabla author
INSERT INTO author (name) VALUES ( 'J.R.R. Tolkien');
INSERT INTO author (name) VALUES ('Christopher Tolkien');
INSERT INTO author (name) VALUES ('Gabriel García Márquez');
INSERT INTO author (name) VALUES ('J.K. Rowling');
INSERT INTO author (name) VALUES ('George Orwell');
INSERT INTO author (name) VALUES ('Harper Lee');
INSERT INTO author (name) VALUES ('Miguel de Cervantes');
INSERT INTO author (name) VALUES ('Jane Austen');
INSERT INTO author (name) VALUES ('Carlos Ruiz Zafón');
INSERT INTO author (name) VALUES ('Gabriel García Márquez');
INSERT INTO author (name) VALUES ('Patrick Rothfuss');

-- Inserciones para la tabla editorial
INSERT INTO editorial (name) VALUES ('Editorial Minotauro');
INSERT INTO editorial (name) VALUES ('Editorial Sudamericana');
INSERT INTO editorial (name) VALUES ('Bloomsbury');
INSERT INTO editorial (name) VALUES ('Secker & Warburg');
INSERT INTO editorial (name) VALUES ('J. B. Lippincott & Co.');
INSERT INTO editorial (name) VALUES ('Francisco de Robles');
INSERT INTO editorial (name) VALUES ('T. Egerton');
INSERT INTO editorial (name) VALUES ('Planeta');
INSERT INTO editorial (name) VALUES ('Editorial La Oveja Negra');
INSERT INTO editorial (name) VALUES ('DAW Books');



-- Inserciones para la tabla book
INSERT INTO book (name, year, editorial_id) VALUES ('El Señor de los Anillos: La Comunidad del Anillo', 1954, 1);
INSERT INTO book (name, year, editorial_id) VALUES ('Cien años de soledad', 1967, 2);
INSERT INTO book (name, year, editorial_id) VALUES ('Harry Potter y la piedra filosofal', 1997, 3);
INSERT INTO book (name, year, editorial_id) VALUES ('1984', 1949, 4);
INSERT INTO book (name, year, editorial_id) VALUES ('Matar a un ruiseñor', 1960, 5);
INSERT INTO book (name, year, editorial_id) VALUES ('Don Quijote de la Mancha', 1605, 6);
INSERT INTO book (name, year, editorial_id) VALUES ('Orgullo y prejuicio', 1813, 7);
INSERT INTO book (name, year, editorial_id) VALUES ('La sombra del viento', 2001, 8);
INSERT INTO book (name, year, editorial_id) VALUES ('Crónica de una muerte anunciada', 1981, 9);
INSERT INTO book (name, year, editorial_id) VALUES ('El nombre del viento', 2007, 10);

-- Inserciones para la tabla characters
INSERT INTO characters (name, book_id) VALUES ('Frodo', 1);
INSERT INTO characters (name, book_id) VALUES ('Aureliano Buendía', 2);
INSERT INTO characters (name, book_id) VALUES ('Harry Potter', 3);
INSERT INTO characters (name, book_id) VALUES ('Winston Smith', 4);
INSERT INTO characters (name, book_id) VALUES ('Atticus Finch', 5);
INSERT INTO characters (name, book_id) VALUES ('Don Quijote', 6);
INSERT INTO characters (name, book_id) VALUES ('Elizabeth Bennet', 7);
INSERT INTO characters (name, book_id) VALUES ('Daniel Sempere', 8);
INSERT INTO characters (name, book_id) VALUES ('Santiago Nasar', 9);
INSERT INTO characters (name, book_id) VALUES ('Kvothe', 10);
INSERT INTO characters (name, book_id) VALUES ('Julian Carax', 8);
INSERT INTO characters (name, book_id) VALUES ('Sancho Panza', 6);
INSERT INTO characters (name, book_id) VALUES ('Voldemort', 3);



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

