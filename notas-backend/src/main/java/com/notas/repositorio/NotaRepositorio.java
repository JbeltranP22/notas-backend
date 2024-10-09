package com.notas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.notas.modelo.Nota;

public interface NotaRepositorio extends JpaRepository<Nota, Long> {
}
