package poo.listadoble;


public class Nodo {
    private Object dato;
    private Nodo proximo = null;
    private Nodo anterior = null;

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public void setDato(Object dato){
        this.dato = dato;
    }
    public Object getDato() {
        return dato;
    }
    public void setProximo(Nodo nodo){
        this.proximo = nodo;
    }
    public Nodo getProximo(){
        return proximo;
    }
}
