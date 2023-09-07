import poo.clave.ListaEnlazada;
import  poo.clave.Clave;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int longitudElegir = -1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la longitud de las claves para la lista:");
        longitudElegir =  sc.nextInt();
        ListaEnlazada lista = new ListaEnlazada(longitudElegir);
        System.out.println(lista.mostrar());

        }
}
