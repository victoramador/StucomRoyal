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
public class ListaCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Cartas> listaCartas = new ArrayList<>();        
        Tropa tropa1 = new Tropa(34.4,"El destructor", 4, 85.3);
        Tropa tropa2 = new Tropa(24.1,"Eldelbar, el elfo", 2, 87);
        Tropa tropa3 = new Tropa(19.9,"Los chicos del maiz", 1, 60);
        
        Estructura Estructura1 = new Estructura(14.4,"Defensor", 1, 67);
        Estructura Estructura2 = new Estructura(24.6,"Hector, el wikipedia", 2, 70);
        Estructura Estructura3 = new Estructura(31.7,"Larry, el scoop", 3, 99);
        
        Hechizo hechizo1 = new Hechizo(12.2, "ataque", "atack boost", 2, 60.0);
        Hechizo hechizo2 = new Hechizo(15.6, "defensa", "defens boost", 4, 80.0);
        Hechizo hechizo3 = new Hechizo(11.1, "ataque", "atack boost v2.0", 5, 99.0);
    }
    
}
