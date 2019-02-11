/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.client.unapec.domain;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Estudiante {
    
    private Long id;
    private String cedula_estudiante;
    private String matricula_estudiante;
    private String carrera_abrev;
    private int creditos_total;
    private int creditos_cursados;
    private Date fecha_envio;

    public Estudiante() {
    }

    public Estudiante(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedula_estudiante() {
        return cedula_estudiante;
    }

    public void setCedula_estudiante(String cedula_estudiante) {
        this.cedula_estudiante = cedula_estudiante;
    }

    public String getMatricula_estudiante() {
        return matricula_estudiante;
    }

    public void setMatricula_estudiante(String matricula_estudiante) {
        this.matricula_estudiante = matricula_estudiante;
    }

    public String getCarrera_abrev() {
        return carrera_abrev;
    }

    public void setCarrera_abrev(String carrera_abrev) {
        this.carrera_abrev = carrera_abrev;
    }

    public int getCreditos_total() {
        return creditos_total;
    }

    public void setCreditos_total(int creditos_total) {
        this.creditos_total = creditos_total;
    }

    public int getCreditos_cursados() {
        return creditos_cursados;
    }

    public void setCreditos_cursados(int creditos_cursados) {
        this.creditos_cursados = creditos_cursados;
    }

    public Date getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(Date fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cedula_estudiante=" + cedula_estudiante + ", matricula_estudiante=" 
                + matricula_estudiante + ", carrera_abrev=" + carrera_abrev + ", creditos_total=" 
                + creditos_total + ", creditos_cursados=" + creditos_cursados + ", fecha_envio=" 
                + fecha_envio + '}';
    }
}
