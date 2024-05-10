package daw.examen.persistence.zdao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import daw.examen.domain.entinty.Director;

public class DirectorMapper {

    private static Integer id;
    private static String name;

    public static Director toDirector(ResultSet resultSet) throws SQLException {

        if (!resultSet.next()) {
            return null;
        }

        id = resultSet.getInt("id");
        name = resultSet.getString("name");

        return new Director(id, name);
    }

    public static List<Director> toDirectorList(ResultSet resultSet) throws SQLException {

        List<Director> directorList = new ArrayList<>();

        while (resultSet.next()) {

            id = resultSet.getInt("id");
            name = resultSet.getString("name");

            directorList.add(new Director(id, name));
        }

        return directorList;
    }

}
