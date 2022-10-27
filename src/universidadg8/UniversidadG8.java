package universidadg8;

import java.sql.Connection;
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

        Connection con = Conexion.getConexion();
        System.out.println(con);
        LocalDate fecha = now();
        System.out.println(fecha);
        Alumno alum = new Alumno(123456, "Ape", "nom", fecha, true);
        System.out.println(alum);//Hasta acá bien
<<<<<<< HEAD
        
        AlumnoData ad= new AlumnoData();//Acá tira errorcito
        
    }
}
=======
        AlumnoData ad = new AlumnoData();//Acá tira errorcito
        System.out.println(ad);
        ad.guardarAlumno(alum);

        //Test
    }

}
>>>>>>> afb5f65cddbf95341da121a0fe83c7c5bbbae2e8
