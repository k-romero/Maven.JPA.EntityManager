package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokemonService {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-Entity-Lab");
    private static EntityManager em = emf.createEntityManager();
    private EntityTransaction et = em.getTransaction();

}
