package universidadg8;

import java.sql.Connection;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import persistencia.AlumnoData;
import persistencia.Conexion;
import persistencia.InscripcionData;
import persistencia.MateriaData;
import universidadg8.entidades.Alumno;
import universidadg8.entidades.Materia;

/**
 *
 * @author Santi
 */
public class UniversidadG8 {

    public static void main(String[] args) {
        // TODO code application logic here

        AlumnoData ad = new AlumnoData();
        System.out.println(ad.obtenerAlumnos());
        MateriaData md = new MateriaData();
        System.out.println(md.obtenerMaterias());
        InscripcionData ind = new InscripcionData();
        System.out.println(ind.obtenerInscripcion(2, 1));
        
        
//        ad.borrarAlumno(4);
//        ad.borrarAlumno(6);

//        Materia m = new Materia("Estructuras", 2, true);
        //    md.guardarMateria(m);
        //Test
    }

}
