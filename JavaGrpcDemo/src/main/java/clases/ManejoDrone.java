package clases;

import io.grpc.stub.StreamObserver;
import org.example.ConnectionKotlin;
import org.example.grpc.Drones;
import org.example.grpc.ManejoDroneGrpc;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ManejoDrone extends ManejoDroneGrpc.ManejoDroneImplBase {

    private Socket c;
    private DataInputStream in;
    private DataOutputStream out;
    public ManejoDrone(Socket c) {
        super();
        this.c = c;
        try {

            in = new DataInputStream(c.getInputStream());
            out = new DataOutputStream(c.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void mandaVelocidades(Drones.Velocidades request, StreamObserver<Drones.Status> responseObserver)  {
        String data;

        int u = request.getU();
        int v = request.getU();
        int w = request.getW();
        int r = request.getR();

        String strU = u + "";
        String strV = v + "";
        String strW = w + "";
        String strR = r + "";

        try {
            out.writeUTF(strU);
            out.writeUTF(strV);
            out.writeUTF(strW);
            out.writeUTF(strR);
            System.out.println("Esperando respuesta");
            data = in.readUTF();
            System.out.println(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //System.out.println("U: " + u + " V: " + v + " W: " + w + " R: "+ r);


        Drones.Status.Builder response = Drones.Status.newBuilder();

        response.setSucess(true);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

}
