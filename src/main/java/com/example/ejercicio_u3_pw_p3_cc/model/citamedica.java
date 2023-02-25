package com.example.ejercicio_u3_pw_p3_cc.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "cita_medica")
public class citamedica {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_cita_medica", sequenceName = "seq_cita_medica", allocationSize = 1)
    @Column(name = "cime_id")
    private int id;

    @Column(name = "cime_numero_cita")
    private int numero_cita;

    @Column(name = "cime_valor_cita")
    private double valor_cita;

    @Column(name = "cime_fecha_cita")
    private LocalDateTime fecha_cita;

    @Column(name = "cime_lugar_cita")
    private String lugar_cita;

    @Column(name = "cime_diagnostico")
    private String diagnostico;

    @Column(name = "cime_receta")
    private String receta;

    @Column(name = "cime_fecha_proxima_cita")
    private LocalDateTime fecha_proxima_cita;

    @ManyToOne
    @JoinColumn(name = "paci_id")
    private paciente paciente;
    @ManyToOne
    @JoinColumn(name = "doct_id")
    private doctor doctor;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_cita() {
        return this.numero_cita;
    }

    public void setNumero_cita(int numero_cita) {
        this.numero_cita = numero_cita;
    }

    public double getValor_cita() {
        return this.valor_cita;
    }

    public void setValor_cita(double valor_cita) {
        this.valor_cita = valor_cita;
    }

    public LocalDateTime getFecha_cita() {
        return this.fecha_cita;
    }

    public void setFecha_cita(LocalDateTime fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getLugar_cita() {
        return this.lugar_cita;
    }

    public void setLugar_cita(String lugar_cita) {
        this.lugar_cita = lugar_cita;
    }

    public String getDiagnostico() {
        return this.diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getReceta() {
        return this.receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public LocalDateTime getFecha_proxima_cita() {
        return this.fecha_proxima_cita;
    }

    public void setFecha_proxima_cita(LocalDateTime fecha_proxima_cita) {
        this.fecha_proxima_cita = fecha_proxima_cita;
    }

    public paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(paciente paciente) {
        this.paciente = paciente;
    }

    public doctor getDoctor() {
        return this.doctor;
    }

    public void setDoctor(doctor doctor) {
        this.doctor = doctor;
    }

}
