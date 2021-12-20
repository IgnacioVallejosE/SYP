package Estructura;

import java.util.Scanner;

public class Menu {

    public void menu(){
        int largo = 25;
        //primer vistaso a posible menú de plantas
        Scanner tec = new Scanner(System.in);
        Stock stocks = new Stock(largo);
        //Plantas p1 = new Plantas("Rosa", "tipo a", "esto pincha", 26485);
        //Plantas p2 = new Plantas("Cerezo", "tipo b", "ta lindo", 34857);
        //stocks.push(p1);
        //stocks.push(p2);
        System.out.println("1 insertar plantas");
        System.out.println("2 revisar plantas");
        System.out.println("4 revisar planta especifica");
        System.out.println("3 modificar plantas");
        System.out.println("obteniendo data.....");

        switch (tec.nextInt()){
            case 1:
                System.out.println("case1");
                break;
            case 2:
                System.out.println("case 2, revisar plantas guardadas");
                stocks.show();
                break;
            default:
                break;
        }
    }
}
