package com.fpmislata.ex_3t_coches.controller;

import com.fpmislata.ex_3t_coches.domain.entity.Car;
import com.fpmislata.ex_3t_coches.domain.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cars")
public class CarController {
    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("")
    public String findAllCar(Model model){
        model.addAttribute("CarList",this.carService.findAll());
        return "carList";
    }
    @GetMapping("/{id}")
    public String findByIdCar(Model model, @PathVariable Integer id){
        model.addAttribute("car", this.carService.findById(id));
        return "carDetail";
    }
    @GetMapping("/add")
    public String insert(Model model){
        model.addAttribute("car", new Car());
        return "carform";
    }
    @PostMapping
    public String save(Car car){


    }
}
