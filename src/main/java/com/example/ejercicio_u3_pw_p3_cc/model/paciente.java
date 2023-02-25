package com.example.ejercicio_u3_pw_p3_cc.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "paciente")
public class paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_paciente", sequenceName = "seq_paciente", allocationSize = 1)
    @Column(name = "paci_id")
    private int id;

    @Column(name = "paci_cedula")
    private String cedula;

    @Column(name = "paci_nombre")
    private String nombre;

    @Column(name = "paci_apellido")
    private String apellido;

    @Column(name = "paci_fecha_nacimiento")
    private LocalDateTime fecha_nacimiento;

    @Column(name = "paci_codigo_seguro")
    private int codigo_seguro;

    @Column(name = "paci_estatura")
    private int estatura;

    @Column(name = "paci_peso")
    private int peso;

    @Column(name = "paci_genero")
    private String genero;

    @OneToMany(mappedBy = "paciente")
    private List<citamedica> citaMedicas;

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

    public List<citamedica> getCitaMedicas() {
        return this.citaMedicas;
    }

    public void setCitaMedicas(List<citamedica> citaMedicas) {
        this.citaMedicas = citaMedicas;
    }

}
