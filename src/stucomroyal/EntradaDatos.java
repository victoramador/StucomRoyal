
package stucomroyal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDatos {
    
    public static Double pedirDouble(String mensaje){
        
        Double numero=0.0;
        boolean error;
        
        do{
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println(mensaje);
                numero = Double.parseDouble(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("error entrada y salida");
                error =true;
            } catch (NumberFormatException ex) {
                System.out.println("error, introduce un numero");
                error=false;
            } 
        } while (error);
        return numero;
    }
    
    
    
    public static int pedirEntero(String mensaje){
        
        int numero=0;
        boolean error;
        
        do{
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println(mensaje);
                numero = Integer.parseInt(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("error entrada y salida");
                error =true;
            } catch (NumberFormatException ex) {
                System.out.println("error, introduce un numero");
                error=false;
            } 
        } while (error);
        return numero;
    }
    
    
    public static String pedirCadena(String mensaje){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean error;
        String respuesta = "";
        do{
            try{
                System.out.println(mensaje);
                respuesta = br.readLine();
                error=false;
            } catch (IOException ex){
                System.out.println("Error de entrada / salida");
                error=true;
            }
            
        } while (error);
        return respuesta;
    }

    public static int pedirEntero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
