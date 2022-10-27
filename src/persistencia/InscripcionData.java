package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadg8.entidades.Alumno;
import universidadg8.entidades.Inscripcion;
import universidadg8.entidades.Materia;

public class InscripcionData {

    private Connection con;

    public InscripcionData() {
        this.con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion inscripcion) {

        String sql = "INSERT INTO inscripcion (id_alumno, id_materia, nota) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getId_alumno());
            ps.setInt(2, inscripcion.getMateria().getId_materia());
            ps.setDouble(3, inscripcion.getNota());
            ps.executeUpdate();//insert, update, delete

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                inscripcion.setId_inscripcion(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Inscripcion realizada exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "InscripcionData Sentencia SQL erronea-guardarInscripcion");
        }
    }

    public Inscripcion obtenerInscripcion(int idAlumno, int idMateria) {

        String sql = "SELECT * FROM inscripcion WHERE id_alumno = ? AND id_materia = ?";
        Inscripcion i = new Inscripcion();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ResultSet rs = ps.executeQuery(); //Select

            if (rs.next()) {
                AlumnoData a = new AlumnoData();
                MateriaData m = new MateriaData();
                i.setId_inscripcion(rs.getInt("id_inscripcion"));
                i.setAlumno(a.obtenerAlumnoPorId(idAlumno));
                i.setMateria(m.obtenerMateriaPorId(idMateria));
                i.setNota(rs.getDouble("nota"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "InscripcionData Sentencia SQL erronea-obtenerInscripcion");
        }
        return i;
    }

    public void borrarInscripcion(int idAlumno, int idMateria) {

        String sql = "DELETE FROM inscripcion WHERE inscripcion.id_alumno=? AND inscripcion.id_materia=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int agrego = ps.executeUpdate(sql); //Update
            String aviso;
            if (agrego > 0) {
                aviso = "Se elimino la inscripción correctamente";
            } else {
                aviso = "No se pudo eliminar la inscripción";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "InscripcionData Sentencia SQL erronea-borrarInscripcion");
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota=? WHERE inscripcion.id_alumno=? AND inscripcion.id_materia=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int agrego = ps.executeUpdate(sql); //Update
            String aviso;
            if (agrego > 0) {
                aviso = "Datos de la inscripción actualizados";
            } else {
                aviso = "No se pudo actualizar la inscripción";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "InscripcionData Sentencia SQL erronea-actualizarNota");
        }
    }

    public ArrayList<Materia> obtenerMateriasInscriptas(Alumno alumno) {

        ArrayList<Materia> listaTemp = new ArrayList();

        String sql = "SELECT * FROM materia WHERE id_materia IN (SELECT id_materia FROM inscripcion WHERE id_alumno=?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();//select

            while (rs.next()) {

                Materia m = new Materia();

                m.setId_materia(rs.getInt("id_materia"));
                m.setNombre(rs.getString("nombre"));
                m.setAnio(rs.getInt("anio"));
                m.setEstado(rs.getBoolean("estado"));

                listaTemp.add(m);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "InscripcionData Sentencia SQL erronea-ObtenerMateriasInscriptas");
        }
        return listaTemp;

    }

    public ArrayList<Materia> obtenerMateriasNoInscriptos(Alumno alumno) {
        ArrayList<Materia> listaTemp = new ArrayList();

        String sql = "SELECT * FROM materia WHERE id_materia NOT IN (SELECT id_materia FROM inscripcion WHERE id_alumno=?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();//select

            while (rs.next()) {

                Materia m = new Materia();

                m.setId_materia(rs.getInt("id_materia"));
                m.setNombre(rs.getString("nombre"));
                m.setAnio(rs.getInt("anio"));
                m.setEstado(rs.getBoolean("estado"));

                listaTemp.add(m);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "InscripcionData Sentencia SQL erronea-ObtenerMateriasNoInscriptas");
        }
        return listaTemp;
    }

    public ArrayList<Alumno> obtenerAlumnosInscriptos(Materia materia) {

        ArrayList<Alumno> listaTemp = new ArrayList();

        String sql = "SELECT * FROM alumno WHERE id_alumno IN (SELECT id_alumno FROM inscripcion WHERE id_materia=?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();//select

            while (rs.next()) {

                Alumno a = new Alumno();

                a.setId_alumno(rs.getInt("id_alumno"));
                a.setDni(rs.getLong("dni"));
                a.setApellido(rs.getString("apellido"));
                a.setNombre(rs.getString("nombre"));
                a.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                a.setEstado(rs.getBoolean("estado"));

                listaTemp.add(a);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "InscripcionData Sentencia SQL erronea-ObtenerAlumnosPorMateria");
        }
        return listaTemp;
    }

}
