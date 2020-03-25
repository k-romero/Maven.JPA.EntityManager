package services;

import entities.PokemonTrainerEntity;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class PokemonTrainerEntityTest {
    PokemonTrainerService pService;
    PokemonTrainerEntity pkTrainer;

    @Before
    public void setup(){
        pService  = new PokemonTrainerService();
        pkTrainer  = pService.findPokemonTrainerById(0);
    }

    @Test
    public void persistPkTrainerTest(){
    PokemonTrainerEntity kevin = new PokemonTrainerEntity(12000,100,100,100,100,100,100,100,100,100);
    pService.persistTrainer(kevin);
    }


    @Test
    public void deletePkTrainerTest(){
        PokemonTrainerEntity kevin = new PokemonTrainerEntity(13000,100,100,100,100,100,100,100,100,100);
        pService.persistTrainer(kevin);
        pService.deleteTrainer(pService.findPokemonTrainerById(13000));
    }

    @Test
    public void updatePkTrainerTest(){
        PokemonTrainerEntity kevin = new PokemonTrainerEntity(13000,100,100,100,100,100,100,100,100,100);
        pService.persistTrainer(kevin);
        pService.updateTrainerAttack(pService.findPokemonTrainerById(13000),500);
    }

    @Test
    public void findAllPkTrainerTest(){
        ArrayList<PokemonTrainerEntity> test = pService.findAllTrainers();
        assertEquals(20,test.size());
        for (PokemonTrainerEntity p : test) {
            System.out.println(p.toString());
        }
    }


}
