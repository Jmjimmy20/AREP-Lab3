package edu.escuelaing.arep.calentamiento;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(final String[] args) {
        Scanner scant = new Scanner(System.in); // activa pare leer
        System.out.println("Ingrese la URL pafavar:");
        String datos = scant.nextLine(); // guardo el dato en el string datos
        try {

            URL pag = new URL(datos);
            BufferedReader br = new BufferedReader(new InputStreamReader(pag.openStream()));
            String in = null;
            FileOutputStream pagHtml = new FileOutputStream("res.html");
            while ((in = br.readLine()) != null) {
                pagHtml.write((in.getBytes()));
            }
            pagHtml.flush();
            pagHtml.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}