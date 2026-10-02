
import java.util.UUID;

public class personaje {

    private UUID id;
    private  String nombre;
    private Integer defensa;
    private Integer ataque;
    private Integer civilizacion;
    public personaje() {
    }
    public personaje(UUID id, String nombre, Integer defensa, Integer ataque, Integer civilizacion) {
        this.id = id;
        this.nombre = nombre;
        this.defensa = defensa;
        this.ataque = ataque;
        this.civilizacion = civilizacion;
    }
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
    public Integer getCivilizacion() {
        return civilizacion;
    }


    
}
