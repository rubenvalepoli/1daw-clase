package examen3.domain.service;

import examen3.domain.entity.Category;
import examen3.domain.entity.Shoes;
import examen3.exceptions.CategoryNotFoundException;
import examen3.exceptions.ShoesNotFoundException;
import examen3.persistance.repository.ShoesRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ud5.practices.car3Eva.domain.service.IndicatorService;
import ud5.practices.car3Eva.persistence.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class ShoesServiceImplTest {

    @Mock
    private ShoesRepository shoesRepositoryMock;
    @Mock
    private CategoryService categoryServiceMock;



    @InjectMocks
    private ShoesServiceImpl shoesService;

    Shoes shoes1 = new Shoes(1,"pepe",20,(new Category(1, "Montanya")));
    Shoes shoes2 = new Shoes(2,"ana",30);
    Shoes shoes3 = new Shoes(3,"pablo",40);
    List<Shoes> shoesList = new ArrayList<>();



    @Nested
    public class NestedFindByShoesId{

        @Test
        @DisplayName("Shoes id doesen't exist")
        void shoesIdNotExist() throws ShoesNotFoundException {
            when(shoesRepositoryMock.findShoesById(5)).thenThrow(ShoesNotFoundException.class);
            assertThrows(ShoesNotFoundException.class, () -> shoesService.findShoesById(5));
        }
        @Test
        @DisplayName("Shoes id exist")
        void shoesIdExist() throws ShoesNotFoundException {
            when(shoesRepositoryMock.findShoesById(1)).thenReturn(shoes1);
            assertEquals(shoes1, shoesService.findShoesById(1));

        }
    }

    @Nested
    public class  NestedFindShoesByCategoryId{

        @Test
        @DisplayName("category not exist exception")
        void classNotExistException() throws CategoryNotFoundException {
            when(categoryServiceMock.findCategoryById(3)).thenThrow(CategoryNotFoundException.class);
            assertThrows(CategoryNotFoundException.class,()-> shoesService.findShoesByCategoryId(3));
        }

        @Test
        @DisplayName("category exist return list")
        void shoesReturnList() throws CategoryNotFoundException {
            shoesList.add(shoes1);
            shoesList.add(shoes2);
            shoesList.add(shoes3);
            when(shoesRepositoryMock.findShoesByCategoryId(3)).thenReturn(shoesList);
            assertEquals(shoesList, shoesService.findShoesByCategoryId(3));

        }


    }

}