import poo.cola.Cola;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opciones = -1;
        Cola cola = new Cola();
        System.out.println("Cola creada.");
        System.out.println("---------------------------");
        while (opciones != 0){
            Scanner sc = new Scanner(System.in);
            Object dato;
            System.out.println("1 - Encolar. ");
            System.out.println("2 - Desencolar. ");
            System.out.println("3 - Recuperar frente de la cola. ");
            System.out.println("4 - Consultar si la cola esta vacia. ");
            System.out.println("---------------------------");
            System.out.print("Ingrese cualquier otro caracter para salir: ");
            opciones = sc.nextInt();
            if (opciones == 1){
                System.out.println("---------------------------");
                System.out.print("Ingrese el elemento a encolar:");
                dato = sc.next();
                cola.encolar(dato);
                System.out.println("Elemento encolado.");
                System.out.println("---------------------------");
            } else if (opciones == 2){
                System.out.println("---------------------------");
                if (cola.vacia()){
                    System.out.println("La cola esta VACIA.");
                }else {
                    cola.desencolar();
                    System.out.println("Frente desencolado.");
                }
                System.out.println("---------------------------");
            }else if (opciones == 3){
                if (cola.vacia()){
                    System.out.println("La cola esta VACIA.");
                }else {
                    dato = cola.recuperar();
                    System.out.println("---------------------------");
                    System.out.println("El elemento del frente es:" + dato);
                }
                System.out.println("---------------------------");
            }else if (opciones == 4){
                System.out.println("---------------------------");
                if (cola.vacia()){
                    System.out.println("La cola esta VACIA.");
                }else{
                    System.out.println("La cola NO esta VACIA.");
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