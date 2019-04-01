import java.util.Random;
import java.util.ArrayList;

public class Frigate extends Starship implements IsDefense{


    public Frigate(String newName){

        name = newName;

        Random rand = new Random();

        hull = 1500 + (rand.nextInt(500)+1);
        shield = 2000 + (rand.nextInt(500)+1);
        beam = 2500 + (rand.nextInt(1000)+1);
        torp = 20 + (rand.nextInt(10)+1);

        System.out.printf("%s:      Hull: %d    Shields: %d    Beam Weapons: %d    Torpedoes: %d", newName,hull,shield,beam,torp);
        System.out.println();

        //fleet.add

    }
}

