import poo.fechas.OperacionesFechas;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        OperacionesFechas fecha = new OperacionesFechas(24,11,2023);
        System.out.println("Formato 1:" + fecha.devolverFormato(1));
        System.out.println("Formato 2:" + fecha.devolverFormato(2));
        System.out.println(fecha.esMayor(LocalDate.parse("2022-03-05")));
        System.out.println(fecha.esMayor(LocalDate.parse("2024-03-05")));
        System.out.println(fecha.esMenor(LocalDate.parse("2022-03-05")));
        System.out.println(fecha.esMenor(LocalDate.parse("2024-03-05")));
        System.out.println(fecha.entreFechas(LocalDate.parse("2022-03-05"),LocalDate.parse("2024-03-05")));
        System.out.println(fecha.entreFechas(LocalDate.parse("2024-03-05"),LocalDate.parse("2025-03-05")));

        }
    }
