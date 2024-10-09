package com.notas.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.notas.modelo.Nota;
import com.notas.repositorio.NotaRepositorio;

@Service
public class NotaServicio {

    @Autowired
    private NotaRepositorio notaRepositorio;

    public List<Nota> obtenerNotas() {
        return notaRepositorio.findAll();
    }

    public Nota guardarNota(Nota nota) {
        return notaRepositorio.save(nota);
    }

    public Nota obtenerNotaPorId(Long id) {
        return notaRepositorio.findById(id).orElse(null);
    }
}
