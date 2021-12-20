package GUI;

import javax.swing.*;

public class VentanaPrincipal extends JFrame{
    private JPanel panel1;
    private JButton respondeTusDudasAquíButton;
    private JButton bibliografíaButton;



    public static void main(String[] args) {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        miVentana.setContentPane(new VentanaPrincipal().panel1);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.pack();
        miVentana.setVisible(true);
    }
}
