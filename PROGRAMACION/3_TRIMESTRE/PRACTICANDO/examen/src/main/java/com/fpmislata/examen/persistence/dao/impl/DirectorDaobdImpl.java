package com.fpmislata.examen.persistence.dao.impl;

import com.fpmislata.examen.domain.entity.Director;
import com.fpmislata.examen.persistence.dao.DirectorDao;
import com.fpmislata.examen.persistence.dao.bd.rawSql;
import com.fpmislata.examen.persistence.dao.mapper.DirectorMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DirectorDaobdImpl implements DirectorDao {

    @Override
    public Director findDirectorById(int id){
        List<Object> listDirectorId = List.of(id);
        ResultSet resultSet = rawSql.select("select * from directors where id = ?;",listDirectorId);

        try {
            resultSet.next();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return DirectorMapper.toDirector(resultSet);
    }
}
