
package lab2p2_tatianagarcia;


public class Solares {
    private int largo; 
    private int ancho; 
    private int area; 
    private String dueño; 
    
    public Solares(){
        
    }
    public Solares(int largo, int ancho, int area, String dueño){
        this.largo = largo; 
        this.ancho = ancho; 
        this.area = area; 
        this.dueño= dueño; 
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    public String toString(){
        return "Solar: \nLargo : "+largo
                +"\nAncho: "+ancho
                +"\nArea: "+area
                +"\nDueño "+dueño;
    }
    
   
}
