import java.util.Random;
import java.util.ArrayList;

public class Cruiser extends Starship implements IsOffense{

    public Cruiser(String newName){

        name = newName;

        Random rand = new Random();

        hull = 2000 + (rand.nextInt(500)+1);
        shield = 2000 + (rand.nextInt(500)+1);
        beam = 3000 + (rand.nextInt(1000)+1);
        torp = 10 + (rand.nextInt(15)+1);

        System.out.printf("%s:      Hull: %d    Shields: %d    Beam Weapons: %d    Torpedoes: %d", newName,hull,shield,beam,torp);
        System.out.println();

        //fleet.add

    }
}
