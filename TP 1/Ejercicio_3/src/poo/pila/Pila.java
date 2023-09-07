package poo.pila;

public class Pila {
    private Nodo tope = null;

    public boolean vacia(){
        return (this.tope == null);
    }

    public Object recuperar(){
        return this.tope.getDato();
    }

    public void apilar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if (this.tope == null){
            this.tope = nuevoNodo;

        }else{
            nuevoNodo.setProximo(this.tope);
            this.tope = nuevoNodo;
        }
        return;
    }

    public void desapilar() {
        if (tope != null) {
            this.tope = this.tope.getProximo();
        }
        return;
    }

}
