package edu.escuelaing.arep.calentamiento;

import java.net.*;
import java.io.*;
import java.lang.Math;

public class Servidor {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }

        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String inputLine, outputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println("Valor:" + inputLine);
            double cua = Math.pow(Double.parseDouble(inputLine),2);
            outputLine = "El resultado cuadrado de " + inputLine + "es: " + cua;
            out.println(outputLine);
            if (outputLine.equals("Respuestas: Bye."))
                break;
        }

        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
}