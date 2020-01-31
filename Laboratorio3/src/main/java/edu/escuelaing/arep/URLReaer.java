package edu.escuelaing.arep;

import java.io.*;
import java.net.*;

public class URLReaer {

    public static void main(final String[] args) {
        try {
            URL google = new URL("http://www.google.com/");

            System.out.println("Protocol: " + google.getProtocol());
            System.out.println("Authority: " + google.getAuthority());
            System.out.println("Host: " + google.getHost());
            System.out.println("Port: " + google.getPort());
            System.out.println("Path: " + google.getPath());
            System.out.println("Query: " + google.getQuery());
            System.out.println("File: " + google.getFile());
            System.out.println("Ref: " + google.getRef());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}