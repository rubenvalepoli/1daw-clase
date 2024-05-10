package daw.examen.persistence.zdao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import daw.examen.domain.entinty.Actor;
import daw.examen.domain.entinty.Director;
import daw.examen.domain.entinty.Movie;

public class MovieMapper {

    public static Movie toMovie(ResultSet resultSet) throws SQLException {

        if (!resultSet.next()) {
            return null;
        }

        Integer id = resultSet.getInt("id");
        String title = resultSet.getString("title");
        Director director = null;
        List<Actor> actorList = new ArrayList<>();
        Integer year = resultSet.getInt("year");

        return new Movie(id, title, director, actorList, year);

    }

    public static List<Movie> toMovieList(ResultSet resultSet) throws SQLException {

        List<Movie> movieList = new ArrayList<>();

        while (resultSet.next()) {

            Integer id = resultSet.getInt("id");
            String title = resultSet.getString("title");
            Director director = null;
            List<Actor> actorList = new ArrayList<>();
            Integer year = resultSet.getInt("year");

            movieList.add(new Movie(id, title, director, actorList, year));
        }

        return movieList;
    }

}