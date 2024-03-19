package org.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ConnectionKotlin {
    private DataInputStream in;
    private DataOutputStream out;
    private Socket clientSocket;
    public ConnectionKotlin(Socket aClientSocket) {
        try {
            clientSocket = aClientSocket;
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());
            System.out.println("Se creo el server");
        } catch (IOException e) {
            System.out.println("Connection:" + e.getMessage());
        }
    }

    public void out(String mensaje) {
        try {
            out.writeUTF(mensaje);
            //System.out.println("Se mando el mensaje");
            String data = in.readUTF();
            System.out.println(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
