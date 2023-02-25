package com.example.ejercicio_u3_pw_p3_cc.service.to;

import java.time.LocalDateTime;

public class pacienteTo {

    private int id;
    private String cedula;
    private String nombre;
    private String apellido;
    private LocalDateTime fecha_nacimiento;
    private int codigo_seguro;
    private int estatura;
    private int peso;
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

    public int getCodigo_seguro() {
        return this.codigo_seguro;
    }

    public void setCodigo_seguro(int codigo_seguro) {
        this.codigo_seguro = codigo_seguro;
    }

    public int getEstatura() {
        return this.estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
