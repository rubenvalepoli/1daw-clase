package com.cipfpmislata.Ex3t_books.common.container;

import com.cipfpmislata.Ex3t_books.domain.service.EditorialService;
import com.cipfpmislata.Ex3t_books.domain.service.impl.EditorialServiceImpl;
import com.cipfpmislata.Ex3t_books.persistence.repository.EditorialRepository;
import com.cipfpmislata.Ex3t_books.persistence.repository.impl.EditorialRepositoryImpl;
import com.cipfpmislata.Ex3t_books.persistence.dao.EditorialDao;
import com.cipfpmislata.Ex3t_books.persistence.dao.jdbc.EditorialDaoJdbc;

public class EditorialIOC {
    public static EditorialService editorialService;
    public static EditorialRepository editorialRepository;
    public static EditorialDao editorialDao;

   public static EditorialService getEditorialService(){
       if (editorialService==null){
           editorialService= new EditorialServiceImpl(getEditorialRepository());
       }
       return editorialService;
   }
   public static void setEditorialService(EditorialService editorialService){
       EditorialIOC.editorialService=editorialService;
   }
   public static EditorialRepository getEditorialRepository(){
       if (editorialRepository==null){
           editorialRepository = new EditorialRepositoryImpl(getEditorialDao());
       }
       return editorialRepository;
   }
   public static void setEditorialRepository(EditorialRepository editorialRepository){
       EditorialIOC.editorialRepository=editorialRepository;
   }
   public static void setEditorialDao(EditorialDao editorialDao){
       EditorialIOC.editorialDao=editorialDao;
   }
   public static EditorialDao getEditorialDao(){
       if(editorialDao==null){
           editorialDao=new EditorialDaoJdbc();
       }
       return editorialDao;
   }

}
