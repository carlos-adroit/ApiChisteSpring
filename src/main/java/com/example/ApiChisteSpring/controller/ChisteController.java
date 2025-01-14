package com.example.ApiChisteSpring.controller;

import com.example.ApiChisteSpring.model.Chiste;
import com.example.ApiChisteSpring.service.ChisteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChisteController {

    private final ChisteService chisteService;

    public ChisteController(ChisteService chisteService) {
        this.chisteService = chisteService;
    }

    @GetMapping("/chisteazar")
    public Chiste chisteazar() {
        Chiste chisteAzar = chisteService.obtenerChisteAleatorio();
        return chisteAzar;
    }

    @GetMapping("/chistetodos")
    public List<Chiste> chisteTodos() {
        List<Chiste> chistes = chisteService.todos();
        return chistes;
    }

}
