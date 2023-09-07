package poo.listadoble;

public class ListaDobleEnlace {
    private Nodo primero = null;

    public boolean vacia(){return (primero == null);
    }
    public int longitud(){
        int i = 0;
        Nodo nodoAux = primero;
        while(nodoAux != null){
            nodoAux = nodoAux.getProximo();
            i++;
        }
        return i;
    }
    public void agregar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);

        if (primero == null){
            primero = nuevoNodo;
            primero.setAnterior(null);
        }else{
            Nodo nodoAux = primero;
            while (nodoAux.getProximo() != null){
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nuevoNodo);
            nuevoNodo.setAnterior(nodoAux);
        }

    }

    public void eliminar(Object dato) {
        Nodo nodoActual = primero;
        while (nodoActual != null) {
            if (nodoActual.getDato().equals(dato)) {
                Nodo nodoAnterior = nodoActual.getAnterior();
                Nodo nodoSiguiente = nodoActual.getProximo();
                if (nodoAnterior != null) {
                    nodoAnterior.setProximo(nodoSiguiente);
                } else {
                    primero = nodoSiguiente;
                    if (nodoSiguiente != null) {
                        nodoSiguiente.setAnterior(null);
                    }
                }
                if (nodoSiguiente != null) {
                    nodoSiguiente.setAnterior(nodoAnterior);
                }
            }
            nodoActual = nodoActual.getProximo();
        }
    }

    public Object recuperar(int posicion){
        Nodo nodoAux = primero;
        int posActual = 1;
        Object datoRetorno = null;

        while (nodoAux != null){
            if(posActual == posicion){
                datoRetorno = nodoAux.getDato();
            }
            posActual++;
            nodoAux = nodoAux.getProximo();
        }
        return datoRetorno;
    }

    public void insertar(Object dato, int posicion){
        Nodo nodoAux = primero;
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if ((nodoAux == null) || (posicion > this.longitud())){
            this.agregar(dato);
            return;
        }
        int pos = 0;
        if (posicion == 1){
            nuevoNodo.setProximo(primero);
            primero.setAnterior(nuevoNodo);
            primero = nuevoNodo;
        }else{
            while(nodoAux.getProximo() != null){
                if (pos + 1 == posicion - 1){
                    nuevoNodo.setProximo(nodoAux.getProximo());
                    nuevoNodo.setAnterior(nodoAux);
                    nuevoNodo.getProximo().setAnterior(nuevoNodo);
                    nodoAux.setProximo(nuevoNodo);
                }
                nodoAux = nodoAux.getProximo();
                pos++;
            }
        }

    }

    public String mostrar() {
        String cadena = "";
        Nodo nodoAux = primero;
        if(nodoAux == null){
            cadena = "La lista esta vacia.";
        }else{
            while (nodoAux != null){
                cadena += nodoAux.getDato() + " ";
                nodoAux = nodoAux.getProximo();
            }
        }

        return cadena;
    }
}

