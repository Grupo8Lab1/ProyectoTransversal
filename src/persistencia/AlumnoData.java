package persistencia;

import java.sql.*;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadg8.entidades.Alumno;

public class AlumnoData {

    private Connection con;

    public AlumnoData() {
        this.con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fecha_nacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
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
            JOptionPane.showMessageDialog(null, "AlumnoData Sentencia SQL erronea-guardarAlumno");
        }
    }

    public ArrayList<Alumno> obtenerAlumnos() {

        ArrayList<Alumno> listaTemp = new ArrayList();

        String sql = "SELECT * FROM alumno WHERE alumno.estado = 1";

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
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-ObtenerAlumnos");
        }
        return listaTemp;
    }

    public Alumno obtenerAlumnoPorId(int idAlumno) {
        String sql = "SELECT * FROM alumno WHERE alumno.estado = 1 AND alumno.id_alumno = ?";
        Alumno alu = new Alumno();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery(); //Select

            if (rs.next()) {
                alu.setId_alumno(idAlumno);
                alu.setDni(rs.getLong("dni"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                alu.setEstado(rs.getBoolean("estado"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "AlumnoData Sentencia SQL erronea-obtenerAlumnoPorId");
        }
        return alu;

    }

    public void borrarAlumno(int id) {
        String sql = "UPDATE alumno SET alumno.estado=0 WHERE alumno.id_alumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int agrego = ps.executeUpdate(sql); //Update
            String aviso;
            if (agrego > 0) {
                aviso = "Se elimino el alumno correctamente";
            } else {
                aviso = "No se pudo eliminar el alumno";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-borrarAlumno");
        }
    }

    public void actualizaAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni=?, apellido = ?, nombre = ?, fechaNacimiento = ?, estado=? WHERE alumno.id_alumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFecha_nacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.setInt(6, alumno.getId_alumno());
            int agrego = ps.executeUpdate(sql); //Update
            String aviso;
            if (agrego > 0) {
                aviso = "Datos del alumno actualizados correctamente";
            } else {
                aviso = "No se pudo actualizar el alumno";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-actualizarAlumno");
        }
    }
}
