package com.protalento.entidad;

public class Documento {
    private String numeroDoc;
    private String tipoDoc;

    public Documento() {
    }

    public Documento(String numeroDoc, String tipoDoc) {
        this.numeroDoc = numeroDoc;
        this.tipoDoc = tipoDoc;
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

    @Override
    public String toString() {
        return "numeroDoc: " + numeroDoc + " tipoDoc: " + tipoDoc;
    }
}
