
package studio7i;

import java.util.ArrayList;


public class Administrador {
    
    private ArrayList<Locales> tipos;
    String nameadministrador;
    Locales locales;
    Salas salas;
    
  //atributos
    
    //comienzan los metodos ---------------------------------------------------
   
    public Salas reservaDeSalas(){
        return salas;
    }
    
        
    public Administrador() {
        tipos = new ArrayList<Locales>();
}
    public void registrarLocal(String nombre, String descripcion, String codigo) 
        throws BusinessException { 
        validarDatosIncompletos(codigo,nombre,descripcion);
        validarDuplicidad(codigo);
        
        getTipos().add(new Locales(codigo,nombre,descripcion));
    }
       
    
    
    
    
    private void validarDatosIncompletos(String codigo, String nombre, String direccion)
            throws BusinessException {
        String msg = "";
        if (codigo == null || codigo.isEmpty())
            msg = "Código no puede ser vacio o nulo";
        if (nombre == null || nombre.isEmpty())
            msg += "\nNombre no pueder ser vacio o nulo";
        if (direccion == null || direccion.isEmpty())
            msg += "\nDireccion no pueder ser vacio o nulo";
        if (! msg.isEmpty())
            throw new BusinessException(msg);
        }
        
        private void validarDuplicidad(String codigo)
            throws BusinessException {
        if (buscar(codigo) != null){
            String msg = "Código "+codigo+ " ya existe.";
            throw  new BusinessException(msg);
        }
    }
        
     
    public Locales buscar(String codigo) {
        // Buscar el tipo de habitacion por codigo
    for(Locales tipo : getTipos())
    if (tipo.getCodigo().equals(codigo))
               return tipo;
        return null;
    }
        
    private void validarExistenciaTipoHabitacion(String codigo)
            throws BusinessException {
        if (buscar(codigo) == null){
            String msg = "Local "+ codigo+ " no existe.";
            throw new BusinessException(msg);
        }
    }        
        
   
     
    public void eliminar(String codigo) throws BusinessException {
        validarExistenciaTipoHabitacion(codigo);
        getTipos().remove(buscar(codigo));
    }
    
    
    public ArrayList<Locales> getTipos(){
        return tipos;
    }


    }


    





