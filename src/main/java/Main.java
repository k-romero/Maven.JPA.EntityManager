import entities.PokemonTrainerEntity;
import services.PokemonTrainerService;

public class Main {
    public static void main(String[] args) {
        PokemonTrainerService pService = new PokemonTrainerService();
        PokemonTrainerEntity pkTrainer = pService.findPokemonTrainerById(0);
        System.out.println(pkTrainer.toString());

        PokemonTrainerEntity kevin = new PokemonTrainerEntity(12300,100,100,100,100,100,100,100,100,100);
        pService.persistTrainer(kevin);
        System.out.println(pService.findPokemonTrainerById(1).toString());
    }
}
