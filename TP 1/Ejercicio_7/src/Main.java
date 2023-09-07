import poo.cuadratica.Resolvente;

public class Main {
    public static void main(String[] args) {
        Resolvente ecuacion =  new Resolvente(1,4,-5);
        System.out.println(ecuacion.resolucion());
        System.out.println(ecuacion.calcularY(3));
        ecuacion =  new Resolvente(3,7,6);
        System.out.println(ecuacion.resolucion());
        System.out.println(ecuacion.calcularY(7));
        ecuacion =  new Resolvente(0,4,-2);
        System.out.println(ecuacion.resolucion());
        System.out.println(ecuacion.calcularY(2));
        ecuacion =  new Resolvente(1,-4,0);
        System.out.println(ecuacion.resolucion());
        System.out.println(ecuacion.calcularY(0));
        ecuacion =  new Resolvente(1,0,1);
        System.out.println(ecuacion.resolucion());
        System.out.println(ecuacion.calcularY(1));
        ecuacion =  new Resolvente(1,-4,4);
        System.out.println(ecuacion.resolucion());
        System.out.println(ecuacion.calcularY(1));
    }

}
