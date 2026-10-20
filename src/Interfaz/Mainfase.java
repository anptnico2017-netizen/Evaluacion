package Interfaz;
import java.util.Scanner;
public class Mainfase {
    static void main() {
        Fase numeroalerta;
        numeroalerta=new Fase();
        numeroalerta.setNumeroalerta("1750");
        Scanner sc=new Scanner(System.in);
        Fase descripcion;
        descripcion=new Fase();
        descripcion.setDescripcion("ESTA ALERTA TIENE PELIGRO");
        Fase prioridad;
        prioridad=new Fase();
        boolean salir=false;
        while (!salir) {
            System.out.println("\nProfe Califique con corazon de madre. Le queremos profe (00)/");
            System.out.println("\n--Menu Evaluacion--");
            System.out.println("\n1.Identificador de alerta");
            System.out.println("\n2.Descripcion evento");
            System.out.println("\n3.Nivel de prioridad");
            System.out.println("\n4.Contador de alertas");
            System.out.println("\n5.Cerrar programa");
            System.out.println("\nElige una opcion");
            int opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("\nEl identificador de alerta es: "+numeroalerta);
                    break;
                case 2:
                    System.out.println("\nLa descripcion es: "+descripcion);
                    System.out.println("\nCambie la descripcion sino escribala igual");
                        break;
                case 3:
                    prioridad.Prioridadinicial();
                    System.out.println("\nQuieres sumar 1?");
                    break;
                case 4:
                    System.out.println("\nEl contador de alertas es: ");
                    break;
                case 5:
                    salir=true;
                    System.out.println("\nGracias por usar el programa");
                    break;
                default:
                    System.out.println("\nOpcion no valida,intenta de nuevo");
                    break;
            }
        }
    }
}
