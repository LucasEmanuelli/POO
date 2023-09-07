package poo.fechas;
import java.time.LocalDate;

public class OperacionesFechas {
    private LocalDate fecha;

    public OperacionesFechas(int dia, int mes, int anio){
        this.fecha = LocalDate.of(anio,mes,dia);
    }

    public String devolverFormato(int i){
        String cadena = "";
        if (i == 1){ //dd-MM-yyyy
            cadena = fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
        }else{ //MM-dd-yyyy //opcion 2
            cadena = fecha.getMonthValue() + "/" + fecha.getDayOfMonth() + "/" + fecha.getYear();
        }

        return cadena;
    }

    public String esMayor(LocalDate fecha1){
        String cadena = "";
        if (fecha.isAfter(fecha1)){
            cadena = "La fecha es mayor a la fecha proporcionada.";
        }else{
            cadena = "La fecha NO es mayor a la fecha proporcionada.";
        }
        return cadena;
    }
    public String esMenor(LocalDate fecha1){
        String cadena = "";
        if (fecha.isBefore(fecha1)){
            cadena = "La fecha es menor a la fecha proporcionada.";
        }else{
            cadena = "La fecha NO es menor a la fecha proporcionada.";
        }
        return cadena;
    }

    public String entreFechas(LocalDate fecha1, LocalDate fecha2){
        String cadena = "";
        if (fecha.isAfter(fecha1) && fecha.isBefore(fecha2)){
            cadena = "La fecha se encuentra entre " + fecha1.toString() + " y " + fecha2.toString();
        }else{
            cadena = "La fecha no se encuentra entre las otras dos fechas proporcionadas.";
        }
        return cadena;
    }
}

