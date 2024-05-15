package com.factory.factoryMethod;

public class MySQL implements Database{
    @Override
    public Query getQuery() {
        return new MySQLQuery();
    }

    @Override
    public int execute(Query query) {

        // Make connection and execute the given query object
        return 1;

    }
}
