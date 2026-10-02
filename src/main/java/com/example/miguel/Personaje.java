package com.example.miguel;

import java.util.UUID;

public class Personaje {
    private UUID id;
    private String nombre;
    private Integer defensas;
    private Integer ataque;
    private String civilizacion;

    public Personaje() {
    }

    public Personaje(Integer ataque, String civilizacion, Integer defensas, UUID id, String nombre) {
        this.ataque = ataque;
        this.civilizacion = civilizacion;
        this.defensas = defensas;
        this.id = id;
        this.nombre = nombre;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDefensas() {
        return defensas;
    }

    public void setDefensas(Integer defensas) {
        this.defensas = defensas;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public String getCivilizacion() {
        return civilizacion;
    }

    public void setCivilizacion(String civilizacion) {
        this.civilizacion = civilizacion;
    }

    

    
}