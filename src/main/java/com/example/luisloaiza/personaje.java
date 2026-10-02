package com.example.luisloaiza;

public class personaje {
    private  UUID id;
    private String nombre;
    private Integer defensa;
    private Integer ataque;
    private String civilizacion;

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDefensa() {
        return defensa;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public String getCivilizacion() {
        return civilizacion;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public void setCivilizacion(String civilizacion) {
        this.civilizacion = civilizacion;
    }


}
