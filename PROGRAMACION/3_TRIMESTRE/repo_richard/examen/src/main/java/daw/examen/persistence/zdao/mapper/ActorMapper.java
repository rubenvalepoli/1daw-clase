package daw.examen.persistence.zdao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import daw.examen.domain.entinty.Actor;

public class ActorMapper {

    private static Integer id;
    private static String name;

    public static Actor toActor(ResultSet resultSet) throws SQLException {

        if (!resultSet.next()) {
            return null;
        }

        id = resultSet.getInt("id");
        name = resultSet.getString("name");

        return new Actor(id, name);
    }

    public static List<Actor> toActorList(ResultSet resultSet) throws SQLException {

        List<Actor> actorList = new ArrayList<>();

        while (resultSet.next()) {

            id = resultSet.getInt("id");
            name = resultSet.getString("name");

            actorList.add(new Actor(id, name));
        }

        return actorList;
    }

}
