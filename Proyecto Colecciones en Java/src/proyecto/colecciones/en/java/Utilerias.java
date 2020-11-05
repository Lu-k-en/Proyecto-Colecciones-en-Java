package proyecto.colecciones.en.java;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase Utilerias, no modela ningún tipo de dato abstracto en específico.
 * Es solo un compendio de utilerias varias usadas a lo largo del proyecto.
 */

public class Utilerias{

    /**
     * Método que genera un menú con opciones y valida que la opción selecionada por el usuario
     * se encuentre en un rango válido.
     * 
     * @param opciones arreglo de Strings con las diferentes opciones a mostrar
     * @return la opción seleccionada por el usuario
     */
    public static int menu (String[] opciones) throws IOException {
            
            Scanner entrada = new Scanner(System.in);
            int opcion = 0;
            
            while(opcion == 0){
                System.out.println("Elige una opción: ");
                for (int i = 0; i < opciones.length; i++) {
                    System.out.println("\t" + (i+1) + ") "+ opciones[i]);
                }
                
                System.out.print("\nOpción seleccionada: ");
                opcion = entrada.nextInt();
                entrada.nextLine();
                
                if(opcion < 1 || opcion > opciones.length){
                    opcion = 0;
                    System.out.println("Has elegido el camino de la muerte >:v");
                    System.out.println("\nPresione una letra para continuar...");
                    System.in.read(); 
                }               
            }
            
            return opcion;         
        }
}