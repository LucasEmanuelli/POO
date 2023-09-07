package poo.clave;

public class Nodo{
    private Clave contrasena;
    private Nodo proximo = null;

    public void setClave(Clave contrasena){
        this.contrasena = contrasena;
    }
    public Clave getClave() {
        return contrasena;
    }
    public void setProximo(Nodo nodo){
        this.proximo = nodo;
    }
    public Nodo getProximo(){
        return proximo;
    }
}