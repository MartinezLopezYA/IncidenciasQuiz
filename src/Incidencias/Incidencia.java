package Incidencias;

import java.util.Scanner;

public class Incidencia {

    private int codigo;
    private int puesto;
    private String nomIncidencte;
    private String estado;

    public Incidencia() {
    }

    public Incidencia(int codigo, int puesto, String nomIncidencte, String estado) {
        this.codigo = codigo;
        this.puesto = puesto;
        this.nomIncidencte = nomIncidencte;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public String getNomIncidencte() {
        return nomIncidencte;
    }

    public void setNomIncidencte(String nomIncidencte) {
        this.nomIncidencte = nomIncidencte;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "codigo=" + codigo +
                ", puesto=" + puesto +
                ", nomIncidencte='" + nomIncidencte + '\'' +
                ", estad=" + estado +
                '}';
    }

    Scanner comand  =new Scanner(System.in);

    public void arregloIncidente(int x){

        if (getCodigo() == x){
            System.out.println(getNomIncidencte());
            System.out.println("La Solución es: ");
            String sol = comand.nextLine();
            setEstado("Resuelto");
        }else {
            System.out.println("Todo correcto");
        }
    }

    public void crearIncidencia(int x, int y){
        this.codigo = x;
        this.puesto = y;
        System.out.print("Digite nombre incidencia: ");
        this.nomIncidencte = comand.nextLine();
        this.estado = "Pendiente";
    }

}
