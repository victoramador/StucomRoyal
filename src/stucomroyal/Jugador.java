/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stucomroyal;

public class Jugador {
    
    private String nombre;
    private String password;
    private int num_trofeos;
    private int cant_cartas;

    public Jugador(String nombre, String password, int num_trofeos, int cant_cartas) {
        this.nombre = nombre;
        this.password = password;
        this.num_trofeos = num_trofeos;
        this.cant_cartas = cant_cartas;
    }

    public int getCant_cartas() {
        return cant_cartas;
    }

    public void setCant_cartas(int cant_cartas) {
        this.cant_cartas = cant_cartas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNum_trofeos() {
        return num_trofeos;
    }

    public void setNum_trofeos(int num_trofeos) {
        this.num_trofeos = num_trofeos;
    }

    @Override
    public String toString() {
        return super.toString();
    }



    

}
