
package stucomroyal;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fichero {
    private String nombre;

    public Fichero(String nombre) {
        this.nombre = nombre;
    }
    
    public void grabar(Object o){
        try {
            XMLEncoder codificador = new XMLEncoder(new FileOutputStream(new File(nombre)));
            codificador.writeObject(o);
            codificador.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error al escribir "+ ex.getMessage());
        }
    }
    
    public Object leer(){
        try {
            XMLDecoder decodificador = new XMLDecoder (new FileInputStream(new File(nombre)));
            Object o = decodificador.readObject();
            return o;
        } catch (FileNotFoundException ex) {
            System.out.println("Error al leer "+ ex.getMessage());
            return null;
        }
        
    }
    
}
