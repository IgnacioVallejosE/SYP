package GUI;

import javax.swing.*;

public class VentanaRespuesta extends JFrame{
    private JPanel panel1;
    private JButton posibleEnfermedadButton;

    public static void main(String[] args) {
        VentanaRespuesta miVentanaR = new VentanaRespuesta();
        miVentanaR.setContentPane(new VentanaRespuesta().panel1);
        miVentanaR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentanaR.pack();
        miVentanaR.setVisible(true);
    }
}
