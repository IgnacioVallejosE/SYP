package GUI;

import javax.swing.*;

public class VentanaPreguntas extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public static void main(String[] args) {
        VentanaPreguntas miVentanaP = new VentanaPreguntas();
        miVentanaP.setContentPane(new VentanaPreguntas().panel1);
        miVentanaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentanaP.pack();
        miVentanaP.setVisible(true);
    }
}
