package org.example.domain.service.impl;

import org.example.controller.Car;
import org.example.domain.service.IndicatorService;
import org.example.exception.ResourceNotFoundException;
import org.example.persistence.repository.CarRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CarServiceImplTest {

    @Mock
    private CarRepository carRepositoryMock;
    @Mock
    private IndicatorService indicatorServiceMock;

    @InjectMocks
    private CarServiceImpl carService;


    Car car1 = new Car("1A","Ford","Fiesta",70);
    Car car2 = new Car("2B","Ople","Zafira",80);
    Car car3 = new Car("3C","Ferrari","Enzo",70);
    Car car4 = new Car("4D","Audi","R8",100);

    List<Car> carList = new ArrayList<>();

    @Nested
    public class NestedGetAll{

        @Test
        @DisplayName("return void List")
        void returnListOff(){
            when(carRepositoryMock.findAll()).thenReturn(carList);
            assertEquals(carList, carService.findAll());
        }

        @Test
        @DisplayName("return all accounts")
        void returnAllAccounts(){
            carList.add(car1);
            carList.add(car2);
            carList.add(car3);
            carList.add(car4);
            when(carRepositoryMock.findAll()).thenReturn(carList);
            assertEquals(carList, carService.findAll());
        }
    }


    @Nested
    public class NestedFindCarByPlate{

       @Test
        @DisplayName("Plate number doesen't exist")
        void plateNumberNotExits() throws ResourceNotFoundException {
            when(carRepositoryMock.findByPlate("1efeef")).thenThrow( ResourceNotFoundException.class);
            assertThrows( ResourceNotFoundException.class, () -> carService.findByPlate("1efeef"));
        }
        @Test
        @DisplayName("Plate number exist")
        void plateNumberExits() throws  ResourceNotFoundException {
            when(carRepositoryMock.findByPlate("1A")).thenReturn(car1);
            assertEquals(car1, carService.findByPlate("1A"));
        }
    }

    @Nested
    public class NestedAccelerate{

       @Test
        @DisplayName("car should accelerate")
        void carShouldAccelerate(){
            carService.accelerate(car1,10.0);
            assertEquals(80.0,car1.getSpeed());
        }
       @Test
        @DisplayName("Notification by max speed not appear But de velocity is less than 120")
        void notificationNotAppears(){
            carService.accelerate(car1,10.0);
            verify(indicatorServiceMock).showMaxSpeedIndicator(false);
        }

       @Test
        @DisplayName("Notification by max speed appear But de velocity is more than 120 ")
        void notificationAppears(){
            carService.accelerate(car1,80.0);
            verify(indicatorServiceMock).showMaxSpeedIndicator(true);
        }

    }



}