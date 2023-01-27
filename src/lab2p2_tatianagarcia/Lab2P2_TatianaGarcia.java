
package lab2p2_tatianagarcia;

import java.awt.Color;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JColorChooser;

public class Lab2P2_TatianaGarcia {
    static Scanner leer = new Scanner (System.in);

    public static void main(String[] args) {
        
        int opcion = 0; 
        ArrayList lista = new ArrayList();
        
        while (opcion != 4) {   
            System.out.println("--MENU--\n"
                    + "1. Registro de Inmueble/Solar\n"
                    + "2. Manejo de Estados\n"
                    + "3. Log In/Sign Up\n"
                    + "4. Salir");
            opcion = leer.nextInt();
            
            if (opcion ==1) {
                int opcion2=0;
                while(opcion2 !=6){
                    System.out.println("--MENU--\n"
                            + "1. Crear Casas/Edificios/Solares\n"
                            + "2. Listar Casas/Edificios/Solares\n"
                            + "3. Modificar Casas/Edificios/Solares\n"
                            + "4. Borrar Casas/Edificios/Solares\n"
                            + "5. Comprar Casas/Edificios/Solares\n"
                            + "6. Regresar al Menu Principal");
                    opcion2 = leer.nextInt();
                    if (opcion2 ==1) {
                        int op = 0; 
                        System.out.println("Que desea crear\n"
                                + "1. Casa \n"
                                + "2. Edificos \n"
                                + "3. Solares");
                        op = leer.nextInt();
                        switch (op) {
                            case 1:
                                lista.add(CrearCasa());
                                break;
                            case 2: 
                                lista.add(CrearEdificio());
                                break; 
                            case 3:
                                lista.add(CrearSolar());
                                break; 
                            default:
                                throw new AssertionError();
                        }   
                    }
                    if (opcion2 ==2) {
                        String s=""; 
                        for (Object t : lista) {
                           s += "\nPosicion: "+lista.indexOf(t)+"\n"+t+"\n"; 
                        }
                        System.out.println(s.toString());
                        System.out.println("kjhgfcx");
                        
                    }
                    if (opcion2 ==3){
                        int pos ;
                        int op =5; 
                        while(op >3){
                            System.out.println("Que desea modificar: \n"
                                    + "1. Casas\n"
                                    + "2. Edificios\n"
                                    + "3. Solares");
                            op = leer.nextInt();
                            if (op ==1) {
                                System.out.println("Ingresa la posicion de la Casa que desea modificar: ");
                                pos = leer.nextInt();
                                if(pos>=0 && pos<lista.size()){// & solo cuando es falso no evalua el resto, con && cuando es falso evalua el resto de condiciones
                                    if(lista.get(pos) instanceof Casa ){
                                        System.out.println(lista.get(pos)+"\n");
                                        lista.remove(pos);
                                        lista.add(CrearCasa());
                                    }else{
                                        System.out.println( "La posicion entregada no es valida");
                                    }
                                } 
                            }
                            if (op ==2) {
                                System.out.println("Ingresa la posicion del Edificio que desea modificar: ");
                                pos = leer.nextInt();
                                if(pos>=0 && pos<lista.size()){// & solo cuando es falso no evalua el resto, con && cuando es falso evalua el resto de condiciones
                                    if(lista.get(pos) instanceof Edificio ){
                                        System.out.println(lista.get(pos)+"\n");
                                        lista.remove(pos);
                                        lista.add(CrearEdificio());
                                    }else{
                                        System.out.println( "La posicion entregada no es valida");
                                    }
                                } 
                            }
                            if (op ==3) {
                                System.out.println("Ingresa la posicion del Solar que desea modificar: ");
                                pos = leer.nextInt();
                                if(pos>=0 && pos<lista.size()){// & solo cuando es falso no evalua el resto, con && cuando es falso evalua el resto de condiciones
                                    if(lista.get(pos) instanceof Solares ){
                                        System.out.println(lista.get(pos)+"\n");
                                        lista.remove(pos);
                                        lista.add(CrearSolar());
                                    }else{
                                        System.out.println( "La posicion entregada no es valida");
                                    }
                                }
                            }
                        }
                        
                    }
                    if (opcion2 == 4) {
                        int pos ;
                        int op =5; 
                        while(op >3){
                            System.out.println("Que desea borrar: \n"
                                    + "1. Casas\n"
                                    + "2. Edificios\n"
                                    + "3. Solares");
                            op = leer.nextInt();
                            if (op ==1) {
                                System.out.println("Ingresa la posicion de la Casa que desea borrar: ");
                                pos = leer.nextInt();
                                if(pos>=0 && pos<lista.size()){
                                    if(lista.get(pos) instanceof Casa ){
                                        lista.remove(pos);
                                        System.out.println("Casa eliminada correctamente");
                                    }else{
                                        System.out.println( "La posicion entregada no es valida");
                                    }
                                } 
                            }
                            if (op ==2) {
                                System.out.println("Ingresa la posicion del Edificio que desea borrar: ");
                                pos = leer.nextInt();
                                if(pos>=0 && pos<lista.size()){
                                    if(lista.get(pos) instanceof Edificio ){
                                        lista.remove(pos);
                                        System.out.println("Edificio eliminada correctamente");
                                    }else{
                                        System.out.println( "La posicion entregada no es valida");
                                    }
                                } 
                            }
                            if (op ==3) {
                                System.out.println("Ingresa la posicion del Solar que desea borrar: ");
                                pos = leer.nextInt();
                                if(pos>=0 && pos<lista.size()){
                                    if(lista.get(pos) instanceof Solares ){
                                        lista.remove(pos);
                                        System.out.println("Casa eliminada correctamente");
                                    }else{
                                        System.out.println( "La posicion entregada no es valida");
                                    }
                                }
                            }
                        }
                    }//Fin del opcion 4
                    if (opcion2==5) {
                        int pos ;
                        int op =5; 
                        while(op >3){
                            System.out.println("Que desea comprar: \n"
                                    + "1. Casas\n"
                                    + "2. Edificios\n"
                                    + "3. Solares");
                            op = leer.nextInt();
                            if (op ==1) {
                                System.out.println("Ingresa la posicion de la Casa que desea comprar: ");
                                pos = leer.nextInt();
                                if(pos>=0 && pos<lista.size()){
                                    if(lista.get(pos) instanceof Casa ){
                                        ///
                                    }else{
                                        System.out.println( "La posicion entregada no es valida");
                                    }
                                } 
                            }
                            if (op ==2) {
                                System.out.println("Ingresa la posicion del Edificio que desea comprar: ");
                                pos = leer.nextInt();
                                if(pos>=0 && pos<lista.size()){
                                    if(lista.get(pos) instanceof Edificio ){
                                        //
                                    }else{
                                        System.out.println( "La posicion entregada no es valida");
                                    }
                                } 
                            }
                            if (op ==3) {
                                System.out.println("Ingresa la posicion del Solar que desea comprar: ");
                                pos = leer.nextInt();
                                if(pos>=0 && pos<lista.size()){
                                    if(lista.get(pos) instanceof Solares ){
                                        //
                                    }else{
                                        System.out.println( "La posicion entregada no es valida");
                                    }
                                }
                            }
                        }//while
                    }//fin de opcion5
                    
                }//Fin del while menu registro
                
                    
            }//Fin de la opcion 1 menu principal
            if (opcion ==2) {
                
            }
            if (opcion == 3) {
                ArrayList<Usuario> users = new ArrayList();
                int op =3; 
                while(op>2){
                    System.out.println("Deseas: \n"
                            + "1. Sign Up \n"
                            + "2. Log In");
                    op = leer.nextInt();
                    if (op==1) {
                        users.add(User());      
                    }
                    if (op ==2) {
                        System.out.println("Ingrese su usuario: ");
                        String user; 
                        user = leer.next();
                        System.out.println("Ingrese su contraseña: ");
                        String contra; 
                        contra = leer.next(); 
                    }
                }
                
                
                
            }
            if (opcion == 4) {
                System.out.println("Saliendo del sistema");
            }
        }//fin del menu principal 
    }//Fin del main
    
