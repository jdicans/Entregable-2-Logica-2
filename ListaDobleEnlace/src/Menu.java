import java.util.Scanner;

public class Menu {
    private ListasDoble lista;
    private Scanner scanner;

    public Menu() {
        lista = new ListasDoble();
        scanner = new Scanner(System.in);
    }

    public void MostrarMenu() {
        int opcion, valor;
        do {
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar primero");
            System.out.println("4. Eliminar ultimo");
            System.out.println("5. Imprimir lista");
            System.out.println("6. Mostrar lista inversa");
            System.out.println("7. Salir");
            System.out.println("Ingrese una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor a insertar");
                    valor = scanner.nextInt();
                    lista.insertarAlInicio(valor);
                    break;
                case 2:
                    System.out.println("Ingrese el valor a insertar");
                    valor = scanner.nextInt();
                    lista.insertarAlFinal(valor);
                    break;
                case 3:
                    lista.eliminarPrimero();
                    break;
                case 4:
                    lista.eliminarUltimo();
                    break;
                case 5:
                    lista.imprimirLista();
                    break;
                case 6:
                    lista.mostrarListaInversa();
                    break;
                case 7:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 7);
        scanner.close();
    }
}
