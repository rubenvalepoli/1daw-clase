package exam3.unit.domain;

import exam3.domain.entity.Category;
import exam3.domain.entity.Shoes;
import exam3.domain.service.CategoryService;
import exam3.domain.service.ShoesServiceImpl;
import exam3.exceptions.CategoryNotFoundException;
import exam3.exceptions.ShoesNotFoundException;
import exam3.persistance.repository.ShoesRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ShoesServiceImplTest {

    @Mock
    private CategoryService categoryServiceMock;
    @Mock
    private ShoesRepository shoesRepositoryMock;
    @InjectMocks
    private ShoesServiceImpl shoesService;

    List<Shoes> shoesList = new ArrayList<>();

    Shoes shoes1 = new Shoes(1, "Rosa", 20.0);
    Shoes shoes2 = new Shoes(2, "Verde", 30.0);
    Shoes shoes3 = new Shoes(3, "Amarillo", 10.0, (new Category(1, "Sandalias")));


    @Nested
    public class NestedFindById{

        @Test
        @DisplayName("if shoes not found throws exception")
        void shoesNotFound() throws ShoesNotFoundException {
            when(shoesRepositoryMock.findShoesById(23)).thenThrow(ShoesNotFoundException.class);
            assertThrows(ShoesNotFoundException.class, () -> shoesService.findShoesById(23));
        }

        @Test
        @DisplayName("if shoes found, returns shoes")
        void shoesFound() throws ShoesNotFoundException {
            when(shoesRepositoryMock.findShoesById(2)).thenReturn(shoes2);
            assertEquals(shoes2, shoesService.findShoesById(2));
        }

    }

    @Nested
    public class NestedFindShoesByCategoryId{

        @Test
        @DisplayName("if category not found throws exception")
        void categoryNotFound() throws CategoryNotFoundException {
            when(categoryServiceMock.findCategoryById(2)).thenThrow(CategoryNotFoundException.class);
            assertThrows(CategoryNotFoundException.class, () -> shoesService.findShoesByCategoryId(2));
        }

        @Test
        @DisplayName("if category found, returns shoesList")
        void categoryFound() throws CategoryNotFoundException {
            shoesList.add(shoes1);
            shoesList.add(shoes2);
            shoesList.add(shoes3);
            when(shoesRepositoryMock.findShoesByCategoryId(1)).thenReturn(shoesList);
            assertEquals(shoesList, shoesService.findShoesByCategoryId(1));
        }
    }
}