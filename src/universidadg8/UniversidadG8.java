package universidadg8;

import java.time.LocalDate;
import persistencia.AlumnoData;
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

        JfIndex jf= new JfIndex();
        
        jf.setVisible(true);
        
     /*   MateriaData md = new MateriaData();
        AlumnoData ad = new AlumnoData();
        InscripcionData id = new InscripcionData();
        //Testing

        Alumno a = new Alumno(123456789, "apellido", "nombre", LocalDate.now(), true);
        Materia m = new Materia("MateriaPrueba", 3, true);
        Inscripcion i = new Inscripcion(a, m, 10);
        */

//Testing AlumnoData
/*
ad.guardarAlumno(a);
System.out.println(ad.obtenerAlumnos());
System.out.println(ad.obtenerAlumnoPorId(3));
a = ad.obtenerAlumnoPorId(3);
a.setDni(1111111111);
ad.actualizaAlumno(a);
System.out.println(ad.obtenerAlumnoPorId(3));
         */
//Testing MateriaData

        /*        
md.guardarMateria(m);
System.out.println(md.obtenerMaterias());
System.out.println(md.obtenerMateriaPorId(3));
m = md.obtenerMateriaPorId(3);
m.setAnio(20);
md.actualizaMateria(m);
System.out.println(md.obtenerMateriaPorId(3));
         */
//Testing InscripcionData

        /*        
id.guardarInscripcion(i);
id.obtenerAlumnosInscriptos(m);
id.obtenerMateriasInscriptas(a);
id.obtenerMateriasNoInscriptas(a);
id.actualizarNota(0, 0, 0);
id.borrarInscripcion(0, 0);
         */
    }
}
