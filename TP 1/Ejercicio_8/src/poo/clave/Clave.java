package poo.clave;

public class Clave {
    private String clave = "";
    private int longitud;

    public Clave() { // Para generar clave con longitud por defecto
        this.longitud = 8;
        GeneradorAleatorio generador = new GeneradorAleatorio();
        for (int i = 0; i < this.longitud; i++) {
            this.clave = this.clave + generador.generarClaveUnica();
        }

    }

    public Clave (int largo){ // Para generar clave con longitud deseada.
        this.longitud = largo;
        GeneradorAleatorio generador = new GeneradorAleatorio();
        for (int i = 0; i < this.longitud; i++) {
            this.clave = this.clave + generador.generarClaveUnica();
        }
    }

    public String getClave() {
        return this.clave;
    }

    public int getLongitud(){
        return this.longitud;
    }

    public void setLongitud(int nuevaLongitud){
        if (nuevaLongitud > this.longitud){ //Si la nueva longitud es mayor le agrego valores al azar.
            GeneradorAleatorio generador = new GeneradorAleatorio();
            int dif = nuevaLongitud - this.longitud;
            for (int i = 0; i < dif; i++) {
                this.clave = this.clave + generador.generarClaveUnica();
            }
        }else if (nuevaLongitud < this.longitud){ // Si la nueva longitud es menor le quito valores.
            String cadena = "";
            for (int i = 0; i < nuevaLongitud; i++) {
                cadena = cadena + this.clave.charAt(i);
            }
            this.clave = cadena;
            }
        this.longitud = nuevaLongitud;
    }

    public boolean esFuerte(){ //Chequea si la contrasena es fuerte
        int cantMinus = 0;
        int cantMayus = 0;
        int cantNum = 0;

        for (int i = 0; i < this.longitud; i++){
            if (Character.isUpperCase(this.clave.charAt(i))){
                cantMayus = cantMayus + 1;
            }
            if (Character.isLowerCase(this.clave.charAt(i))){
                cantMinus = cantMinus + 1;
            }
            if (Character.isDigit(this.clave.charAt(i))){
                cantNum = cantNum + 1;
            }
        }
        if ((cantMayus > 2) && (cantMinus > 1) && (cantNum >= 2)){
            return  true;
        }else{
            return false;
        }
    }

    public void transformarFuerte() {
        int cantMinus = 0;
        int cantMayus = 0;
        int cantNum = 0;
        this.clave = "";
        GeneradorAleatorio generador = new GeneradorAleatorio();
        for (int i = 0; i < this.longitud; i++) {
            if (cantMayus < 3){
                this.clave = this.clave + generador.generarLetraMayuscula();
                cantMayus++;
            } else if (cantMinus < 2){
                this.clave = this.clave + generador.generarLetraMinuscula();
                cantMinus++;
            } else if (cantNum < 2){
                this.clave= this.clave + generador.generarNumero();
                cantNum++;
            } else {
                this.clave = this.clave + generador.generarClaveUnica();
            }
        }
        return;
    }


}
