public class Inventatio {
    private String[] productos = {"pc", "laptop", "tablet", "celular", "impresora", "monitor", "teclado", "mouse", "bocinas", "audifonos"};
    private double[][] stockPrecios = {
        {10, 1000},
        {20, 2000},
        {30, 3000},
        {40, 4000},
        {50, 5000},
        {60, 6000},
        {70, 7000},
        {80, 8000},
        {90, 9000},
        {100, 10000}
    };

    public void mostrarInventario() { 
        System.out.println("Inventario de productos");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto: " + productos[i] + " Stock: " + stockPrecios[i][0] + " Precio: " + stockPrecios[i][1]);
        }
    }

    public int buscarProducto(String nombre) {
        for (int index = 0; index < productos.length; index++) {
            if (productos[index].equalsIgnoreCase(nombre)) {
                return index;
            }
        }
        return -1;
    }

    public boolean verificarStock(int indice, int cantidad) {
        return stockPrecios[indice][0] >= cantidad;
    }

    public void actualizarStock(int indice, int cantidad) {
        stockPrecios[indice][0] -= cantidad;
    }
}