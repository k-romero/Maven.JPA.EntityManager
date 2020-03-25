package services;


import entities.PokemonTrainerEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class PokemonTrainerService {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-Entity-Lab");
    private static EntityManager em = emf.createEntityManager();
    private EntityTransaction et = em.getTransaction();

    public PokemonTrainerEntity findPokemonTrainerById(Integer id){
        return em.find(PokemonTrainerEntity.class,id);
    }

    public void persistTrainer(PokemonTrainerEntity trainer){
        em.getTransaction().begin();
        em.persist(trainer);
        em.getTransaction().commit();

    }

    public void deleteTrainer(PokemonTrainerEntity trainer){
        em.getTransaction().begin();
        em.remove(trainer);
        em.getTransaction().commit();
    }

    public void updateTrainerAttack(PokemonTrainerEntity trainer,Integer newAttack){
        em.getTransaction().begin();
        trainer.setAttack(newAttack);
        em.getTransaction().commit();
    }

    public ArrayList<PokemonTrainerEntity> findAllTrainers(){
        ArrayList<PokemonTrainerEntity> result = new ArrayList<>();
        em.getTransaction().begin();
        result = (ArrayList<PokemonTrainerEntity>) em.createQuery("SELECT a FROM PokemonTrainerEntity a WHERE a.trainerId < 10 ",PokemonTrainerEntity.class).getResultList();
        return result;
    }


}

