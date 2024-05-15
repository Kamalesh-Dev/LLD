package com.factory.factoryMethod;

public class NoSQL implements Database{
    @Override
    public Query getQuery() {
        return null;
    }

    @Override
    public int execute(Query query) {
        // make connection and execute the query
        return 1;
    }
}
