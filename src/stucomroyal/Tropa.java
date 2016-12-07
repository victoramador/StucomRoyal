package stucomroyal;

public class Tropa extends Cartas{
    
    private double ataque;

    public Tropa(double ataque, String nombre, int coste_elixir, double vida) {
        super(nombre, coste_elixir, vida);
        this.ataque = ataque;
    }
   

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

 

}
