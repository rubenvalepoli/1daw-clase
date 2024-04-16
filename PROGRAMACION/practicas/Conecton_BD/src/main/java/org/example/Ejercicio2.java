package org.example;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {

        //LISTADO DE PELICULAS

        /*try {
            ResultSet resultSet = RawSql.select("SELECT * FROM movies", null);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("title"));
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar las películas");
        }*/

        //BUSCAR PELICULA POR ID

        /*try {
            int id = 3;
            ResultSet resultSet = RawSql.select("SELECT * FROM movies where id = ?",List.of(id));
            if (resultSet.next()){
                System.out.println(resultSet.getString("title"));
            }else {
                System.out.println("NO se han encontrado las peliculas");
            }
        }catch (SQLException e){
            System.out.println("Error en la recuperacion de la peli");
        }*/

        //INSERCION DE PELÍCULA

        /*String sql = """
        Insert into movies (imdb_id,title,year,image,runtime,description,director_id)values(?,?,?,null,?,null,?)""";
        List<Object> params = List.of(
            "tt0071524","Primera plana",1974,105,"nm0000697"
        );
        System.out.println("PElicula insertada con id" + RawSql.insert(sql, params));
        */


        // Actualización de película
        /*String sql = """
                UPDATE movies SET title = ? WHERE id = ?
            """;
        List<Object> params = List.of(
                "Primera plana (1974)", 225
        );
        System.out.println("Filas actualizadas: " + RawSql.update(sql, params));*/

        // Borrado de película
        /*String sql = """
                DELETE FROM movies WHERE id = ?
            """;
        System.out.println("Filas borradas: " + RawSql.delete(sql, List.of(225)));*/

        // Listado de películas ordenado por año
        /*try {
            ResultSet resultSet = RawSql.select("SELECT * FROM movies ORDER BY year DESC", null);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("title") + " (" + resultSet.getInt("year") + ")");
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar las películas");
        }*/

        // Buscar una película por id con el nombre del director
        /*try {
            int id = 3;
            ResultSet resultSet = RawSql.select("""
                SELECT m.title, d.name
                FROM movies m
                JOIN directors d ON m.director_id = d.imdb_id
                WHERE m.id = ?
            """, List.of(id));
            if (resultSet.next()) {
                System.out.println(resultSet.getString("title") + " (" + resultSet.getString("name") + ")");
            } else {
                System.out.println("No se ha encontrado la película");
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar la película");
        }*/

        // Listado de películas por imdb_id del director
        /*try {
            String directorImdbId = "nm0000697";
            ResultSet resultSet = RawSql.select("""
                SELECT title
                FROM movies
                WHERE director_id = ?
            """, List.of(directorImdbId));
            while (resultSet.next()) {
                System.out.println(resultSet.getString("title"));
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar las películas");
        }*/

        // Actores de una película por id
        try {
            int movieId = 3;
            ResultSet resultSet = RawSql.select("""
                SELECT a.name
                FROM actors a
                JOIN actors_movies am ON a.imdb_id = am.actor_id
                JOIN movies m ON am.movie_id = m.imdb_id
                WHERE m.id = ?
            """, List.of(movieId));
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar los actores");
        }



    }

}
