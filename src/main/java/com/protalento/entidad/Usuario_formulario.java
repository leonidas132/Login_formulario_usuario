package com.protalento.entidad;

import java.time.LocalDate;

public class Usuario_formulario {
    private String id;
    private Documento documento;
    private String nombre;
    private String Apellido;
    private LocalDate fechaNacimiento;

    public Usuario_formulario() {
    }

    public Usuario_formulario(String id, Documento documento, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.id = id;
        this.documento = documento;
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

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
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
        return "Usuario_formulario{" +
                "id='" + id + '\'' +
                ", documento=" + documento +
                ", nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
