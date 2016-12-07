
package stucomroyal;

public class Estructura extends Cartas {
    
    private Double defensa;

    public Estructura(Double defensa, String nombre, int coste_elixir, double vida) {
        super(nombre, coste_elixir, vida);
        this.defensa = defensa;
    }

    public Double getDefensa() {
        return defensa;
    }

    public void setDefensa(Double defensa) {
        this.defensa = defensa;
    }

}
