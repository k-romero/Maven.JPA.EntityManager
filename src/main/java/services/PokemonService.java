package services;

import entities.PokemonEntity;
import entities.PokemonTrainerEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class PokemonService {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-Entity-Lab");
    private static EntityManager em = emf.createEntityManager();
    private EntityTransaction et = em.getTransaction();

    public ArrayList<PokemonEntity> findAllTrainers(){
        ArrayList<PokemonEntity> result = new ArrayList<>();
        em.getTransaction().begin();
        result = (ArrayList<PokemonEntity>) em.createQuery("SELECT a FROM PokemonEntity a WHERE a.secondary_type IS NOT NULL",PokemonEntity.class).getResultList();
        return result;
    }
}
