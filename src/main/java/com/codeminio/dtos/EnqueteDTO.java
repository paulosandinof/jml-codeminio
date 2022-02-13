package com.codeminio.dtos;

import java.util.ArrayList;
import java.util.List;

public class EnqueteDTO {

    private /*@ spec_public @*/ String titulo;
    private /*@ spec_public @*/ String dataLimite;
    private /*@ spec_public @*/ List<String> alternativas;

    /*@ assignable alternativas;
    @ ensures alternativas.size() == 2;
    @*/
    public EnqueteDTO() {
        this.alternativas = new ArrayList<String>();
        this.alternativas.add("");
        this.alternativas.add("");
    }

    public /*@ pure @*/ String getTitulo() {
        return this.titulo;
    }

    /*@
    @ requires titulo != null;
    @ assignable titulo;
    @ ensures titulo != null;
    @*/
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public /*@ pure @*/ String getDataLimite() {
        return this.dataLimite;
    }

    /*@
    @ requires dataLimite != null;
    @ assignable dataLimite;
    @ ensures dataLimite != null;
    @*/
    public void setDataLimite(String dataLimite) {
        this.dataLimite = dataLimite;
    }

    public /*@ pure @*/ List<String> getAlternativas() {
        return this.alternativas;
    }

    /*@
    @ requires alternativas != null && alternativas.size() > 0;
    @ assignable alternativas;
    @ ensures alternativas != null && alternativas.size() > 0;
    @*/
    public void setAlternativas(List<String> alternativas) {
        this.alternativas = alternativas;
    }

    /*@
    @ requires alternativa != null;
    @ ensures alternativas.size() == \old(alternativas.size()) + 1;
    @*/
    public void setAlternativas(String alternativa) {
        this.alternativas.add(alternativa);
    }
}
