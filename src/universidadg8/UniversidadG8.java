package universidadg8;

import java.sql.Connection;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import persistencia.AlumnoData;
import persistencia.Conexion;
import persistencia.InscripcionData;
import persistencia.MateriaData;
import universidadg8.entidades.Alumno;
import universidadg8.entidades.Inscripcion;
import universidadg8.entidades.Materia;

/**
 *
 * @author Santi
 */
public class UniversidadG8 {

    public static void main(String[] args) {
        // TODO code application logic here

        MateriaData md = new MateriaData();
        Materia m = new Materia("Laboratorio 3", 3, true);
        md.guardarMateria(m);

        /* 
AlumnoData: 
        
Funcionan:
        
- GuardarAlumno()
- ObtenerAlumnos()
- ObtenerAlumnoPorId()
                
                
No funcionan: 
                
- BorrarAlumno()
- ActualizarAlumno()
         */

 /* MateriaData:

Funcionan: 
- GuardarMateria()
- obtenerMaterias()
- obtenerMateriaPorId()

No Funcionan:


- actualizarMateria()
- borrarMateria()
         */
 /*
 
 Inscripcion:
 
 Funcionan: 
 
 -GuardarInscripcion()
 -obtenerInscripcion()
 
 No Funcionan: 
 
 - borrarInscripcion
 - actualizarNota
 - obtenerMateriasInscriptas
 - obtenerMateriasNoInscriptas
 - obtenerAlumnosInscriptos
         */
//Test
    }

}
