package poo.cuadratica;
import static java.lang.Math.sqrt;

public class Resolvente {
    private final int a;
    private final int b;
    private final int c;
    public Resolvente(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    };

    public String resolucion(){
        String cadena = "";
        int radicando = (b * b) - (4 * a * c);
        if (a == 0){
            cadena = "El coeficiente cuadratico no puede ser cero.";
            return cadena;
        }
        if (radicando==0){
            double respuesta = (double) ((-b)/(2*a));
            cadena = "La solucion es:" + respuesta;

        }else if (radicando > 0){
            double respuestaUno = (double) (-b + sqrt(radicando)) /(2*a);
            double respuestaDos = (double) (-b - sqrt(radicando)) /(2*a);
            cadena = ("Las soluciones son:" + respuestaUno + " y " + respuestaDos);
        }else{
            cadena = "La solucion incluye numeros imaginarios.";
        }
        return cadena;
    }


    public String calcularY(int x) {
        String cadena = "";
        int respuesta = (a * x * x) + (b * x) + (c);
        cadena = "El valor de Y es:" + respuesta;
        return cadena;
    }



}
