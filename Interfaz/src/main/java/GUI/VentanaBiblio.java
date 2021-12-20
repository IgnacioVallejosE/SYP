package GUI;

import javax.swing.*;

public class VentanaBiblio extends JFrame{
    private JPanel panel1;

    public static void main(String[] args) {
        VentanaBiblio miVentanaB = new VentanaBiblio();
        miVentanaB.setContentPane(new VentanaBiblio().panel1);
        miVentanaB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentanaB.pack();
        miVentanaB.setVisible(true);
    }
}
