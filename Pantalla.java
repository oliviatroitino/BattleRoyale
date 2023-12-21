import javax.swing.*;
import java.awt.*;

public class Pantalla extends JFrame {
    private static final int FRAME_WIDTH = 1200;
    private static final int FRAME_HEIGHT = 800;
    private static final int FRAME_X_ORIGIN = 200;
    private static final int FRAME_Y_ORIGIN = 100;

    public Pantalla(String nombre) {

        setTitle(nombre);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        getContentPane().setBackground(Color.LIGHT_GRAY);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}