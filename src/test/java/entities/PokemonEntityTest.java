package entities;

import org.junit.Test;
import services.PokemonService;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PokemonEntityTest {
    @Test
    public void findAllPkTrainerTest(){
        PokemonService pService = new PokemonService();
        ArrayList<PokemonEntity> test = pService.findAllTrainers();
        assertEquals(316,test.size());
        StringBuilder builder = new StringBuilder();
        for (PokemonEntity p : test) {
            for (PokemonTrainerEntity pte : p.getTrainers()) {
//                System.out.println(pte.toString());
                builder.append(pte.toString()).append("\n");
            }

        }
        System.out.println(builder.toString());
    }
}
