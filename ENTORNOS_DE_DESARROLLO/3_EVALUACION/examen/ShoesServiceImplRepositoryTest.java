package exam3.integration;

import examen3.domain.entity.Category;
import examen3.domain.entity.Shoes;
import examen3.domain.service.CategoryService;
import examen3.domain.service.ShoesServiceImpl;
import examen3.exceptions.CategoryNotFoundException;
import examen3.exceptions.ShoesNotFoundException;
import examen3.persistance.dao.ShoesDao;
import examen3.persistance.repository.ShoesRepository;
import examen3.persistance.repository.ShoesRepositoryImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ShoesServiceImplRepositoryTest {

    private final ShoesDao shoesDaoMock = Mockito.mock(ShoesDao.class);
    private final CategoryService categoryServiceMock = Mockito.mock(CategoryService.class);
    private final ShoesRepository shoesRepository = new ShoesRepositoryImpl(shoesDaoMock);
    private final ShoesServiceImpl shoesService = new ShoesServiceImpl(categoryServiceMock, shoesRepository);

    Shoes shoes1 = new Shoes(1,"pepe",20, (new Category(1,"Montanya")));
    Shoes shoes2 = new Shoes(2,"ana",30);
    Shoes shoes3 = new Shoes(3,"pablo",40);


    List<Shoes> shoesList = new ArrayList<>();

    @Nested
    public class NestedFindByShoesId{

        @Test
        @DisplayName("Shoes id doesen't exist throw exception")
        void shoesIdNotExist() throws NoSuchElementException {
            when(shoesDaoMock.findShoesById(5)).thenThrow(NoSuchElementException.class);
            assertThrows(ShoesNotFoundException.class, () -> shoesService.findShoesById(5));
        }

        @Test
        @DisplayName("Shoes id exist")
        void shoesIdExist() throws ShoesNotFoundException {
            when(shoesDaoMock.findShoesById(1)).thenReturn(shoes1);
            assertEquals(shoes1, shoesService.findShoesById(1));

        }

    }



    @Nested
    public class  NestedFindShoesByCategoryId {

        @Test
        @DisplayName("category not exist")
        void classNotExist() throws CategoryNotFoundException {
            when(categoryServiceMock.findCategoryById(3)).thenThrow(CategoryNotFoundException.class);
            assertThrows(CategoryNotFoundException.class, () -> shoesService.findShoesByCategoryId(3));
        }

    }

    @Test
    @DisplayName("category exist returnShoes list")
    void shoesListExist() throws CategoryNotFoundException {
            shoesList.add(shoes1);
            shoesList.add(shoes2);
            shoesList.add(shoes3);
            when(shoesDaoMock.findShoesByCategoryId(2)).thenReturn(shoesList);
            assertEquals(shoesList, shoesService.findShoesByCategoryId(2));

        }



}
