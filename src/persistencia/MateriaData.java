package persistencia;

import java.util.ArrayList;
import universidadg8.entidades.Materia;

public class MateriaData {

    private Conexion con;

    public MateriaData() {
        this.con = (Conexion) Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
    }

    public ArrayList<Materia> obtenerMaterias(){
        
        return null;
    }
    
    public Materia obtenerMateriaPorId(int id){

        return null;
    }
    
    public void borrarMateria(int id){
    
    }
    
    public void actualizaMateria(Materia materia){
    
    }

}
