package com.rest.client.unapec;

import java.util.Scanner;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author DELL
 */
public class ApplicationGet {

    //Variables que usaremos 
    private static final String URL_BASE = "http://localhost:8010/api/fundapec/estudiantes";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {

            Client client = Client.create();

            WebResource webResource = client
                    .resource(URL_BASE);

            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);

            System.out.println("Output from Server .... \n");
            System.out.println(output);

        } catch (RuntimeException e) {
            e.printStackTrace(System.out);
        }
    }
}
