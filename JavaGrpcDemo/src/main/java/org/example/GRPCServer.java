package org.example;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import clases.ManejoDrone;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
//import org.example.ConnectionKotlin;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class GRPCServer {


    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket s = null;

        System.out.println("Empezando Server......");
        int serverPort = 49152;
        s = new ServerSocket(serverPort);

        System.out.println("Aqui");
        Socket clientSocket = s.accept();  // Listens for a connection to be made to this socket and accepts it. The method blocks until a connection is made.
        //ConnectionKotlin c = new ConnectionKotlin(clientSocket);
        System.out.println("Conexion kotlin");
        SocketAddress address = new InetSocketAddress("localhost",50052);
        Server server = NettyServerBuilder.forAddress(address).addService(new ManejoDrone(clientSocket)).build();
        //Server server = ServerBuilder.forPort(50052).addService(new ManejoDrone()).build();



        System.out.println("Server starting in 50052 .......");
        server.start();

        server.awaitTermination();

    }
}