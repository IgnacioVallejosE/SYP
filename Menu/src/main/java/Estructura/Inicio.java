package Estructura;

import java.util.Scanner;

public class Inicio {

    public void menu(){
        //primer vistaso a posible menú de plantas
        Scanner tec = new Scanner(System.in);
        System.out.println("elija 1\n 1)quién sos\n 2)no sos\n 3)xd si sos");
        int eleccion = tec.nextInt();
        switch (eleccion){
            case 1:
                System.out.println("trolleado");
                break;
            case 2:
                System.out.println("trollea2");
                break;
            case 3:
                System.out.println("jjaja si sos");
                break;
        }
    }
}
