package com.fpmislata.ex_3t_coches.controller;

import com.fpmislata.ex_3t_coches.domain.service.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClienteController {
    ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @GetMapping("")
    public String findAllCar(Model model){
        model.addAttribute("ClientList",this.clienteService.findAll());
        return "clientList";
    }
    @GetMapping("/{id}")
    public String findByIdCar(Model model, @PathVariable Integer id){
        model.addAttribute("client", this.clienteService.findById(id));
        return "clientDetail";
    }
    @DeleteMapping("/{id}")
    public String delete(Model model, @PathVariable Integer id){
      clienteService.delete(id);
        return "redirect:/clientList";
    }
}
