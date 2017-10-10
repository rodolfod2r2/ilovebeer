package br.com.ilovebeer.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public abstract class AbstractDAO<E> {

    EntityManager entityManager;

    public void salvarDados(E e) {

        entityManager = EMFactory.getInstance().createManager();

        try {

            entityManager.getTransaction().begin();
            entityManager.persist(e);
            entityManager.getTransaction().commit();

        } catch (Exception error) {

            entityManager.getTransaction().rollback();

        } finally {

            entityManager.close();
        }
    }

    public void atualizarDados(E e) {
        entityManager = EMFactory.getInstance().createManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(e);
            entityManager.getTransaction().commit();
        } catch (Exception error) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }

    public void removerDados(E e, int id) {
        entityManager = EMFactory.getInstance().createManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(e);
            entityManager.getTransaction().commit();
        } catch (Exception error) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }

    public List exibirDados(E e) {

        entityManager = EMFactory.getInstance().createManager();
        Query query = entityManager.createQuery("SELECT u FROM " + e.getClass().getSimpleName() + " u", e.getClass());
        return query.getResultList();

    }


}