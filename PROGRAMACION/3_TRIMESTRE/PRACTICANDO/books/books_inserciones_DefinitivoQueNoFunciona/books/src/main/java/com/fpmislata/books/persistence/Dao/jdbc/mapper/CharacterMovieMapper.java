package com.fpmislata.books.persistence.Dao.jdbc.mapper;

import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.entity.CharacterMovie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CharacterMovieMapper {

    public static CharacterMovie toCharacterMovieWithBook (ResultSet resultSet){
        if (resultSet == null){
            return null;
        }
        try{
            return new CharacterMovie(
                    resultSet.getInt("c.id"),
                    resultSet.getString("c.name"),
                    new Book (resultSet.getInt("b.id"), resultSet.getString("b.name"), resultSet.getInt("b.year"))
            );
        } catch (SQLException e){
            throw new RuntimeException("Error al mapear el CharacterMovie",e);
        }
    }

    public static CharacterMovie toCharacterMovieNoBook (ResultSet resultSet){
        if (resultSet == null){
            return null;
        }
        try{
            return new CharacterMovie(
                    resultSet.getInt("c.id"),
                    resultSet.getString("c.name")
            );
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }


    public static List<CharacterMovie> toCharacterMovieList(ResultSet resultSet){

        List<CharacterMovie> characterMovieList = new ArrayList<>();
        while (true) {
            try {
                if (!resultSet.next()) break;
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
            characterMovieList.add(toCharacterMovieWithBook(resultSet));
        }
        return characterMovieList;
    }

    public static List<CharacterMovie> toCharacterMovieListNoBook(ResultSet resultSet){

        List<CharacterMovie> characterMovieList = new ArrayList<>();
        while (true) {
            try {
                if (!resultSet.next()) break;
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
            characterMovieList.add(toCharacterMovieNoBook(resultSet));
        }
        return characterMovieList;
    }

}
