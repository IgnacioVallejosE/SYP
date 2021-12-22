package Launcher;

import ContenidoExterno.MySQL;
import Estructura.CsvManager;
import Estructura.Planta;
import GUI.VentanaPrincipal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Launcher {

    public static void main(String[] args) {
        //MySQL m = new MySQL();
        //String data = m.MyGETRequest(0);
        //System.out.println(data);
        //System.out.println(CsvManager.readFileToContacts(new File("/Users/Asus/Desktop/cosas de progra/SYP/Interfaz/planta.csv")));
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        //System.out.println(CsvManager.readFileToContacts(new File("/Users/Asus/Desktop/cosas de progra/SYP/Interfaz/planta.csv")));
    }
}
