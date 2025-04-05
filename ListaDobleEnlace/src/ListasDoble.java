
public class ListasDoble {
    private Nodo  head;

    public void insertarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if(head != null){
            nuevoNodo.next = head;
            head.prev = nuevoNodo;
        }
        head = nuevoNodo;
    }
    public void insertarAlFinal(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(head == null){
            head = nuevoNodo;
            return;
        }
        Nodo temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = nuevoNodo;
        nuevoNodo.prev = temp;
    }
//metodo para eliminar primero
    public void eliminarPrimero(){
        if(head == null){
            System.out.println("Lista vacia");
            return;
        }
        head = head.next;
        if(head != null){
            head.prev = null;
        }
    }
//metodo para eliminar ultimo
    public void eliminarUltimo(){
        if(head == null){
            System.out.println("Lista vacia");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Nodo temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
    }
//metodo para imprimir lista
    public void imprimirLista(){
        if(head == null){
            System.out.println("Lista vacia");
            return;
        }
        Nodo temp = head;
        System.out.print("lista en orden: ");
        while(temp != null){
            System.out.print(temp.dato + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
//metodo para imprimir lista en inversa
    public void mostrarListaInversa(){
        if (head == null){
            System.out.println("Lista vacia");
            return;
        }
        Nodo temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        System.out.println("Lista en orden inverso: ");
        while(temp != null){
            System.out.print(temp.dato + "<->");
            temp = temp.prev;
        }
        System.out.println("null");
    }

}

