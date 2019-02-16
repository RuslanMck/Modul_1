package com.Ruslan.ALevel;

import com.Ruslan.ALevel.client.ClientCreator;

public class Main {

    public static void main(String[] args) {

        ClientCreator clientCreator = new ClientCreator();

        clientCreator.createClients(10);

    }
}
