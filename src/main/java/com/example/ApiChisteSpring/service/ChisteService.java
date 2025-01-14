package com.example.ApiChisteSpring.service;

import com.example.ApiChisteSpring.model.Chiste;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChisteService {

    private List<Chiste> chistes;

    public ChisteService() {
        chistes = new ArrayList<>();
        chistes.add(new Chiste("¿Qué le dice un 0 a un 8? Bonito cinturón."));
        chistes.add(new Chiste("¿Qué hace una abeja en el gimnasio? ¡Zum-ba!"));
        chistes.add(new Chiste("¿Cuál es el colmo de un electricista? Que su hijo sea un apagado."));
        chistes.add(new Chiste("¿Por qué estás hablando con la pared? ¡Porque la mesa no me responde!"));
    }

    public Chiste obtenerChisteAleatorio() {
        return chistes.get( (int)( Math.random() * chistes.size() ) );
    }

    public List<Chiste> todos() {
        return chistes;
    }

}
