package poo.tareas;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class ListaTarea {
    private Nodo primero = null;
    public int longitud(){
        int i = 0;
        Nodo nodoAux = primero;
        while(nodoAux != null){
            nodoAux = nodoAux.getProximo();
            i++;
        }
        return i;
    }
    public void agregar(String descripcion, int prioridad, int estado, String fecha, String fechaRec){
        Tarea tarea = new Tarea();
        tarea.setDescripcion(descripcion);
        if (estado==1){
            tarea.setEstado("COMPLETA");
        }else{
            tarea.setEstado("INCOMPLETA");
        }
        tarea.setFecha(LocalDate.parse(fecha));
        tarea.setPrioridad(prioridad);
        tarea.setFechaRecordatorio(LocalDate.parse(fechaRec));

        if (LocalDate.now().isEqual(tarea.getFechaRecordatorio()) || LocalDate.now().isAfter(tarea.getFechaRecordatorio())){
            tarea.setPrioridad(1);
        }

        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setTarea(tarea);

        if (primero == null){
            primero = nuevoNodo;
        }else{
            Nodo nodoAux = primero;
            while (nodoAux.getProximo() != null){
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nuevoNodo);
        }

    }
    public String mostrarTarea(int idTarea){
        String cadena = "";
        Nodo nodoAux =  primero;
        if(nodoAux == null) {
            cadena = "La lista no tiene tareas.";
        }else{
            int i = 1;
            String descTarea;
            while(nodoAux != null){
                if (i == idTarea){
                    descTarea = nodoAux.getTarea().getDescripcion();
                    cadena = descTarea;
                    if (nodoAux.getTarea().getFecha().isBefore(LocalDate.now()) && nodoAux.getTarea().getEstado().equals("INCOMPLETA")){
                        cadena = "(Vencida)" + descTarea;
                        // Para determinar vencimiento se compara con la fecha actual del sistema
                    }
                    return cadena;
                }
                nodoAux = nodoAux.getProximo();
                i++;
            }
        }
        return cadena;
    }

    public void modificarTarea(int idTarea, int opcion, String cambio){
        Nodo nodoAux = primero;
        Nodo nodoTarea = null;
        boolean salir = false;
        int i = 1;
        while ((nodoAux != null) && (!salir)){
            if (i == idTarea){
                nodoTarea = nodoAux;
                salir = true;
            }
            nodoAux = nodoAux.getProximo();
            i++;
        }
        if (opcion == 1){
            nodoTarea.getTarea().setDescripcion(cambio);
            return;
        }else if (opcion == 2){
            nodoTarea.getTarea().setPrioridad(Integer.parseInt(cambio));
            return;
        }else{
            nodoTarea.getTarea().setEstado(cambio);
            return;
        }

    }
    public String estadoTarea(int idTarea){
        Nodo nodoAux = primero;
        Nodo nodoTarea = null;
        boolean salir = false;
        String cadena = "";
        int i = 1;
        while ((nodoAux != null) && (!salir)){
            if (i == idTarea){
                nodoTarea = nodoAux;
                salir = true;
            }
            nodoAux = nodoAux.getProximo();
            i++;
        }
        cadena = nodoTarea.getTarea().getEstado();
        return cadena;
    }

    public String vencTarea(int idTarea){
        Nodo nodoAux = primero;
        Nodo nodoTarea = null;
        boolean salir = false;
        String cadena = "";
        int i = 1;
        while ((nodoAux != null) && (!salir)){
            if (i == idTarea){
                nodoTarea = nodoAux;
                salir = true;
            }
            nodoAux = nodoAux.getProximo();
            i++;
        }
        LocalDate fecha = nodoTarea.getTarea().getFecha();
        // Para determinar vencimiento se compara con la fecha actual del sistema
        if ((fecha.isBefore(LocalDate.now())) && (nodoTarea.getTarea().getEstado().equals("INCOMPLETA"))) {
            cadena = "La tarea esta VENCIDA";
        }else {
            cadena = "La tarea no se encuentra vencida";
        }
        return cadena;
    }

    public String mostrar() {
        String cadena = "";
        Nodo nodoAux = primero;
        if(nodoAux == null){
            cadena = "La lista no tiene tareas.";
        }else{
            int i = 1;
            String descTarea;
            int prioTarea;
            String estTarea;
            LocalDate fecTarea;
            LocalDate fecRecTarea;
            while (nodoAux != null){
                descTarea = nodoAux.getTarea().getDescripcion();
                prioTarea = nodoAux.getTarea().getPrioridad();
                estTarea = nodoAux.getTarea().getEstado();
                fecTarea = nodoAux.getTarea().getFecha();
                fecRecTarea = nodoAux.getTarea().getFechaRecordatorio();

                if (fecRecTarea.isAfter(LocalDate.now()) || fecRecTarea.isEqual(LocalDate.now())){
                    cadena += i + "- Por vencer - " + descTarea + "|Prioridad:" + prioTarea + "|Estado:" + estTarea + "|Fecha limite:" + fecTarea +  " \n";
                }else {
                    cadena += i + "- " + descTarea + "|Prioridad:" + prioTarea + "|Estado:" + estTarea + "|Fecha limite:" + fecTarea + " \n";
                }
                nodoAux = nodoAux.getProximo();
                i++;
            }
        }

        return cadena;
    }
}
