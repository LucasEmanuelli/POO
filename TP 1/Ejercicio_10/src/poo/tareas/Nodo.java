package poo.tareas;

public class Nodo {
    private Tarea tarea;
    private Nodo proximo = null;
    public void setTarea(Tarea tarea){
        this.tarea = tarea;
    }
    public Tarea getTarea() {
        return tarea;
    }
    public void setProximo(Nodo nodo){
        this.proximo = nodo;
    }
    public Nodo getProximo(){
        return proximo;
    }
}
