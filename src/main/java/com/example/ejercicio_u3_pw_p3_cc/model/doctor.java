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
@Table(name = "doctor")
public class doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_doctor", sequenceName = "seq_doctor", allocationSize = 1)
    @Column(name = "doct_id")
    private int id;

    @Column(name = "doct_cedula")
    private String cedula;

    @Column(name = "doct_nombre")
    private String nombre;

    @Column(name = "doct_apellido")
    private String apellido;

    @Column(name = "doct_fecha_nacimiento")
    private LocalDateTime fecha_nacimiento;

    @Column(name = "doct_numero_consultorio")
    private int numero_consultorio;

    @Column(name = "doct_codigo_senecyt")
    private int codigo_senecyt;

    @Column(name = "doct_genero")
    private String genero;

    @OneToMany(mappedBy = "doctor")
    private List<citamedica> citaMedicas;

    public List<citamedica> getCitaMedicas() {
        return this.citaMedicas;
    }

    public void setCitaMedicas(List<citamedica> citaMedicas) {
        this.citaMedicas = citaMedicas;
    }

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
