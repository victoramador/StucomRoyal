package stucomroyal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import static stucomroyal.EntradaDatos.pedirEntero;
import static stucomroyal.EntradaDatos.pedirCadena;


public class Main {

    private static ListaJugadores lista;


    public static void main(String[] args) {

        int opcion;
        do {
            mostrarMenu();
            opcion = pedirEntero("Escoge opcion");
            
            switch (opcion) {
                
                case 1:

                    String usuario = EntradaDatos.pedirCadena("nombre de usuario: ");
                    Jugador nombre = lista.comprobarNombre(usuario);
                    String password = EntradaDatos.pedirCadena("contraseña de usuario: ");
                    Jugador pass = lista.comprobarPass(password);
                    //System.out.println("holii");
                    
                    if(nombre == null || pass == null){
                        System.out.println("Este usuario no existe");
                        break;
                    }
                    else{
                        System.out.println("Bienvenido "+usuario+", estas son tus cartas:");
                        buscarCartas();
                    }
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                
                case 4:
                    System.out.println("¡OPERACION FINALIZADA!");
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }
        } while (opcion != 8);

    }

    
    public static void buscarCartas() {
        
        for (Jugador c : lista.getLista()) {
            System.out.println("  del cliente " + c.getNombre());
 
        }
    }
    
    
    
    
    
    
    /*
    
    private static void altaCliente() {
        String nombre;
        nombre = EntradaDatos.pedirCadena("Nombre: ");
        String Apellido;
        Apellido = EntradaDatos.pedirCadena("Apellido: ");
        String Telefono;
        Telefono = EntradaDatos.pedirCadena("Telefono: ");

        String respuesta;
        boolean VIP = false;
        do {
            respuesta = EntradaDatos.pedirCadena("Eres VIP? (SI/NO)");
            if (respuesta.equalsIgnoreCase("si")) {
                VIP = true;
            } else if (respuesta.equalsIgnoreCase("no")) {
                VIP = false;
            } else {
                System.out.println("respuesta incorrecta. escribe si o no");
            }
        } while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("no"));
        Cliente c = new Cliente(nombre, Apellido, Telefono, VIP);
        clientes.alta(c);
        miFichero.grabar(clientes);
        System.out.println("Cliente dado de alta.");
    }
    
    private static void nuevoPresupuesto(Cliente c) {
        Random ran = new Random();
        int numId = ran.nextInt((32452562-3)+1)*25;
        
        String concepto = EntradaDatos.pedirCadena("concepto");
        Double importeNeto = EntradaDatos.pedirDouble("importe");
        String estado = EntradaDatos.pedirCadena("estado");
        Presupuesto presupuestos = new Presupuesto (numId,concepto,importeNeto,estado);
        c.getPresupuestos().alta(presupuestos);
        miFichero.grabar(clientes);
        System.out.println("Presupuesto dado de alta.");

    }
    
    public static void obtenerPresupuestos() {
        System.out.println("Presupuestos pendientes");
        for (Cliente c : clientes.getLista()) {
            System.out.println("Presupuestos del cliente " + c.getNombre());
            for (Presupuesto p : c.getPresupuestos().getLista()) {
                System.out.println(p);
            }
        }
    }

    public static void PresupuestoRechazado() {
        Presupuesto p = null;
        for (Cliente c : clientes.getLista()) {
            p = c.getPresupuestos().obtenerPresupuestoEstado("rechazado");
            System.out.println(p);
        }
    }

    public static void obtenerTotales() {
        for (Cliente cl : clientes.getLista()) {
            System.out.println(cl + "  " + cl.getPresupuestos().getLista().size());
            System.out.println("TOTALES");
        }
    }

    
    public static void presupuestoEspecifico(Cliente c){
        if (c == null) {
            System.out.println("no existe introduce uno correcto");
        } else {
            for (Presupuesto p : c.getPresupuestos().getLista()) {
                System.out.println(p);
            }
        }
    }
    
    private static void estadoPresupuesto(){
        
    int idPresupuesto = EntradaDatos.pedirEntero("Introduce el numero de presupuesto");
    Presupuesto presupuesto = clientes.obtenerPresupuestoPorId(idPresupuesto);
    
    if (presupuesto == null) {
        System.out.println("No existe este presupuesto");
    } 
    else {
        System.out.println("El estado del presupuesto es: " + presupuesto.getEstado());
        String respuesta;
        
        do {
            respuesta = EntradaDatos.pedirCadena("Introduzca el nuevo estado : rechazado, aceptado o pendiente");
        } 
        
        while (!respuesta.equalsIgnoreCase("rechazado") && !respuesta.equalsIgnoreCase("aceptado") && !respuesta.equalsIgnoreCase("pendiente"));
        presupuesto.setEstado(respuesta);
        
        if (clientes.substituirPresupuesto(idPresupuesto, presupuesto)){
            
            System.out.println("Estado Modificado!.");
            miFichero.grabar(clientes);
        } 
        
        else {
            System.out.println("No se ha podido modificar");
        }

    }
    
    
   
}
 */
 
    
    private static void mostrarMenu() {
        System.out.println("------- MENU -------");
        System.out.println("1. Conseguir cartas ");
        System.out.println("2. Batalla ");
        System.out.println("3. Obtener el ranking de jugadores por nº de trofeos ");
        System.out.println("4. SALIR");
    }
}