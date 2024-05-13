package com.cipfpmislata.Ex3t_books.common.container;

import com.cipfpmislata.Ex3t_books.persistence.dao.CharactersDao;
import com.cipfpmislata.Ex3t_books.persistence.dao.jdbc.CharactersDaoJdbc;

public class CharacterIOC {
    public static CharactersDao charactersDao;

    public static CharactersDao getCharactersDao() {
        if (charactersDao==null){
            charactersDao = new CharactersDaoJdbc();
        }
        return charactersDao;
    }

    public static void setCharactersDao(CharactersDao charactersDao) {
        CharacterIOC.charactersDao = charactersDao;
    }
}
