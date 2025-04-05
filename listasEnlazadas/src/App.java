public class App {
    public static void main(String[] args) throws Exception {
        listaEnlazada lista = new listaEnlazada();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);
        lista.insertar(50);
        lista.insertar(60);
        lista.mostrar();
    }
}
