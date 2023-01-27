
package lab2p2_tatianagarcia;


public class Usuario {
    private String usuario; 
    private int edad; 
    private String nombre; 
    private String password; 
    private int estado; 
    
    public Usuario(){
        
    }
    public Usuario(String usuario, String contraseña){
        this.usuario = usuario;
        password = contraseña; 
    }
    public Usuario(String usuario, String contraseña, String nombre, int edad){
        this.usuario = usuario;
        password = contraseña; 
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int getestado() {
        return estado;
    }
    
    public void setestado(int estado) {
        this.estado = estado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
