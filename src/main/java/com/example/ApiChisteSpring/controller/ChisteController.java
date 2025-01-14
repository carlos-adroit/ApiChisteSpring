package com.example.ApiChisteSpring.controller;

import com.example.ApiChisteSpring.model.Chiste;
import com.example.ApiChisteSpring.service.ChisteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChisteController {

    private final ChisteService chisteService;

    public ChisteController(ChisteService chisteService) {
        this.chisteService = chisteService;
    }

    @GetMapping("/chistes")
    public List<Chiste> obtenerTodosLosChistes() {
        return chisteService.todos();
    }

    @GetMapping("/chistes/{id}")
    public Chiste obtenerChistePorId(@PathVariable int id) {
        return chisteService.obtenerChiste(id);
    }

    @GetMapping("/chistes/aleatorio")
    public Chiste obtenerChisteAleatorio() {
        return chisteService.obtenerChisteAleatorio();
    }

    @PostMapping("/chistes")
    public void agregarNuevoChiste(@RequestBody Chiste chiste) {
        chisteService.agregarChiste(chiste);
    }

    @PutMapping("/chistes/{id}")
    public void actualizarChiste(@PathVariable int id, @RequestBody Chiste nuevoChiste) {
        chisteService.actualizarChiste(id, nuevoChiste);
    }

    @DeleteMapping("/chistes/{id}")
    public void eliminarChiste(@PathVariable int id) {
        chisteService.eliminarChiste(id);
    }

}
