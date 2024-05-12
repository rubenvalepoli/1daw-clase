package com.fpmislata.books.persistence.Dao.jdbc.mapper;

import com.fpmislata.books.domain.entity.Book;
import com.fpmislata.books.domain.entity.CharacterMovie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CharacterMovieMapper {

    public static CharacterMovie toCharacterMovie (ResultSet resultSet){
        if (resultSet == null){
            return null;
        }
        try{
            return new CharacterMovie(
                    resultSet.getInt("c.id"),
                    resultSet.getString("c.name"),
                    new Book(resultSet.getInt("b.id"),resultSet.getString("b.name"),resultSet.getInt("year"))

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
                throw  new RuntimeException(e);
            }
            characterMovieList.add(toCharacterMovie(resultSet));
        }
        return characterMovieList;
    }

}
