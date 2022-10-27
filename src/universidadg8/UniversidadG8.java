

package universidadg8;

import java.time.LocalDate;
import static java.time.LocalDate.now;
import persistencia.AlumnoData;
import persistencia.Conexion;
import universidadg8.entidades.Alumno;

/**
 *
 * @author Santi
 */
public class UniversidadG8 {

    public static void main(String[] args) {
        // TODO code application logic here
    
  LocalDate fecha= now();
        System.out.println(fecha);
        Alumno alum = new Alumno(123456,"Ape","nom",fecha,true);
        System.out.println(alum);//Hasta acá bien
        
        AlumnoData ad= new AlumnoData();//Acá tira errorcito
        
    }
}