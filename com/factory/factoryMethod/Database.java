package com.factory.factoryMethod;

public interface Database {

    public abstract Query getQuery();
    public abstract int execute(Query query);

}
