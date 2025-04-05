public class ListaCircularPedidos {
private Pedido ultimo;

public void agregarPedido(String producto, int cantidad, Pedido siguiente , Pedido anterior) {
    Pedido nuevo = new Pedido(producto, cantidad, siguiente, anterior );
    if (ultimo == null) {
       ultimo = nuevo;
        ultimo.siguiente = ultimo;
    } else {
        nuevo.siguiente = ultimo.siguiente;
        ultimo.siguiente = nuevo;
        ultimo = nuevo;
        }
        
        
    }

public void mostrarPedidosCirculares() {
    if (ultimo == null) { 
        System.out.println("La lista circular está vacía.");
        return;
    }

    Pedido actual = ultimo.siguiente;
    do {
        System.out.println("Producto: " + actual.producto + ", Cantidad: " + actual.cantidad);
        actual = actual.siguiente;
    } while (actual != ultimo.siguiente); 
}
}

