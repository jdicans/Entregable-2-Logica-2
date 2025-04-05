import javax.swing.*;
import java.awt.*;

public class App extends JPanel{

    private ListaCircular lista;
    private Nodo actual;
    private Timer timer;

    public App(){
        lista = new ListaCircular();
        generarTrayectoriaCircular(200,200,100,30);
        actual = lista.getCabeza();

        timer = new Timer(100, e -> {
            actual = actual.siguiente;
            repaint();
        });
        timer.start();
    }

    public void generarTrayectoriaCircular(int centroX, int centroY, int radio, int puntos){
        double anguloIncremento = 2 * Math.PI / puntos;
        for (int i = 0; i < puntos; i++) {
            int x = (int) (centroX + radio * Math.cos(i * anguloIncremento));
            int y = (int) (centroY + radio * Math.sin(i * anguloIncremento));
            lista.insertar(x, y);
        }
    }

    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        Nodo temp = lista.getCabeza();
        do {
            g.fillOval(temp.x, temp.y, 5, 5);
            temp = temp.siguiente;
        } while (temp != lista.getCabeza());
        g.setColor(Color.BLUE);
        g.fillOval(actual.x, actual.y, 10, 10);
    }

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Trayectoria Circular");
        App panel = new App();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
