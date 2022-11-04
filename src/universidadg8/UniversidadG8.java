package universidadg8;

import java.util.ArrayList;
import persistencia.AlumnoData;
import persistencia.InscripcionData;
import persistencia.MateriaData;
import universidadg8.vistas.JfIndex;
import universidadg8.entidades.Alumno;
import universidadg8.entidades.Inscripcion;
import universidadg8.entidades.Materia;

/**
 *
 * @author Santi
 */
public class UniversidadG8 {

    public static AlumnoData adata = new AlumnoData();
    public static MateriaData mdata = new MateriaData();
    public static InscripcionData idata = new InscripcionData();
    public static ArrayList<Alumno> listaAlumnos;
    public static ArrayList<Materia> listaMaterias;

    public static void main(String[] args) {
        // TODO code application logic here    

        JfIndex jf = new JfIndex();

        jf.setVisible(true);
//        //Testing
//
//        Alumno a = new Alumno(123456789, "apellido", "nombre", LocalDate.now(), true);
//        Materia m = new Materia("MateriaPrueba", 3, true);
//        Inscripcion i = new Inscripcion(a, m, 10);
//Testing AlumnoData
/*
adata.guardarAlumno(a);
System.out.println(adata.obtenerAlumnos());
System.out.println(adata.obtenerAlumnoPorId(3));
a = adata.obtenerAlumnoPorId(3);
a.setDni(1111111111);
adata.actualizaAlumno(a);
System.out.println(ad.obtenerAlumnoPorId(3));
         */
//Testing MateriaData

        /*        
mdata.guardarMateria(m);
System.out.println(md.obtenerMaterias());
System.out.println(md.obtenerMateriaPorId(3));
m = mdata.obtenerMateriaPorId(3);
m.setAnio(20);
mdata.actualizaMateria(m);
System.out.println(mdata.obtenerMateriaPorId(3));
         */
//Testing InscripcionData

        /*        
idata.guardarInscripcion(i);
idata.obtenerAlumnosInscriptos(m);
idata.obtenerMateriasInscriptas(a);
idata.obtenerMateriasNoInscriptas(a);
idata.actualizarNota(0, 0, 0);
idata.borrarInscripcion(0, 0);
         */
    }
}
