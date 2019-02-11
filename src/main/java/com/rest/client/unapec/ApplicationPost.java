/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.client.unapec;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ApplicationPost {

    private static final String URL_BASE = "http://localhost:8010/api/fundapec/estudiantes";

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese cedula: ");
            String cedula = sc.next();

            System.out.println("Ingrese matricula: ");
            String matricula = sc.next();

            System.out.println("Ingrese carrera abrev: ");
            String carrera = sc.next();

            System.out.println("Ingrese creditos total: ");
            int creditosTotal = sc.nextInt();

            System.out.println("Ingrese creditos cursados: ");
            int creditosCursados = sc.nextInt();

//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//            LocalDateTime now = LocalDateTime.now();
//            String fecha = dtf.format(now);
            Client client = Client.create();

            WebResource webResource = client
                    .resource(URL_BASE);

            String input = "{\"cedula_estudiante\":\"" + cedula + "\","
                    + "\"matricula_estudiante\":\"" + matricula + "\","
                    + "\"carrera_abrev\":\"" + carrera + "\","
                    + "\"creditos_total\":\"" + creditosTotal + "\","
                    + "\"creditos_cursados\":\"" + creditosCursados + "\"}";

            ClientResponse response = webResource.type("application/json")
                    .post(ClientResponse.class, input);

            if (response.getStatus() != 201) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            System.out.println("Estudiante Insertado .... \n");
            String output = response.getEntity(String.class);
            System.out.println(output);

        } catch (RuntimeException e) {
            e.printStackTrace(System.out);
        }
    }
}
