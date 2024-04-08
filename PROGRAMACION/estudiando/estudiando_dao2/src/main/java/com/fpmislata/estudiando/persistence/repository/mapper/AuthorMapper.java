package com.fpmislata.estudiando.persistence.repository.mapper;

import com.fpmislata.estudiando.domain.entity.Author;
import com.fpmislata.estudiando.persistence.dao.entity.AuthorEntity;

import java.util.ArrayList;
import java.util.List;

public class AuthorMapper {

    public static Author toAuthor(AuthorEntity authorEntity){
        if (authorEntity == null){
            return null;
        }
        return new Author(
                authorEntity.getId(),
                authorEntity.getAuthor()
        );
    }

    public static List<Author> toAuthorList(List<AuthorEntity> authorEntityList){
        List<Author> authorList = new ArrayList<>();
        for (AuthorEntity authorEntity : authorEntityList){
            authorList.add(toAuthor(authorEntity));
        }
        return authorList;
    }

}
