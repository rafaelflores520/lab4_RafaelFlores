/*
Laboratorio 4 - Rafael Flores
 */
package lab4_rafaelflores;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab4_RafaelFlores {
    public static Scanner read = new Scanner(System.in);
    public static ArrayList lista = new ArrayList();
    
    public static void main(String[] args) {
        while (true) {            
            System.out.println("Ingrese la opcion que desee: "
                    + "\n\t1. Agregar"
                    + "\n\t2. Modificar"
                    + "\n\t3. Listar"
                    + "\n\t4. Eliminar"
                    + "\n\t5. Simulacro"
                    + "\n\t0. Salir");
            int op = read.nextInt();
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
    
    public static void Imprimir(){
        System.out.println("+--------------------+");
        System.out.println("||");
        System.out.println("+--------------------+");
        for (int i = 0; i < 10; i++) {
            
            System.out.println("+--------------------+");
        }
    }
    
}
