import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       Inventatio inventario = new Inventatio();
       ListaPedidos listaSimple = new ListaPedidos();
       ListaCircularPedidos listaCircular = new ListaCircularPedidos();
       ListaDoblePedidos listaDoble = new ListaDoblePedidos();
       System.out.println("Bienvenido a la tienda de tecnologia sitema de invetario");
       System.out.println("Productos disponibles");
       inventario.mostrarInventario(); 
       while (true) { 
           System.out.println("1. Agregar pedido");
           System.out.println("2. Mostrar pedidos simple");
           System.out.println("3. Mostrar pedidos circular");
           System.out.println("4. Mostrar pedidos doble (adelante)");
           System.out.println("5. Mostrar pedidos doble (atras)");
           System.out.println("6. Salir");
           System.out.println("Seleccione una opcion");
           int opcion = sc.nextInt();
           sc.nextLine();
           if(opcion==6){
               System.out.println("saliendo del sistema");
               break;
           }
           switch (opcion) {
               case 1:
                   System.out.println("Ingrese el nombre del producto:");
                   String producto = sc.nextLine().trim(); // Elimina espacios adicionales
                   System.out.println("Ingrese la cantidad:");
                   int cant = sc.nextInt();
                   sc.nextLine(); 

                   int indiceProducto = inventario.buscarProducto(producto);
                   if (indiceProducto == -1) {
                       System.out.println("Producto no encontrado. Los productos disponibles son:");
                       inventario.mostrarInventario(); 
                       continue;
                   }
                   if (!inventario.verificarStock(indiceProducto, cant)) {
                       System.out.println("No hay suficiente stock.");
                       continue;
                   }
                   inventario.actualizarStock(indiceProducto, cant);
                   System.out.println("Seleccione la lista donde desea agregar el pedido:");
                   System.out.println("1. Lista simple");
                   System.out.println("2. Lista circular");
                   System.out.println("3. Lista doble");
                   int listaSeleccionada = sc.nextInt();
                   sc.nextLine();

                   switch (listaSeleccionada) {
                       case 1:
                           listaSimple.agregarPedido(producto, cant, null, null);
                           break;
                       case 2:
                           listaCircular.agregarPedido(producto, cant, null, null);
                           break;
                       case 3:
                           listaDoble.agregarPedido(producto, cant, null, null);
                           break;
                       default:
                           System.out.println("Opción no válida.");
                           continue;
                   }

  
                   System.out.println("Gracias por tu compra. Tu pedido ha sido agregado correctamente.");
                   break;
               case 2:
                   listaSimple.mostrarPedidos();
                   break;
               case 3:
                   listaCircular.mostrarPedidosCirculares();
                   break;
               case 4:
                   listaDoble.mostrarPedidosAdelante();
                   break;
               case 5:
                   listaDoble.mostrarPedidosAtras();
                   break;
               default:
                   System.out.println("Opcion no valida");
                   break;
           }
       }
    }
}
