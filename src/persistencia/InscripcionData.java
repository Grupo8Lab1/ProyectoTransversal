package persistencia;

import java.util.ArrayList;
import universidadg8.entidades.Alumno;
import universidadg8.entidades.Inscripcion;
import universidadg8.entidades.Materia;

public class InscripcionData {

    private Conexion con;

    public InscripcionData() {
        this.con = (Conexion) Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion inscripcion) {
    }

    public void obtenerInscripcion(int idAlumno, int idMateria) {
    }

    public void borrarInscripcion(int idAlumno, int idMateria) {
    }

    public void actualizarNota(int idAlumno, int idMateria) {
    }

    public ArrayList<Materia> obtenerMateriasInscriptas(Alumno alumno) {
        return null;
    }

    public ArrayList<Materia> obtenerMateriasNoInscriptos(Alumno alumno) {
        return null;
    }

    public ArrayList<Alumno> obtenerAlumnosInscriptos(Materia materia) {
        return null;
    }

}
