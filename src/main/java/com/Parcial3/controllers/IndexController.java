package com.Parcial3.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class IndexController {

    IndexController() {

    }

    @GetMapping("/")
    public String elecion(Model modelo){

        return "index";
    }


    @GetMapping("/new")
    public void muestra(Model modelo){

    }

    @PostMapping("/")
    public void confirmar(Model modelo){

    }

}
