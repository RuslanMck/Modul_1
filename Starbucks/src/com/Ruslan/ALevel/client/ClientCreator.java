package com.Ruslan.ALevel.client;

import com.Ruslan.ALevel.client.clientFactory.ClientFactory;

public class ClientCreator {

    ClientFactory clientFactory = new ClientFactory();

    public Client[] createClients(int a) {

        Client[] clients = new Client[a];

        for (int i = 0; i < clients.length; i++) {
            clients[i] = clientFactory.createClient();
        }

        return clients;
    }
}
