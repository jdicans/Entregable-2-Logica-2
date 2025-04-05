public class listaEnlazada {
    private Nodo cabeza; //Este es el primer nodo

    public listaEnlazada(){
        this.cabeza = null;
    }

    //Metodo para insertar (Garudar datos dentro del nodo)
    public void insertar(int dato){
        Nodo nuevo = new Nodo(dato);

        //Llamar if-else para saber si la cabeza está vacía o tiene valor
        //La cabeza es el primer nodo y hay que validar si hay un dato
        if (cabeza == null){
            cabeza = nuevo;
        } else {
            //Le decimos a nodo que de manera temporal almacene info
            Nodo temp = cabeza;
            while (temp.siguiente != null){
                temp = temp.siguiente;
            }
        }
    }
    //Eliminar un nodo
    public void eliminar(int dato){
        if (cabeza == null) return;

        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo temp = cabeza;
        while (temp.siguiente != null && temp.siguiente.dato != dato){
            temp = temp.siguiente;
        }
        if (temp.siguiente != null){
            temp.siguiente = temp.siguiente.siguiente;
        }
    }

    //Mostrar y recorrer la lista
    public void mostrar(){
        Nodo temp = cabeza;
        while (temp != null){
            System.out.println(temp.dato + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
}
