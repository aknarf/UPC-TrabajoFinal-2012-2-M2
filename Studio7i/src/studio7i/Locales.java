
package studio7i;

  
    
public class Locales {
    
    String nombre;
    String direccion;
    String salas;
    String codigo;
    int tiempodealquiler;
    // atributos de locales

    public Locales(String nombre, String direccion, String salas, String codigo) {
        this.nombre = nombre;
        this.direccion = direccion;
         this.codigo = codigo;
    }

    Locales(String codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

     //Nobre, codigo y dirección obligatorios

    public String getCodigo() {
        return codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    
    
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
//comienzan los metodos ---------------------------------------------------

    public int alquiler(){
        return tiempodealquiler;
    }
    
    }


