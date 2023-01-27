
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
                }
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
                            
                            break; 
                        default:
                            throw new AssertionError();
                    }
                    
                    
                }
                    
            }
            if (opcion ==2) {
                
            }
            if (opcion == 3) {
                
            }
            if (opcion == 4) {
                System.out.println("Saliendo del sistema");
            }
        }//fin del menu principal 
    }//Fin del main
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
        direccion = leer.nextLine();
        
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
