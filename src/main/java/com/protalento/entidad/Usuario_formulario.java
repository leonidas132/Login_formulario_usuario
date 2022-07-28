package com.protalento.entidad;

import java.time.LocalDate;

public class Usuario_formulario {
    private String id;
    private String numeroDoc;
    private String tipoDoc;
    private String nombre;
    private String Apellido;
    private LocalDate fechaNacimiento;

    public Usuario_formulario() {
    }

    public Usuario_formulario(String id, String numeroDoc, String tipoDoc, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.id = id;
        this.numeroDoc = numeroDoc;
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        Apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return
                "id: " + id + " numeroDoc: " + numeroDoc + " tipoDoc: " + tipoDoc + " nombre: " + nombre  + " Apellido: " + Apellido +
                " fechaNacimiento: " + fechaNacimiento;
    }
}
