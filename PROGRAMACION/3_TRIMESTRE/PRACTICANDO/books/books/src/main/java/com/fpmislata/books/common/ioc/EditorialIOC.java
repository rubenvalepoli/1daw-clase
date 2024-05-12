package com.fpmislata.books.common.ioc;

import com.fpmislata.books.domain.service.EditorialService;
import com.fpmislata.books.domain.service.impl.EditorialServiceImpl;
import com.fpmislata.books.persistence.Dao.BookDao;
import com.fpmislata.books.persistence.Dao.EditorialDao;
import com.fpmislata.books.persistence.Dao.jdbc.impl.BookDaobdImpl;
import com.fpmislata.books.persistence.Dao.jdbc.impl.EditorialDaobdImpl;
import com.fpmislata.books.persistence.repository.EditorialRepository;
import com.fpmislata.books.persistence.repository.impl.EditorialRepositoryImpl;

public class EditorialIOC {
    private static EditorialService editorialService;
    private static EditorialDao editorialDao;
    private static EditorialRepository editorialRepository;

    public static EditorialService getEditorialService(){
        if (editorialService==null){
            editorialService= new EditorialServiceImpl(getEditorialRepository());
        }
        return editorialService;
    }



    public static EditorialDao getEditorialDao(){
        if (editorialDao==null){
            editorialDao= new EditorialDaobdImpl();
        }
        return editorialDao;
    }



    public static EditorialRepository getEditorialRepository(){
        if (editorialRepository == null) {
            editorialRepository= new EditorialRepositoryImpl(getEditorialDao());
        }
        return editorialRepository;

    }

}
