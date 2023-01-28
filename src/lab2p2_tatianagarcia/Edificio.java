/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_tatianagarcia;

public class Edificio {
    private int num_pisos; 
    private int cant_locales; 
    private String direccion; 
    private String dueño; 
    private String[]estados = {"En construccion", "Lista", "Construccion en Espera", "En espera de Demolicion"};
    private String estado;
    
    public Edificio(){
        
    }
    public Edificio(int numero_pisos, int cantidad_locales, String direccion){
        num_pisos = numero_pisos; 
        cant_locales = cantidad_locales; 
        this.direccion= direccion;
        estado = estados[0];
    }
    
    
    public int getNum_pisos() {
        return num_pisos;
    }

    public void setNum_pisos(int num_pisos) {
        this.num_pisos = num_pisos;
    }

    public int getCant_locales() {
        return cant_locales;
    }

    public void setCant_locales(int cant_locales) {
        this.cant_locales = cant_locales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Edificio:\nNumero de Pisos: " + num_pisos 
                + "\nCantidad de locales: " + cant_locales 
                + "\nDireccion por referencia: " + direccion
                + "\n Estado: "+estado;
    }

    
    
    
    
    
}
