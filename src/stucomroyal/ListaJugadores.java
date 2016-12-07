package stucomroyal;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaJugadores implements Serializable {

    private ArrayList<Jugador> lista;
    

        
        Jugador jugador1 = new Jugador("Larry", "larry", 0, 0);
        Jugador jugador2 = new Jugador("Hector", "hector", 0, 0);
        Jugador jugador3 = new Jugador("Fernando", "fernando", 0, 0);
        Jugador jugador4 = new Jugador("Sergio", "sergio", 0, 0);
        
    
    
    

    public ListaJugadores() {
        lista = new ArrayList<>();
    }

    public void alta(Jugador g) {
        lista.add(g);
    }
    
    public void baja(Jugador g) {
        lista.remove(g);
    }

    public Jugador comprobarNombre(String nombre) {
        for (Jugador g : lista) {
            if (g.getNombre().equalsIgnoreCase(nombre)) {
                return g;
            }
        }
        return null;
    }
    
    public Jugador comprobarPass(String pass) {
        for (Jugador g : lista) {
            if (g.getNombre().equalsIgnoreCase(pass)) {
                return g;
            }
        }
        return null;
    }
    
    public ArrayList<Jugador> getLista() {
        return lista;
    }
    
    public void setLista(ArrayList<Jugador> lista) {
        this.lista = lista;
    }
    
    
    
    
    
    
    
    /*
    
    
    public Jugador obtenerClientePorTelefono(String telefono) {
        for (Jugador g : lista) {
            if (g.getTelefono().equalsIgnoreCase(telefono)) {
                return g;
            }
        }
        return null;
    }
    
    public ArrayList<Jugador> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Jugador> lista) {
        this.lista = lista;
    }
    */
}
