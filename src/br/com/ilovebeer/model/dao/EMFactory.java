package br.com.ilovebeer.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFactory {

    private static EMFactory instance;
    private final EntityManagerFactory factory;

    private EMFactory() {
        this.factory = Persistence.createEntityManagerFactory("ilovebeer");
    }

    public static EMFactory getInstance() {
        if (EMFactory.instance == null) {
            EMFactory.instance = new EMFactory();
        }
        return EMFactory.instance;
    }

    public EntityManagerFactory getFactory() {
        return this.factory;
    }

    public EntityManager createManager() {
        return this.factory.createEntityManager();
    }
}
