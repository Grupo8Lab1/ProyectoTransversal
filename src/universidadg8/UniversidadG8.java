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
        AlumnoData ad = new AlumnoData();

        InscripcionData id = new InscripcionData();
        
        Inscripcion i = new Inscripcion(ad.obtenerAlumnoPorId(1),md.obtenerMateriaPorId(4),8);
        id.guardarInscripcion(i);
        /* 
AlumnoData: 
        
Funcionan:
        
- GuardarAlumno()
- ObtenerAlumnos()
- ObtenerAlumnoPorId()
- BorrarAlumno()
- ActualizarAlumno()
                                
No funcionan: 
                
         

 MateriaData:

Funcionan: 
        
- GuardarMateria()
- obtenerMaterias()
- obtenerMateriaPorId()
- actualizarMateria()
- borrarMateria()
        
No Funcionan:
         
 /*
 
 Inscripcion:
 
 Funcionan: 
 
 -GuardarInscripcion()
 -obtenerInscripcion()
 -borrarInscripcion
 -actualizarNota
        
 No Funcionan: 
 
 - obtenerMateriasInscriptas
 - obtenerMateriasNoInscriptas
 - obtenerAlumnosInscriptos
         */
//Test
    }

}
