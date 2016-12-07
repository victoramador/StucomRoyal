
package stucomroyal;

public class Cartas {
    
    private String nombre;
    private int coste_elixir;
    private double vida;

    public Cartas(String nombre, int coste_elixir, double vida) {
        this.nombre = nombre;
        this.coste_elixir = coste_elixir;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoste_elixir() {
        return coste_elixir;
    }

    public void setCoste_elixir(int coste_elixir) {
        this.coste_elixir = coste_elixir;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    

    
    
}
