package poo.cola;

public class Cola {
    private Nodo frente = null;
    private Nodo ultimo = null;

    public boolean vacia(){
        return (this.frente == null);
    }

    public void encolar(Object dato){
        Nodo nodoAux = new Nodo();
        nodoAux.setDato(dato);
        if (this.frente == null){
            this.frente = nodoAux;
            this.ultimo = nodoAux;
        }else{
            this.ultimo.setProximo(nodoAux);
            this.ultimo = nodoAux;
        }
        return;
    }

    public void desencolar(){
        if (this.frente != null){
            this.frente = this.frente.getProximo();
        }

        return;
    }

    public Object recuperar(){
        return (this.frente.getDato());
    }


}
