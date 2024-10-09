package com.notas.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.notas.modelo.Nota;
import com.notas.servicio.NotaServicio;
import java.util.List;

@RestController
@RequestMapping("/api/notas")
@CrossOrigin(origins = "http://localhost:3000")
public class NotaControlador {

    @Autowired
    private NotaServicio notaServicio;

    @GetMapping
    public List<Nota> obtenerTodasLasNotas() {
        return notaServicio.obtenerNotas();
    }

    @PostMapping
    public Nota guardarNota(@RequestBody Nota nota) {
        return notaServicio.guardarNota(nota);
    }

    @GetMapping("/{id}")
    public Nota obtenerNotaPorId(@PathVariable Long id) {
        return notaServicio.obtenerNotaPorId(id);
    }
}
