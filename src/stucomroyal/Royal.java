/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stucomroyal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DAM
 */
public class Royal {
    public static void main(String[] args) {
        
        Tropa tropa1 = new Tropa(34.4,"El destructor", 4, 85.3);
        Tropa tropa2 = new Tropa(24.1,"Eldelbar, el elfo", 2, 87);
        Tropa tropa3 = new Tropa(19.9,"Los chicos del maiz", 1, 60);
        
        Estructura Estructura1 = new Estructura(14.4,"Defensor", 1, 67);
        Estructura Estructura2 = new Estructura(24.6,"Hector, el wikipedia", 2, 70);
        Estructura Estructura3 = new Estructura(31.7,"Larry, el scoop", 3, 99);
        
        Hechizo hechizo1 = new Hechizo(12.2, "ataque", "atack boost", 2, 60.0);
        Hechizo hechizo2 = new Hechizo(15.6, "defensa", "defens boost", 4, 80.0);
        Hechizo hechizo3 = new Hechizo(11.1, "ataque", "atack boost v2.0", 5, 99.0);
        
        Jugador jugador1 = new Jugador("Larry", "larry", 0, 0);
        Jugador jugador2 = new Jugador("Hector", "hector", 0, 0);
        Jugador jugador3 = new Jugador("Fernando", "fernando", 0, 0);
        Jugador jugador4 = new Jugador("Sergio", "sergio", 0, 0);
        
        List<Cartas> listaCartas = new ArrayList<>();
        List<Jugador> listaJugadores = new ArrayList<>();
        
        listaCartas.add(tropa1);
        listaCartas.add(tropa2);
        listaCartas.add(tropa3);
        listaCartas.add(Estructura1);
        listaCartas.add(Estructura2);
        listaCartas.add(Estructura3);
        listaCartas.add(hechizo1);
        listaCartas.add(hechizo2);
        listaCartas.add(hechizo3);
        
        listaJugadores.add(jugador1);
        listaJugadores.add(jugador2);
        listaJugadores.add(jugador3);
        listaJugadores.add(jugador4);
        
        
    }
}
