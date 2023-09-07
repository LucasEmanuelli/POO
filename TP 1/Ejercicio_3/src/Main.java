import poo.pila.Pila;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opciones = -1;
        Pila pila = new Pila();
        System.out.println("Pila creada.");
        while (opciones != 0){
            Scanner sc = new Scanner(System.in);
            Object dato;
            System.out.println("---------------------------");
            System.out.println("1 - Apilar en la pila. ");
            System.out.println("2 - Desapilar. ");
            System.out.println("3 - Recuperar elemento del tope. ");
            System.out.println("4 - Consultar si la pila esta vacia. ");
            System.out.println("---------------------------");
            System.out.print("Ingrese cualquier otro caracter para salir: ");
            opciones = sc.nextInt();
            if (opciones == 1){
                System.out.println("---------------------------");
                System.out.print("Ingrese el elemento a agregar:");
                dato = sc.next();
                pila.apilar(dato);
                System.out.println("Elemento apilado.");
                System.out.println("---------------------------");
            } else if (opciones == 2){
                System.out.println("---------------------------");
                if (pila.vacia()){
                    System.out.println("La pila esta VACIA.");
                }else {
                    pila.desapilar();
                    System.out.println("Tope desapilado.");
                }
                System.out.println("---------------------------");
            }else if (opciones == 3){
                dato = pila.recuperar();
                if (pila.vacia()){
                    System.out.println("La pila esta VACIA.");
                }else {
                    System.out.println("---------------------------");
                    System.out.println("El elemento del tope es:" + dato);
                }
                System.out.println("---------------------------");
            }else if (opciones == 4){
                System.out.println("---------------------------");
                if (pila.vacia()){
                    System.out.println("La pila esta VACIA.");
                }else{
                    System.out.println("La pila NO esta VACIA.");
                }
                System.out.println("---------------------------");
            }else{
                opciones = 0;
                System.out.println("Saliendo...");
                System.out.println("---------------------------");
            }

        }
    }
}