    static Usuario User(){
        Usuario retorno;
        System.out.println("Ingrese su nombre: ");
        String nombre; 
        leer = new Scanner(System.in);
        nombre = leer.nextLine(); 
        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt(); 
        System.out.println("Ingrese el usuario a crear: ");
        String user; 
        user = leer.next();
        System.out.println("Ingrese una contraseña: ");
        String contra; 
        contra = leer.next();
        retorno = new Usuario(user, contra, nombre, edad);
        return retorno; 
    }
    static Casa CrearCasa(){
         
        Color c; 
        Casa retorno; 
        int casa; 
        int bloque;  
        int l, a;
        int banos; 
        int cuartos; 
        
        System.out.println("Ingrese numero de casa: ");
        casa = leer.nextInt();
        
        System.out.println("Ingrese numero de bloque: ");
        bloque = leer.nextInt();
        
        c = JColorChooser.showDialog(null, "Seleccione color", Color.black);
        
        System.out.println("Ingrese largo de la casa: ");
        l = leer.nextInt();
        System.out.println("Ingrese ancho de la casa: ");
        a = leer.nextInt();
        System.out.println("Ingrese numero de baños: ");
        banos = leer.nextInt();
        System.out.println("Ingrse numero de cuartos: ");
        cuartos = leer.nextInt();
        
        retorno = new Casa(casa, bloque, c, l, a, banos, cuartos);
        return retorno;
    }
    static Edificio CrearEdificio(){
         
        Edificio retorno; 
        int num_pisos; 
        int cant_locales; 
        String direccion; 
        
        System.out.println("Ingrese el numero de pisos: ");
        num_pisos = leer.nextInt();
        System.out.println("Ingrese la cantidad de locales: ");
        cant_locales = leer.nextInt();
        System.out.println("Ingrese la direccion de referencia: ");
        leer = new Scanner(System.in);
        direccion = leer.nextLine();
        //leer.nextLine();
        
        retorno = new Edificio(num_pisos, cant_locales, direccion);
        return retorno;
    }
    static Solares CrearSolar(){
        Solares retorno; 
        int largo; 
        int ancho; 
        int area; 
        String dueño; 
        
        System.out.println("Ingrese el largo del Solar: ");
        largo = leer.nextInt();
        System.out.println("Ingrse el ancho del Solar: ");
        ancho = leer.nextInt();
        area = largo*ancho; 
        dueño = "none";
        retorno = new Solares(largo, ancho, area, dueño);
        return retorno; 
    }
    
    
}//Fin de la clase
