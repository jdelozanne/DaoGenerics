/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericdao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author julia
 * @param <T>
 *
 */
public abstract class AbstractDaoGenerics<T> implements InterfaceDaoGenerics<T> {

    private Class<T> entityClass;

    public AbstractDaoGenerics() {
        this.entityClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public AbstractDaoGenerics(Class<T> type) {
        this.entityClass = type;
    }

    EntityManagerFactory entityfactory = Persistence.createEntityManagerFactory("hibertest");
    EntityManager em = entityfactory.createEntityManager();

    @Override
    public void delete(T domain) {
        domain = this.em.merge(domain);
        this.em.remove(domain);
    }

    @Override
    public void save(T domain) {
        em.getTransaction().begin();
        em.persist(domain);
        em.getTransaction().commit();
        em.close();

    }

}
