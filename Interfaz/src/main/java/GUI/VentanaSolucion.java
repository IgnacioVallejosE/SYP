package GUI;

import javax.swing.*;

public class VentanaSolucion extends JFrame{
    private JPanel panel1;

    public static void main(String[] args) {
        VentanaSolucion miVentanaS = new VentanaSolucion();
        miVentanaS.setContentPane(new VentanaSolucion().panel1);
        miVentanaS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentanaS.pack();
        miVentanaS.setVisible(true);
    }
}
