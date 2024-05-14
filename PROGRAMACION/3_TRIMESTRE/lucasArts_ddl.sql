DROP DATABASE IF EXISTS lucasArts;
CREATE DATABASE lucasArts;
USE lucasArts;

-- Creación de la tabla Directores
CREATE TABLE directors (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    biography TEXT
);

-- Creación de la tabla Juegos
CREATE TABLE games (
    id INT AUTO_INCREMENT PRIMARY KEY,
    game_code VARCHAR(255) UNIQUE NOT NULL, -- Código único similar al ISBN para juegos
    title VARCHAR(255),
    release_year INT,
    description TEXT,
    director_id INT,  -- Clave foránea que enlaza con Directores
    FOREIGN KEY (director_id) REFERENCES directors(id)
);

-- insert into games (title, game_code,title,release_year,description,director_id) values ("pep","dd44","dddd",555,"frfefeferfeffef",1);

-- Creación de la tabla Personajes
CREATE TABLE characters (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    role VARCHAR(100),  -- Ej., personaje principal, antagonista, secundario
    description TEXT
);

-- Creación de la tabla Juegos_Personajes (para la relación N-M entre Juegos y Personajes)
CREATE TABLE games_characters (
    id INT AUTO_INCREMENT PRIMARY KEY,
    game_id INT,
    character_id INT,
    FOREIGN KEY (game_id) REFERENCES games(id),
    FOREIGN KEY (character_id) REFERENCES characters(id)
);

-- select * from games;
-- select g.*, gc.* from games g inner join games_characters gc on (gc.game_id = g.id) and g.game_code ='MI1-1990';
-- select c.*, gc.* from characters c inner join games_characters gc on (gc.game_id = c.id) and c.=1;
-- Select * from games where game_code = 'MI1-1990';



