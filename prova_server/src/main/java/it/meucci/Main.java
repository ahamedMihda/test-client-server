package it.meucci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        ServerSocket b = new ServerSocket(3000);
        Socket mioSocket = b.accept();

        
        BufferedReader in = new BufferedReader(new InputStreamReader(mioSocket.getInputStream()));
        PrintWriter out = new PrintWriter(mioSocket.getOutputStream(), true);
        

    }
}