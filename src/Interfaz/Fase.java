package Interfaz;
import java.util.Scanner;
public class Fase {
    Scanner sc=new Scanner(System.in);
    private String numeroalerta;
    private String descripcion;
    private int prioridad=1;
    private int contador;
    public void setNumeroalerta(String numeroalerta){
        this.numeroalerta=numeroalerta;
    }
    public void Prioridadinicial(){
        System.out.println("\nLa prioriedad es: "+prioridad);
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

}
