package com.example.ejercicio_u3_pw_p3_cc.service.to;

import java.time.LocalDateTime;

public class doctorTo {

    private int id;
    private String cedula;
    private String nombre;
    private String apellido;
    private LocalDateTime fecha_nacimiento;
    private int numero_consultorio;
    private int codigo_senecyt;
    private String genero;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getFecha_nacimiento() {
        return this.fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDateTime fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getNumero_consultorio() {
        return this.numero_consultorio;
    }

    public void setNumero_consultorio(int numero_consultorio) {
        this.numero_consultorio = numero_consultorio;
    }

    public int getCodigo_senecyt() {
        return this.codigo_senecyt;
    }

    public void setCodigo_senecyt(int codigo_senecyt) {
        this.codigo_senecyt = codigo_senecyt;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
