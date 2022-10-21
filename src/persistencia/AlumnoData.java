package persistencia;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadg8.entidades.Alumno;

public class AlumnoData {

    private Conexion con;

    public AlumnoData() {
        this.con = (Conexion) Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {
        //a)	INSERT INTO `alumno` (`dni`,`apellido`,`nombre`,`fechaNacimiento`,`estado`) VALUES ('111','Muñoz','Federico','2001-05-31','1'),(
        String sql = "INSERT INTO alumnos (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFecha_nacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();//insert, update, delete

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                alumno.setId_alumno(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Alumno agregado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-AgregarAlumno");
        }
    }

    public ArrayList<Alumno> obtenerAlumnos() {

        ArrayList<Alumno> listaTemp = new ArrayList();

        String sql = "SELECT * FROM alumnos WHERE estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();//select

            while (rs.next()) {

                Alumno a = new Alumno();

                a.setId_alumno(rs.getInt("idAlumno"));
                a.setDni(rs.getLong("dni"));
                a.setApellido(rs.getString("apellido"));
                a.setNombre(rs.getString("nombre"));
                a.setFecha_nacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                a.setEstado(rs.getBoolean("estado"));

                listaTemp.add(a);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-ObtenerAlumnos");
        }
        return listaTemp;
    }

    public Alumno obtenerAlumnoPorId(int idAlumno) {
        String sql = "SELECT * FROM alumnos WHERE estado = 1 AND idAlumno = ?";
        Alumno alu = new Alumno();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alu.setId_alumno(idAlumno);
                alu.setDni(rs.getLong("dni"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFecha_nacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alu.setEstado(rs.getBoolean("estado"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-obtenerAlumnoPorId");
        }
        return alu;

    }

    public void borrarAlumno(int id) {
        String sql = "UPDATE alumnos SET estado=0 WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();//

            JOptionPane.showMessageDialog(null, "Se elimino el alumno correctamente");

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-borrarAlumno");
        }
    }

    public void actualizaAlumno(Alumno alumno) {
        String sql = "UPDATE alumnos SET dni=?, apellido = ?, nombre = ?, fechaNacimiento = ?, estado=? WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFecha_nacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.setInt(6, alumno.getId_alumno());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos del alumno actualizados");

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-actualizarAlumno");
        }
    }
}
