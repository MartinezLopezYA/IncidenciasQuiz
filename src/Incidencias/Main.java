package Incidencias;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
Yerson Andres Martinez Lopez
ID: 708115
 */

public class Main {
    public static void main(String[] args) {

        Random ale = new Random();
        Scanner comand = new Scanner(System.in);

        boolean salir = false;

        Incidencia in1 = new Incidencia(1, ale.nextInt(10), "No hay acceso a internet", "Pendiente");
        Incidencia in2 = new Incidencia(2, ale.nextInt(10), "No da imagen","Pendiente");
        Incidencia in3 = new Incidencia();
        in3.setCodigo(3);
        in3.setPuesto(ale.nextInt(10));
        in3.setNomIncidencte("No arranca el ordenador");
        in3.setEstado("Pendiente");
        ArrayList<Incidencia> Incidencias = new ArrayList<>();
        ArrayList<Incidencia> Resueltas = new ArrayList<>();
        ArrayList<Incidencia> Pendientes = new ArrayList<>();

        Incidencias.add(in1);
        Incidencias.add(in2);
        Incidencias.add(in3);

        while (!salir){
            System.out.println("1. Ver Todas las Incidencias: ");
            System.out.println("2. Ver Incidencias resueltas: ");
            System.out.println("3. Ver Incidencias pendientes: ");
            System.out.println("4. Arreglar Incidencia: ");
            System.out.println("5. Crear incidencia: ");
            System.out.println("6. Salir");
            System.out.print("Digite una opción: ");
            int opc = comand.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Hay " + Incidencias.size() + " Incidencias");
                    for (Incidencia inT: Incidencias) {
                        System.out.println(inT);
                    }
                    System.out.println();
                    break;
                case 2:
                    for (Incidencia in: Incidencias) {
                        if (in.getEstado() == "Resuelto"){
                            System.out.println(in);
                            Resueltas.add(in);
                        }
                    }
                    System.out.println("Hay " + Resueltas.size() + " incidencias resueltas \n");
                    break;
                case 3:
                    for (Incidencia in: Incidencias) {
                        if (in.getEstado() == "Pendiente"){
                            System.out.println(in);
                            Pendientes.add(in);
                        }
                    }
                    System.out.println("Hay " + Pendientes.size() + " incidencias pendientes \n");
                    break;
                case 4:
                    int x = 0;
                    System.out.println("Digite numero incidencia: ");
                    x = comand.nextInt();
                    if (x == 1){
                        in1.arregloIncidente(x);
                    }else if (x == 2){
                        in2.arregloIncidente(x);
                    } else if (x == 3){
                        in3.arregloIncidente(x);
                    }else {
                        System.out.println("No existe esa incidencia");
                    }
                    System.out.println();
                    break;

                case 5:
                    Incidencia nueva =new Incidencia();
                    int a = Incidencias.size() + 1;
                    int b = ale.nextInt(10);
                    nueva.crearIncidencia(a, b);
                    Incidencias.add(nueva);
                    System.out.println();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("\nOpcion invalida");
            }
        }
    }
}