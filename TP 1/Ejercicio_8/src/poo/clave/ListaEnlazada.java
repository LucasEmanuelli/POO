package poo.clave;

public class ListaEnlazada {
    private Nodo primero = null;

    public ListaEnlazada(int longitud){
        Clave contrasena;
        for (int i = 0; i < 10; i++){
            contrasena = new Clave(longitud);
            agregar(contrasena);
        }
    }
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
    public void agregar(Clave contrasena){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setClave(contrasena);

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

    public void eliminar(Clave contrasena) {
        Nodo nodoAux = primero;
        Nodo nodoAuxAnt = null;

        while (nodoAux != null) {
            if (nodoAux.getClave().equals(contrasena)) {
                if (nodoAuxAnt == null) {
                    primero = nodoAux.getProximo();
                } else {
                    nodoAuxAnt.setProximo(nodoAux.getProximo());
                }
            } else {
                nodoAuxAnt = nodoAux;
            }
            nodoAux = nodoAux.getProximo();
        }
    }

    public Clave recuperar(int posicion){
        Nodo nodoAux = primero;
        int posActual = 1;
        Clave datoRetorno = null;

        while (nodoAux != null){
            if(posActual == posicion){
                datoRetorno = nodoAux.getClave();
            }
            posActual++;
            nodoAux = nodoAux.getProximo();
        }
        return datoRetorno;
    }

    public void insertar(Clave contrasena, int posicion){
        Nodo nodoAux = primero;
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setClave(contrasena);
        if ((nodoAux == null) || (posicion > this.longitud())){
            this.agregar(contrasena);
            return;
        }
        int pos = 0;
        if (posicion == 1){
            nuevoNodo.setProximo(primero);
            primero = nuevoNodo;
        }else{
            while(nodoAux.getProximo() != null){
                if (pos + 1 == posicion - 1){
                    nuevoNodo.setProximo(nodoAux.getProximo());
                    nodoAux.setProximo(nuevoNodo);
                }
                nodoAux = nodoAux.getProximo();
                pos++;
            }
        }

    }

    public String mostrar() {
        String cadena = "";
        String cadenaAux = "";
        Nodo nodoAux = primero;
        if(nodoAux == null){
            cadena = "La lista esta vacia.";
        }else{
            while (nodoAux != null){
                if (nodoAux.getClave().esFuerte()){
                    cadenaAux = " - Fuerte";
                }else{
                    cadenaAux = " - Debil";
                }
                cadena += nodoAux.getClave().getClave() + cadenaAux +"\n";
                nodoAux = nodoAux.getProximo();
            }
        }

        return cadena;
    }
}


