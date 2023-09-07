package poo.clave;
import java.util.Random;

public class GeneradorAleatorio {
    private final Random random = new Random();

    public char generarClaveUnica() { //Usado para generar la clave por primera vez
    String valoresPosibles = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    return valoresPosibles.charAt(random.nextInt(valoresPosibles.length()));

    }

    //Los siguientes metodos son para generar una clave fuerte
    public char generarNumero(){
        String numeros = "0123456789";
        return numeros.charAt(random.nextInt(numeros.length()));
    }

    public char generarLetraMinuscula(){
        String letraMinuscula = "abcdefghijklmnopqrstuvwxyz";
        return letraMinuscula.charAt(random.nextInt(letraMinuscula.length()));
    }

    public char generarLetraMayuscula(){
        String letraMayuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return letraMayuscula.charAt(random.nextInt(letraMayuscula.length()));
    }
}
