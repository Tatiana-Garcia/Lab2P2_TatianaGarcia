
package lab2p2_tatianagarcia;

import java.util.Scanner;

public class Lab2P2_TatianaGarcia {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int opcion = 0; 
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
    
}//Fin de la clase
