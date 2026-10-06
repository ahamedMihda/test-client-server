package it.meucci;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        ServerSocket b = new ServerSocket(3000);
        Socket s = b.accept();
    }
}