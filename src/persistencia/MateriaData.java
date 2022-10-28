package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadg8.entidades.Materia;

public class MateriaData {

    private Connection con;

    public MateriaData() {
        this.con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, anio, estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();//insert, update, delete

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                materia.setId_materia(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Materia agregada exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-guardarMateria");
        }
    }

    public ArrayList<Materia> obtenerMaterias() {

        ArrayList<Materia> listaTemp = new ArrayList();

        String sql = "SELECT * FROM materia WHERE materia.estado = 1;";

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
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-ObtenerMaterias");
        }
        return listaTemp;

    }

    public Materia obtenerMateriaPorId(int idMateria) {

        String sql = "SELECT * FROM materia WHERE materia.estado = 1 AND materia.id_materia = ?";
        Materia m = new Materia();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery(); //Select

            if (rs.next()) {
                m.setId_materia(idMateria);
                m.setNombre(rs.getString("nombre"));
                m.setAnio(rs.getInt("anio"));
                m.setEstado(rs.getBoolean("estado"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-obtenerMateriaPorID");
        }
        return m;
    }

    public void borrarMateria(int id) {
        String sql = "UPDATE materia SET estado=0 WHERE materia.id_materia=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int agrego = ps.executeUpdate(sql); //Update
            String aviso;
            if (agrego > 0) {
                aviso = "Se elimino la materia correctamente";
            } else {
                aviso = "No se pudo borrar la materia";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-borrarMateria");
        }
    }

    public void actualizaMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre=?, anio = ?, estado=? WHERE materia.id_materia=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getId_materia());

            int agrego = ps.executeUpdate(sql); //Update
            String aviso;
            if (agrego > 0) {
                aviso = "Datos de la materia actualizados";
            } else {
                aviso = "No se pudo actualizar los datos de la materia";
            }

            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-actualizarMateria");
        }
    }

}
