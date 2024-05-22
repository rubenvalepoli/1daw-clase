/*
package org.example;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

public class p {@ExtendWith(MockitoExtension.class)
class ShoesServiceImplTest {

    @Mock
    private ShoesRepository shoesRepositoryMock;
    @Mock
    private CategoryService categoryServiceMock;
    @InjectMocks
    private ShoesServiceImpl shoesService;

    Shoes shoes1 = new Shoes(1,"pepe",20);
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
        @DisplayName("category not exist")
        void classNotExist() throws CategoryNotFoundException {
            shoesList.add(shoes1);
            shoesList.add(shoes2);
            shoesList.add(shoes3);
            when(categoryServiceMock.findCategoryById(1)).thenThrow(CategoryNotFoundException.class);
            assertThrows(CategoryNotFoundException.class,()-> shoesService.findShoesByCategoryId(1));
        }

*/
/*        @Test
        @DisplayName("category exist")
        void shoesListNot() throws CategoryNotFoundException {
            shoesList.add(shoes1);*//*
*/
/*
            shoesList.add(shoes2);
            shoesList.add(shoes3);*//*
*/
/*
            when(categoryServiceMock.findCategoryById(1)).thenReturn(categoryList);
            assertEquals(shoesList, shoesService.findShoesByCategoryId(1));

        }*//*



    }
}
*/
