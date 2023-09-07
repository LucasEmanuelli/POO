import poo.lista.ListaEnlazada;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opciones = -1;
        ListaEnlazada lista = new ListaEnlazada();
        System.out.println("Lista creada.");
        while (opciones != 0){
            Scanner sc = new Scanner(System.in);
            Object dato;
            int posicion;
            System.out.println("1 - Mostrar lista. ");
            System.out.println("2 - Agregar a la lista. ");
            System.out.println("3 - Eliminar de la lista. ");
            System.out.println("4 - Insertar en posicion de la lista. ");
            System.out.println("5 - Obtener longitud de la lista. ");
            System.out.println("6 - Recupera elemento de la lista. ");
            System.out.println("7 - Determinar si la lista esta vacia. ");
            System.out.println("---------------------------");
            System.out.print("Ingrese cualquier otro caracter para salir: ");
            opciones = sc.nextInt();
            if (opciones == 1){
                System.out.println("---------------------------");
                System.out.println(lista.mostrar());
                System.out.println("---------------------------");
            } else if (opciones == 2){
                System.out.println("---------------------------");
                System.out.print("Ingrese el elemento a agregar:");
                dato = sc.next();
                lista.agregar(dato);
                System.out.println("Elemento agregado.");
                System.out.println("---------------------------");
            }else if (opciones == 3){
                System.out.println("---------------------------");
                System.out.print("Ingrese el elemento a eliminar de la lista:");
                dato = sc.next();
                lista.eliminar(dato);
                System.out.println("Elemento eliminado.");
                System.out.println("---------------------------");
            }else if (opciones == 4){
                System.out.println("---------------------------");
                System.out.print("Ingrese el elemento a insertar:");
                dato = sc.next();
                System.out.print("Ingrese la posicion del elemento a insertar:");
                posicion = sc.nextInt();
                lista.insertar(dato, posicion);
                System.out.println("Elemento insertado.");
                System.out.println("---------------------------");
            }else if (opciones == 5){
                System.out.println("---------------------------");
                System.out.print("La longitud de la lista es:");
                System.out.println(lista.longitud());
                System.out.println("---------------------------");
            }else if (opciones == 6){
                System.out.print("Ingrese la posicion del elemento a recuperar:");
                posicion = sc.nextInt();
                System.out.println("El dato es:" + lista.recuperar((posicion)));
                System.out.println("---------------------------");
            }else if (opciones == 7){
                System.out.println("---------------------------");
                if (lista.vacia()){
                    System.out.println("La lista esta vacia.");
                }else{
                    System.out.println("La lista no esta vacia.");
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