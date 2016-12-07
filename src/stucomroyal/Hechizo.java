
package stucomroyal;

public class Hechizo extends Cartas{
    
    private double alcance;
    private String modo;

    public Hechizo(double alcance, String modo, String nombre, int coste_elixir, double vida) {
        super(nombre, coste_elixir, vida);
        this.alcance = alcance;
        this.modo = modo;
    }
    
    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

}
