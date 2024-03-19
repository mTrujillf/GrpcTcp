package org.example.grpc;

import org.example.ConnectionKotlin;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: drones.proto")
public final class ManejoDroneGrpc {
  private ManejoDroneGrpc() {}

  public static final String SERVICE_NAME = "ManejoDrone";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.grpc.Drones.Velocidades,
      org.example.grpc.Drones.Status> getMandaVelocidadesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "mandaVelocidades",
      requestType = org.example.grpc.Drones.Velocidades.class,
      responseType = org.example.grpc.Drones.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.Drones.Velocidades,
      org.example.grpc.Drones.Status> getMandaVelocidadesMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.Drones.Velocidades, org.example.grpc.Drones.Status> getMandaVelocidadesMethod;
    if ((getMandaVelocidadesMethod = ManejoDroneGrpc.getMandaVelocidadesMethod) == null) {
      synchronized (ManejoDroneGrpc.class) {
        if ((getMandaVelocidadesMethod = ManejoDroneGrpc.getMandaVelocidadesMethod) == null) {
          ManejoDroneGrpc.getMandaVelocidadesMethod = getMandaVelocidadesMethod = 
              io.grpc.MethodDescriptor.<org.example.grpc.Drones.Velocidades, org.example.grpc.Drones.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ManejoDrone", "mandaVelocidades"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Drones.Velocidades.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Drones.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new ManejoDroneMethodDescriptorSupplier("mandaVelocidades"))
                  .build();
          }
        }
     }
     return getMandaVelocidadesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManejoDroneStub newStub(io.grpc.Channel channel) {
    return new ManejoDroneStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManejoDroneBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ManejoDroneBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManejoDroneFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ManejoDroneFutureStub(channel);
  }

  /**
   */
  public static abstract class ManejoDroneImplBase implements io.grpc.BindableService {

    /**
     */
    public void mandaVelocidades(org.example.grpc.Drones.Velocidades request,
        io.grpc.stub.StreamObserver<org.example.grpc.Drones.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getMandaVelocidadesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMandaVelocidadesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.Drones.Velocidades,
                org.example.grpc.Drones.Status>(
                  this, METHODID_MANDA_VELOCIDADES)))
          .build();
    }
  }

  /**
   */
  public static final class ManejoDroneStub extends io.grpc.stub.AbstractStub<ManejoDroneStub> {
    private ManejoDroneStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManejoDroneStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManejoDroneStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManejoDroneStub(channel, callOptions);
    }

    /**
     */
    public void mandaVelocidades(org.example.grpc.Drones.Velocidades request,
        io.grpc.stub.StreamObserver<org.example.grpc.Drones.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMandaVelocidadesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ManejoDroneBlockingStub extends io.grpc.stub.AbstractStub<ManejoDroneBlockingStub> {
    private ManejoDroneBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManejoDroneBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManejoDroneBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManejoDroneBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.grpc.Drones.Status mandaVelocidades(org.example.grpc.Drones.Velocidades request) {
      return blockingUnaryCall(
          getChannel(), getMandaVelocidadesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ManejoDroneFutureStub extends io.grpc.stub.AbstractStub<ManejoDroneFutureStub> {
    private ManejoDroneFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManejoDroneFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManejoDroneFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManejoDroneFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.Drones.Status> mandaVelocidades(
        org.example.grpc.Drones.Velocidades request) {
      return futureUnaryCall(
          getChannel().newCall(getMandaVelocidadesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MANDA_VELOCIDADES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ManejoDroneImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ManejoDroneImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MANDA_VELOCIDADES:
          serviceImpl.mandaVelocidades((org.example.grpc.Drones.Velocidades) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.Drones.Status>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ManejoDroneBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManejoDroneBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.grpc.Drones.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ManejoDrone");
    }
  }

  private static final class ManejoDroneFileDescriptorSupplier
      extends ManejoDroneBaseDescriptorSupplier {
    ManejoDroneFileDescriptorSupplier() {}
  }

  private static final class ManejoDroneMethodDescriptorSupplier
      extends ManejoDroneBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ManejoDroneMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ManejoDroneGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManejoDroneFileDescriptorSupplier())
              .addMethod(getMandaVelocidadesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
