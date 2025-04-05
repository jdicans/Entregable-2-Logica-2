public class ListaPedidos {

    private Pedido cabeza;  

    public void agregarPedido(String producto, int cantidad, Pedido siguiente, Pedido anterior) {
        Pedido nuevo = new Pedido(producto, cantidad, siguiente, anterior);  

        if (cabeza == null) {
            cabeza = nuevo; 
            Pedido temp = cabeza;
            while (temp.siguiente != null) {  
                temp = temp.siguiente; 
            }
            temp.siguiente = nuevo; 
        }
    }

    public void mostrarPedidos() {
        if (cabeza == null) {
            System.out.println("La lista de pedidos está vacía.");
            return;
        }

        Pedido temp = cabeza;
        while (temp != null) {
            System.out.println("Pedido: " + temp.producto + " Cantidad: " + temp.cantidad);
            temp = temp.siguiente;
        }
    }
}
