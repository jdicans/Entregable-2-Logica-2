public class ListaDoblePedidos {
    private Pedido inicio;
    private Pedido fin;

    public void agregarPedido(String producto, int cantidad, Pedido siguiente, Pedido anterior) {
        Pedido nuevo = new Pedido(producto, cantidad, null, null);

        if (inicio == null) {
            inicio = fin = nuevo; 
            fin.siguiente = nuevo; 
            nuevo.anterior = fin; 
            fin = nuevo; 
        }
    }

    public void mostrarPedidosAdelante() {
        if (inicio == null) {
            System.out.println("La lista doble está vacía.");
            return;
        }

        Pedido actual = inicio;
        System.out.println("Pedidos en la lista doble (adelante):");
        while (actual != null) {
            System.out.println("Producto: " + actual.producto + ", Cantidad: " + actual.cantidad);
            actual = actual.siguiente; 
        }
    }

    public void mostrarPedidosAtras() {
        if (fin == null) {
            System.out.println("La lista doble está vacía.");
            return;
        }

        Pedido actual = fin;
        System.out.println("Pedidos en la lista doble (atrás):");
        while (actual != null) {
            System.out.println("Producto: " + actual.producto + ", Cantidad: " + actual.cantidad);
            actual = actual.anterior; 
        }
    }
}


