package com.notas.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Nota {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    private String estudiante;
    private double actividades;
    private double primerParcial;
    private double segundoParcial;
    private double examenFinal;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public double getActividades() {
        return actividades;
    }

    public void setActividades(double actividades) {
        this.actividades = actividades;
    }

    public double getPrimerParcial() {
        return primerParcial;
    }

    public void setPrimerParcial(double primerParcial) {
        this.primerParcial = primerParcial;
    }

    public double getSegundoParcial() {
        return segundoParcial;
    }

    public void setSegundoParcial(double segundoParcial) {
        this.segundoParcial = segundoParcial;
    }

    public double getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }

    public double calcularPuntajeTotal() {
        return actividades + primerParcial + segundoParcial + examenFinal;
    }
}
