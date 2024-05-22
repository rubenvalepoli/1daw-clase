package exam3.integration;

import exam3.domain.entity.Category;
import exam3.domain.entity.Shoes;
import exam3.domain.service.CategoryService;
import exam3.domain.service.ShoesService;
import exam3.domain.service.ShoesServiceImpl;
import exam3.exceptions.CategoryNotFoundException;
import exam3.exceptions.ShoesNotFoundException;
import exam3.persistance.dao.ShoesDao;
import exam3.persistance.repository.ShoesRepository;
import exam3.persistance.repository.ShoesRepositoryImpl;
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
    private final ShoesService shoesService = new ShoesServiceImpl(categoryServiceMock, shoesRepository);

    List<Shoes> shoesList = new ArrayList<>();

    Shoes shoes1 = new Shoes(1, "Rosa", 20.0);
    Shoes shoes2 = new Shoes(2, "Verde", 30.0);
    Shoes shoes3 = new Shoes(3, "Amarillo", 10.0, (new Category(1, "Sandalias")));

    @Nested
    public class NestedFindById{

        @Test
        @DisplayName("if shoes not found throws exception")
        void shoesNotFound() throws ShoesNotFoundException {
            when(shoesDaoMock.findShoesById(23)).thenThrow(NoSuchElementException.class);
            assertThrows(ShoesNotFoundException.class, () -> shoesService.findShoesById(23));
        }

        @Test
        @DisplayName("if shoes found, returns shoes")
        void shoesFound() throws ShoesNotFoundException {
            when(shoesDaoMock.findShoesById(2)).thenReturn(shoes2);
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
            when(shoesDaoMock.findShoesByCategoryId(1)).thenReturn(shoesList);
            assertEquals(shoesList, shoesService.findShoesByCategoryId(1));
        }

    }
}
