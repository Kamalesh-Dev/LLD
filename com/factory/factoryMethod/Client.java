package com.factory.factoryMethod;

public class Client {

    public static void main(String[] args) {

        Database database = new MySQL();

        Query query = database.getQuery();



    }
}
