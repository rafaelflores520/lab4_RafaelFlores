/*
Laboratorio 4 - Rafael Flores
 */
package lab4_rafaelflores;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Lab4_RafaelFlores {
    public static Scanner read = new Scanner(System.in);
    public static ArrayList<Delito> listaDel = new ArrayList();
    public static ArrayList<Criminal> listaCri = new ArrayList();
    
    public static void main(String[] args) {
        listaDel.add(new Vandalismo("Quinchon", "Ramon", 7, "Fausto", 10001, 101, "Graffiti Pared", "Ramon", "Chile", "6 meses", 001, true, "10-12-2018"));
        listaDel.add(new Hurto("Carro", 10000, "Carlo", 10002, 102, "Robo de Coche", "Maria", "Canada", "1 Anio", 002, true, "10-12-2019"));
        listaDel.add(new Prostitucion("Juan Carlos", "Carlo", 10002, 102, "Sexo Ilegal", "Maria", "Canada", "1 Anio", 003, true, "10-12-2016"));
        listaDel.add(new Terrorismo("Bomba Relojeria", 100, 5, "Carro Bomba", "Muchas Victimas", "Israel", "Cadena Perpetua", 004, true, "10-12-2015"));
        listaDel.add(new Asesinato("Minigun", 23, 4, "Ataque Movil", "Muchas Victimas", "Pakistan", "Inocente", 005, false, "10-12-2017"));
        listaDel.add(new Violacion(15, 5, "InhabilitadaconDrogas", "Maria Luisa", "USA", "10 anios", 006, true, "10-12-14"));
        listaDel.add(new Secuestro("30 dias", true, 3, "Abstraccion Nocturna", "Marlon Flores", "Venezuela", "35 anios", 007, true, "10-12-2009"));
        listaDel.add(new TraficoDrogas("Cocaina", 10, 2, "Traslado Avioneta", "n/a", "Mexico", "Inocente", 800, false, "10-12-2015"));
        listaCri.add(new Criminal("Maria", "Femenino", "Vnezuela", "Triguenia, Caracola", 18, true));
        listaCri.add(new Asesino("Juan Luna", "Cuchillo", "Ivanka", "Femenino", "Coracia", "Rubia, Ojos Grises", 25, false));
        listaCri.add(new Terrorista("Nicaragua", "Managua", "Gas Sarin", "Vladimir", "Masculino", "Rusia", "Rubio, Ojos Azules, Calvo", 37, false));
        listaCri.add(new Secuestrador("Ana Luisa", 300000, "Don", "Masculino", "USA", "Calvo, Caucasico", 42, false));
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
                    if (op <= 9 && op >= 0) {
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
                    int opAgr = MenuAgregar();
                    switch (opAgr) {
                        case 1:
                            read.nextLine();
                            AgrVandalismo();
                            break;
                        case 2:
                            read.nextLine();
                            AgrHurto();
                            break;
                        case 3:
                            read.nextLine();
                            AgrProstitucion();
                            break;
                        case 4:
                            System.out.println("Proxima Revision");
                            break;
                        case 5:
                            System.out.println("Proxima Revision");
                            break;
                        case 6:
                            System.out.println("Proxima Revision");
                            break;
                        case 7:
                            System.out.println("Proxima Revision");
                            break;
                        case 8:
                            System.out.println("Proxima Revision");
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Proxima Revision");
                    break;
                case 3:
                    System.out.println("Proxima Revision");
                    break;
                case 4:
                    System.out.println("Proxima Revision");
                    break;
                case 5:
                    ListarDelitos();
                    break;
                case 6:
                    ListarCriminales(0,0);
                    break;
                case 7:
                    System.out.println("Proxima Revision");
                    break;
                case 8:
                    System.out.println("Proxima Revision");
                    break;
                case 9:
                    Criminal agente;
                    System.out.println("Bienvenido al Servicio TAS");
                    System.out.print("Diganos, ");
                    ListarCriminales(1,0);
                    System.out.println("Por Favor, seleccione el agente para su trabajo");
                    do
                        try {
                            int pos = read.nextInt();
                            agente = listaCri.get(pos);
                            if (pos >= 0 && pos < listaCri.size()) {
                                read.nextLine();
                                break;
                            }
                        } catch (NullPointerException e) {
                            System.out.println("Debe ingresar un agente valido");
                        }
                    while(true);
                    switch (agente.getClass().getSimpleName()) {
                        case "Terrorista":
                            System.out.println("Ingrese el pais de Ataque:");
                            ((Terrorista)agente).setPaisAtaque(read.nextLine());
                            System.out.println("Ingrese la ciudad del atentado:");
                            ((Terrorista)agente).setCiudad(read.nextLine());
                            System.out.println("Ingrese el Metodo para el atentado:");
                            ((Terrorista)agente).setMetodo(read.nextLine());
                            ((Terrorista)agente).Delito();
                            System.out.println("\n");
                            break;
                        case "Asesino":
                            System.out.println("Ingrese el nombre de la victima:");
                            ((Asesino)agente).setNombreVictima(read.nextLine());
                            System.out.println("Ingrese el Arma para el asesinato:");
                            ((Asesino)agente).setArma(read.nextLine());
                            ((Asesino)agente).Delito();
                            System.out.println("\n");
                            break;
                        case "Secuestrador":
                            System.out.println("Ingrese el nombre de la victima:");
                            ((Secuestrador)agente).setNombreVictima(read.nextLine());
                            System.out.println("Ingrese el costo por el Rescate:");
                            do {
                                try {
                                    double cant = read.nextDouble(); 
                                    ((Secuestrador)agente).setCantidadRescate(cant);
                                    if (cant > 1000) {
                                        break;
                                    } else {
                                        System.out.println("Debe ingresar un numero mayor a 1000!!!");
                                    }
                                } catch (InputMismatchException ExVariable) {
                                    System.out.println("Debe ingresar un valor numerico acorde!!!!");
                                    read.next();
                                }
                            } while (true);
                            ((Secuestrador)agente).Delito();
                            System.out.println("\n");
                            break;
                    }
                    
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
    
    public static int ListarDelitoMenu(){
        int op;
        do {
            try {
                System.out.println("Que Delitos desea Listar"
                + "\n\t1. Delitos Mayores"
                + "\n\t2. Delitos Menores"
                + "\n\t0. Salir");
                op = read.nextInt();
                if (op <= 2 && op >= 0) {
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
            do {
                try {
                    System.out.println("Que Delitos desea Listar"
                    + "\n\t1. Terrorismo"
                    + "\n\t2. Asesinato"
                    + "\n\t3. Violacion"
                    + "\n\t4. Secuestro"
                    + "\n\t5. Trafico de Drogas"
                    + "\n\t0. Salir");
                    op = read.nextInt();
                    if (op <= 5 && op >= 0) {
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
            do {
                try {
                    System.out.println("Que Delitos desea Listar"
                    + "\n\t1. Vandalismo"
                    + "\n\t2. Hurto"
                    + "\n\t3. Prostitucion"
                    + "\n\t0. Salir");
                    op = read.nextInt();
                    if (op <= 3 && op >= 0) {
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
        do {
            try {
                System.out.println("Que Criminales desea Listar"
                + "\n\t1. Agentes"
                + "\n\t2. Criminales Comunes"
                + "\n\t0. Salir");
                op = read.nextInt();
                if (op <= 2 && op >= 0) {
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
    
    public static int ListarSubCriminales(int opOne){
        int op;
        if (opOne == 1) {
            do {
                try {
                    System.out.println("Que Agentes desea Listar"
                    + "\n\t1. Terrorista"
                    + "\n\t2. Asesino"
                    + "\n\t3. Secuestrador"
                    + "\n\t0. Salir");
                    op = read.nextInt();
                    if (op <= 3 && op >= 0) {
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
            op = 5;
        }
        return op;
    }
    
    public static void ListarDelitos(){
        int op = ListarDelitoMenu();
        int op2 = ListarSubDelitos(op);
        int header = 0;
        switch (op) {
            case 1:
                for (int i = 0; i < listaDel.size(); i++) {
                    switch (op2) {
                        case 1:
                            if (listaDel.get(i).getClass().getSimpleName().equals("Terrorismo")) {
                                if (header == 0) {header++;
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Nombre Artefacto    |Numero de Victimas  |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 2:
                            if (listaDel.get(i).getClass().getSimpleName().equals("Asesinato")) {
                                if (header == 0) {header++;
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Nombre Arma         |Numero de Cuerpos   |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 3:
                            if (listaDel.get(i).getClass().getSimpleName().equals("Violacion")) {
                                if (header == 0) {header++;
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Edad Victima        |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 4:
                            if (listaDel.get(i).getClass().getSimpleName().equals("Secuestro")) {
                                if (header == 0) {header++;
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Tiempo Retenido     |Fue Devuelto        |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 5:
                            if (listaDel.get(i).getClass().getSimpleName().equals("TraficoDrogas")) {
                                if (header == 0) {header++;
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Nombre Droga        |Cantidad            |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
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
                                if (header == 0) {header++;
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Nombre Policia      |ID Policia          |Numero Celda        |Edificacion         |Numero de Pisos     |Nombre Duenio       |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 2:
                            if (listaDel.get(i).getClass().getSimpleName().equals("Hurto")) {
                                if (header == 0) {header++;
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Nombre Policia      |ID Policia          |Numero Celda        |Objeto Hurtado      |Valor               |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 3:
                            if (listaDel.get(i).getClass().getSimpleName().equals("Prostitucion")) {
                                if (header == 0) {header++;
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Descripcion         |Nombre Victima      |Pais                |Sentencia           |Numero Delito       |Culpable            |Fecha               |Nombre Policia      |ID Policia          |Numero Celda        |Nombre Solicitante  |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  " + listaDel.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
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
    
    public static void ListarCriminales(int op, int op2){
        if ( op == 0) {
            op = ListarCriminalMenu();
        }
        if (op2 == 0) {
            op2 = ListarSubCriminales(op);
        }
        int header = 0;
        switch (op) {
            case 1:
                for (int i = 0; i < listaCri.size(); i++) {
                    switch (op2) {
                        case 1:
                            if (listaCri.get(i).getClass().getSimpleName().equals("Terrorista")) {
                                if (header == 0) {header++;
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Nombre              |Genero              |Pais Residencia     |Descripcion         |Edad                |Esta Encarcelado    |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|  " + i + "  " + listaCri.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  " + listaCri.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 2:
                            if (listaCri.get(i).getClass().getSimpleName().equals("Asesino")) {
                                if (header == 0) {header++;
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Nombre              |Genero              |Pais Residencia     |Descripcion         |Edad                |Esta Encarcelado    |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|  " + i + "  " + listaCri.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  " + listaCri.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 3:
                            if (listaCri.get(i).getClass().getSimpleName().equals("Secuestrador")) {
                                if (header == 0) {header++;
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|No.  |Nombre              |Genero              |Pais Residencia     |Descripcion         |Edad                |Esta Encarcelado    |");
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                    System.out.println("|  " + i + "  " + listaCri.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                } else {
                                    System.out.println("|  " + i + "  " + listaCri.get(i).toString());
                                    System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                                }
                            }
                            break;
                        case 0:
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
                                System.out.println("|  "+i+"  "+listaCri.get(i).toString());
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                            }else{
                                System.out.println("|  "+i+"  "+listaCri.get(i).toString());
                                System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+");
                            }
                            break;
                    }
                }
                break;
        }
    }
    
    public static int MenuAgregar(){
        int op;
        do {
            try {
                System.out.println("Que Delitos desea Agregar"
                    + "\n\t1. Vandalismo"
                    + "\n\t2. Hurto"
                    + "\n\t3. Prostitucion"
                    + "\n\t4. Terrorismo"
                    + "\n\t5. Asesinato"
                    + "\n\t6. Violacion"
                    + "\n\t7. Secuestro"
                    + "\n\t8. Trafico de Drogas"
                    + "\n\t0. Salir");
                op = read.nextInt();
                if (op <= 8 && op >= 0) {
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
    
    public static void AgrVandalismo(){
        Delito d = new Vandalismo();
        System.out.println("Ingrese la descripcion del Delito: ");
        d.setDescripcion(read.nextLine());
        System.out.println("Ingrese el nombre de la Victima: ");
        d.setNombreVictima(read.nextLine());
        System.out.println("Ingrese el Pais de la Victima: ");
        d.setPais(read.nextLine());
        do {
            try {
                System.out.println("Ingrese el Numero del Delito");
                int num = read.nextInt();
                if (num > 1000) {
                    d.setNumeroDelito(num);
                    break;
                } else {
                    System.out.println("El numero de delito debe ser mayo que 1000");
                }
            } catch (InputMismatchException ExVariable) {
                System.out.println("Debe ingresar un valor numerico");
                read.next();
            }
        } while (true);
        do {
            try {
                System.out.println("En este Delito se dicto culpabilidad?"
                        + "\n\t1. Si"
                        + "\n\t2. No");
                int op = read.nextInt();
                if (op > 0 && op < 3) {
                    read.nextLine();
                    if (op == 1) {
                        d.setIsCulpable(true);
                        System.out.println("Cual fue la sentencia? (# Anios)");
                        d.setSentencia(read.nextLine());
                    } else {
                        d.setIsCulpable(false);
                        d.setSentencia("Inocente");
                    }
                    break;
                } else {
                    System.out.println("Dene selecionar una opcion valida");
                }
            } catch (InputMismatchException ExVariable) {
                System.out.println("Solo puede ingresar valore numericos");
                read.next();
            }
        } while (true);
        System.out.println("Ingrese la fecha del delito: dd-mm-yyyy");
        d.setFecha(read.nextLine());
        System.out.println("Ingrese le nombre del Policia");
        ((DelitoMenor) d).setNombrePolicia(read.nextLine());
        System.out.println("Ingrese el Id del Policia");
        ((DelitoMenor) d).setIdPolicia(read.nextInt());
        read.nextLine();
        if (d.isIsCulpable()) {
            System.out.println("Ingrese el numero de la celda");
            ((DelitoMenor) d).setNumeroCelda(read.nextInt());
            read.nextLine();
        }else{
            ((DelitoMenor) d).setNumeroCelda(0);
        }
        System.out.println("Ingrese el nombre del Edificio");
        ((Vandalismo) d).setEdificacion(read.nextLine());
        System.out.println("Ingrese el numero de pisos");
        ((Vandalismo) d).setPisos(read.nextInt()); read.nextLine();
        System.out.println("Ingrese el nombre del duenio");
        ((Vandalismo) d).setNombreDuenio(read.nextLine());
        listaDel.add(d);
    }
    
    public static void AgrHurto(){
        Delito d = new Hurto();
        System.out.println("Ingrese la descripcion del Delito: ");
        d.setDescripcion(read.nextLine());
        System.out.println("Ingrese el nombre de la Victima: ");
        d.setNombreVictima(read.nextLine());
        System.out.println("Ingrese el Pais de la Victima: ");
        d.setPais(read.nextLine());
        do {
            try {
                System.out.println("Ingrese el numero de la celda");
                int num = read.nextInt();
                if (num > 1000) {
                    d.setNumeroDelito(num);
                    break;
                } else {
                    System.out.println("El numero de delito debe ser mayo que 1000");
                }
            } catch (InputMismatchException ExVariable) {
                System.out.println("Debe ingresar un valor numerico");
                read.next();
            }
        } while (true);
        do {
            try {
                System.out.println("En este Delito se dicto culpabilidad?"
                        + "\n\t1. Si"
                        + "\n\t2. No");
                int op = read.nextInt();
                if (op > 0 && op < 3) {
                    read.nextLine();
                    if (op == 1) {
                        d.setIsCulpable(true);
                        System.out.println("Cual fue la sentencia? (# Anios)");
                        d.setSentencia(read.nextLine());
                    } else {
                        d.setIsCulpable(false);
                        d.setSentencia("Inocente");
                    }
                    break;
                } else {
                    System.out.println("Dene selecionar una opcion valida");
                }
            } catch (InputMismatchException ExVariable) {
                System.out.println("Solo puede ingresar valore numericos");
                read.next();
            }
        } while (true);
        System.out.println("Ingrese la fecha del delito: dd-mm-yyyy");
        d.setFecha(read.nextLine());
        System.out.println("Ingrese le nombre del Policia");
        ((DelitoMenor) d).setNombrePolicia(read.nextLine());
        System.out.println("Ingrese el Id del Policia");
        ((DelitoMenor) d).setIdPolicia(read.nextInt());
        read.nextLine();
        if (d.isIsCulpable()) {
            System.out.println("Ingrese el numero de la celda");
            ((DelitoMenor) d).setNumeroCelda(read.nextInt());
            read.nextLine();
        }else{
            ((DelitoMenor) d).setNumeroCelda(0);
        }
        System.out.println("Ingrese el Onjeto Hurtado");
        ((Hurto)d).setObjeto(read.nextLine());
        System.out.println("Ingrese el valor del Objeto");
        ((Hurto)d).setValor(read.nextInt());
        listaDel.add(d);
    }
    
    public static void AgrProstitucion(){
        Delito d = new Prostitucion();
        System.out.println("Ingrese la descripcion del Delito: ");
        d.setDescripcion(read.nextLine());
        System.out.println("Ingrese el nombre de la Victima: ");
        d.setNombreVictima(read.nextLine());
        System.out.println("Ingrese el Pais de la Victima: ");
        d.setPais(read.nextLine());
        do {
            try {
                System.out.println("Ingrese el numero de la celda");
                int num = read.nextInt();
                if (num > 1000) {
                    d.setNumeroDelito(num);
                    break;
                } else {
                    System.out.println("El numero de delito debe ser mayo que 1000");
                }
            } catch (InputMismatchException ExVariable) {
                System.out.println("Debe ingresar un valor numerico");
                read.next();
            }
        } while (true);
        do {
            try {
                System.out.println("En este Delito se dicto culpabilidad?"
                        + "\n\t1. Si"
                        + "\n\t2. No");
                int op = read.nextInt();
                if (op > 0 && op < 3) {
                    read.nextLine();
                    if (op == 1) {
                        d.setIsCulpable(true);
                        System.out.println("Cual fue la sentencia? (# Anios)");
                        d.setSentencia(read.nextLine());
                    } else {
                        d.setIsCulpable(false);
                        d.setSentencia("Inocente");
                    }
                    break;
                } else {
                    System.out.println("Dene selecionar una opcion valida");
                }
            } catch (InputMismatchException ExVariable) {
                System.out.println("Solo puede ingresar valore numericos");
                read.next();
            }
        } while (true);
        System.out.println("Ingrese la fecha del delito: dd-mm-yyyy");
        d.setFecha(read.nextLine());
        System.out.println("Ingrese le nombre del Policia");
        ((DelitoMenor) d).setNombrePolicia(read.nextLine());
        System.out.println("Ingrese el Id del Policia");
        ((DelitoMenor) d).setIdPolicia(read.nextInt());
        read.nextLine();
        if (d.isIsCulpable()) {
            System.out.println("Ingrese el numero de la celda");
            ((DelitoMenor) d).setNumeroCelda(read.nextInt());
            read.nextLine();
        }else{
            ((DelitoMenor) d).setNumeroCelda(0);
        }
        ((Prostitucion) d).setNombreSolicitante(read.nextLine());
        listaDel.add(d);
    }
    
    
    
}
