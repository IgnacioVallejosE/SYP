package Launcher;

import ContenidoExterno.MySQL;

import java.io.IOException;

public class Launcher {
    public static void main(String[] args) throws IOException {
        MySQL m = new MySQL();
        String data = m.MyGETRequest(0);
        System.out.println(data);
    }
}
