/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.client.unapec;

import java.util.Scanner;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author DELL
 */
public class ApplicationGetOne {

    private static final String URL_BASE = "http://localhost:8010/api/fundapec/estudiantes";

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el estudiante: ");
            String idEstudiante = sc.next();

            Client client = Client.create();

            WebResource webResource = client
                    .resource(URL_BASE + "/" + idEstudiante);

            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);

            System.out.println("Estudiante Recuperado... \n");
            System.out.println(output);

        } catch (RuntimeException e) {
            e.printStackTrace(System.out);
        }
    }
}
