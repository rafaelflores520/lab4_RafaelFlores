/*
Laboratorio 4 - Rafael Flores
 */
package lab4_rafaelflores;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab4_RafaelFlores {
    public static Scanner read = new Scanner(System.in);
    public static ArrayList<Delito> listaDel = new ArrayList();
    public static ArrayList<Delito> listaCri = new ArrayList();
    
    public static void main(String[] args) {
        listaDel.add(new Vandalismo("Quinchon", "Ramon", 7, "Fausto", 10001, 101, "Graffiti Pared", "Ramon", "Chile", "6 meses", 001, true, "10-12-18"));
        listaDel.add(new Hurto("Carro", 10000, "Carlo", 10002, 102, "Robo de Coche", "Maria", "Canada", "1 Anio", 002, true, "10-12-19"));
        listaDel.add(new Prostitucion("Juan Carlos", "Carlo", 10002, 102, "Robo de Coche", "Maria", "Canada", "1 Anio", 003, true, "10-12-16"));
        listaDel.add(new Terrorismo("Bomba Relojeria", 100, 5, "Carro Bomba", "Muchas Victimas", "Israel", "Cadena Perpetua", 004, true, "10-12-15"));
        listaDel.add(new numeroCuerpo("Minigun", 23, 4, "Ataque Movil", "Muchas Victimas", "Pakistan", "Inocente", 005, false, "10-12-17"));
        listaDel.add(new Violacion(15, 5, "InhabilitadaconDrogas", "Maria Luisa", "USA", "10 anios", 006, true, "10-12-14"));
        listaDel.add(new Secuestro("30 dias", true, 3, "Abstraccion Nocturna", "Marlon Flores", "Venezuela", "35 anios", 007, true, "10-12-09"));
        listaDel.add(new TraficoDrogas("Cocaina", 10, 2, "Traslado Avioneta", "n/a", "Mexico", "Inocente", 800, false, "10-12-15"));
        while (true) {
            int op;
            do {
                try {
                    System.out.println("Ingrese la opcion que desee: "
                    + "\n\t1. Agregar Delito"
                    + "\n\t2. Agregar Criminal"
                    + "\n\t3. Modificar Delito"
                    + "\n\t4. Modificar Criminal"
                    + "\n\t5. Listar Delito"
                    + "\n\t6. Listar Criminal"
                    + "\n\t7. Eliminar Delito"
                    + "\n\t8. Eliminar Criminal"
                    + "\n\t9. TAS"
                    + "\n\t0. Salir");
                    op = read.nextInt();
                    if (op <= 9 || op >= 0) {
                        break;
                    } else {
                        System.out.println("Debe ingresar un valor dentro del rango");
                    }
                } catch (InputMismatchException ExVariable) {
                    System.out.println("Debe ingresar solo valores numericos!!");
                    read.next();
                }
            } while (true);
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
                    ListarDelitos();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
    
    public static int ListarDelitoMenu(){
        int op;
        System.out.println("Que Delitos desea Listar"
                + "\n\t1. Delitos Mayores"
                + "\n\t2. Delitos Menores"
                + "\n\t0. Salir");
        do {
            try {
                op = read.nextInt();
                if (op <= 2 || op >= 0) {
                    break;
                } else {
                    System.out.println("Debe seleccionar una opcion valida");
                }
            } catch (InputMismatchException ExVariable) {
                System.out.println("Solo puede meter numeros!");
                read.next();
            }
        } while (true);
        return op;
    }
    
    public static int ListarSubDelitos(int opOne){
        int op;
        if (opOne == 1) {
            System.out.println("Que Delitos desea Listar"
                    + "\n\t1. Terrorismo"
                    + "\n\t2. Asesinato"
                    + "\n\t3. Violacion"
                    + "\n\t4. Secuestro"
                    + "\n\t5. Trafico de Drogas"
                    + "\n\t0. Salir");
            do {
                try {
                    op = read.nextInt();
                    if (op >= 5 || op <= 0) {
                        break;
                    } else {
                        System.out.println("Debe seleccionar una opcion valida");
                    }
                } catch (InputMismatchException ExVariable) {
                    System.out.println("Solo puede meter numeros!");
                    read.next();
                }
            } while (true);
        }else{
            System.out.println("Que Delitos desea Listar"
                    + "\n\t1. Vandalismo"
                    + "\n\t2. Hurto"
                    + "\n\t3. Prostitucion"
                    + "\n\t0. Salir");
            do {
                try {
                    op = read.nextInt();
                    if (op <= 3 || op >= 0) {
                        break;
                    } else {
                        System.out.println("Debe seleccionar una opcion valida");
                    }
                } catch (InputMismatchException ExVariable) {
                    System.out.println("Solo puede meter numeros!");
                    read.next();
                }
            } while (true);
        }
        return op;
    }
    
    public static int ListarCriminalMenu(){
        int op;
        System.out.println("Que Criminales desea Listar"
                + "\n\t1. Agentes"
                + "\n\t2. Criminales Comunes"
                + "\n\t0. Salir");
        do {
            try {
                op = read.nextInt();
                if (op <= 2 || op >= 0) {
                    break;
                } else {
                    System.out.println("Debe seleccionar una opcion valida");
                }
            } catch (InputMismatchException ExVariable) {
                System.out.println("Solo puede meter numeros!");
                read.next();
            }
        } while (true);
        return op;
    }
    
    public static void ListarDelitos(){
        int op = ListarDelitoMenu();
        int op2 = ListarSubDelitos(op);
        switch (op) {
            case 1:
                for (int i = 0; i < listaDel.size(); i++) {
                    switch (op2) {
                        case 1:
                            if (listaDel.get(i).getClass().getSimpleName().equals("Terrorismo")) {
                                if (i == 0) {
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Nombre Artefacto    |Numero de Victimas  |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  |" + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 2:
                            if (listaDel.get(i).getClass().getSimpleName().equals("Asesinato")) {
                                if (i == 0) {
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Nombre Arma         |Numero de Cuerpos   |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  |" + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 3:
                            if (listaDel.get(i).getClass().getSimpleName().equals("Violacion")) {
                                if (i == 0) {
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Edad Victima        |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  |" + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 4:
                            if (listaDel.get(i).getClass().getSimpleName().equals("Secuestro")) {
                                if (i == 0) {
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Tiempo Retenido     |Fue Devuelto        |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  |" + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 5:
                            if (listaDel.get(i).getClass().getSimpleName().equals("TraficoDrogas")) {
                                if (i == 0) {
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Nombre Droga        |Cantidad            |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  |" + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 0:
                            break;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < listaDel.size(); i++) {
                    switch (op2) {
                        case 1:
                            if (listaDel.get(i).getClass().getSimpleName().equals("Vandalismo")) {
                                if (i == 0) {
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Edificacion         |Numero de Pisos     |Nombre Duenio       |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  |" + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 2:
                            if (i == 0) {
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Objeto Hurtado      |Valor               |");
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                            } else {
                                System.out.println("|  " + i + "  |" + listaDel.get(i).toString());
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                            }
                            break;
                        case 3:
                            if (listaDel.get(i).getClass().getSimpleName().equals("Prostitucion")) {
                                if (i == 0) {
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Nombre Solicitante  |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  |" + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 0:
                            break;
                    }
                }
                break;
            case 0:
                break;
        }
    }
    
    public static void ListarCriminales(){
        int op = ListarCriminalMenu();
        switch (op) {
            case 1:
                for (int i = 0; i < listaCri.size(); i++) {
                    switch (listaCri.get(i).getClass().getSimpleName()) {
                        case "Terrorista":
                            if (i == 0) {
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                System.out.println("|No.  |Nombre              |Genero              |Pais Residencia     |Descripcion         |Edad                |Esta Encarcelado    |Pais Aatque         |Ciudad Ataque       |Metodo Ataque       |");
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                            }else{
                                System.out.println("|  "+i+"  |"+listaCri.get(i).toString());
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                            }
                            break;
                        case "Asesino":
                            if (i == 0) {
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                System.out.println("|No.  |Nombre              |Genero              |Pais Residencia     |Descripcion         |Edad                |Esta Encarcelado    |Nombre Victima      |Arma Asesianto      |");
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                            }else{
                                System.out.println("|  "+i+"  |"+listaCri.get(i).toString());
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                            }
                            break;
                        case "Secuestrador":
                            if (i == 0) {
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                System.out.println("|No.  |Nombre              |Genero              |Pais Residencia     |Descripcion         |Edad                |Esta Encarcelado    |Nombre Victima      |Cantidad por Rescate|");
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                            }else{
                                System.out.println("|  "+i+"  |"+listaCri.get(i).toString());
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                            }
                            break;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < listaCri.size(); i++) {
                    switch (listaCri.get(i).getClass().getSimpleName()) {
                        case "Criminal":
                            if (i == 0) {
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                System.out.println("|No.  |Nombre              |Genero              |Pais Residencia     |Descripcion         |Edad                |Esta Encarcelado    |");
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                            }else{
                                System.out.println("|  "+i+"  |"+listaCri.get(i).toString());
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                            }
                            break;
                    }
                }
                break;
        }
    }
    
}
