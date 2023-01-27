/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_tatianagarcia;

import java.awt.Color;


public class Casa {
    private int num_casa; 
    private int num_bloque; 
    private Color color; 
    private int largo, ancho;
    private int num_baños; 
    private int num_cuartos; 

    public Casa (){
    }
    public Casa(int numero_casa, int numero_bloque, Color color, int largo, int ancho, int numero_baños, int numero_cuartos){
        num_casa = numero_casa; 
        num_bloque = numero_bloque; 
        this.color = color;
        this.largo = largo; 
        this.ancho = ancho; 
        num_baños = numero_baños; 
        num_cuartos = numero_cuartos; 
    }
    
    public int getNum_casa() {
        return num_casa;
    }

    
    public void setNum_casa(int num_casa) {
        this.num_casa = num_casa;
    }

    
    public int getNum_bloque() {
        return num_bloque;
    }

    
    public void setNum_bloque(int num_bloque) {
        this.num_bloque = num_bloque;
    }

    
    public Color getColor() {
        return color;
    }

    
    public void setColor(Color color) {
        this.color = color;
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

    
    public int getNum_baños() {
        return num_baños;
    }

    
    public void setNum_baños(int num_baños) {
        this.num_baños = num_baños;
    }

    
    public int getNum_cuartos() {
        return num_cuartos;
    }

    
    public void setNum_cuartos(int num_cuartos) {
        this.num_cuartos = num_cuartos;
    }
    
    public String toString(){
        return "Casa: \nNumero de Casa: "+num_casa
                +"\nNumero de Bloque: "+num_bloque
                +"\nColor: "+color
                +"\nLargo "+largo
                +"y ancho: "+ancho
                +"\n Numero de Baños: "+num_baños
                +"\n Numero de Cuartos: "+ num_cuartos;
    }
}
