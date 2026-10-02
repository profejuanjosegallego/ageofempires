package com.example.camilovalencia;

import java.util.UUID;

public class Personaje {
    
    private UUID id;
    private String nombre;
    private Integer defensa;
    private Integer ataque;
    private String civilizacion;

    public Personaje(UUID id, String nombre, Integer defensa, Integer ataque, String civilizacion) {
        this.id = id;
        this.nombre = nombre;
        this.defensa = defensa;
        this.ataque = ataque;
        this.civilizacion = civilizacion;
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

    public Integer getDefensa() {
        return defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
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
