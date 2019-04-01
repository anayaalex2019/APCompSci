import java.util.Random;
import java.util.ArrayList;

public class Escort extends Starship implements IsDefense{


    public Escort(String newName){

        name = newName;

        Random rand = new Random();

        hull = 1000 + (rand.nextInt(250)+1);
        shield = 2500 + (rand.nextInt(1000)+1);
        beam = 2500 + (rand.nextInt(500)+1);
        torp = 10 + (rand.nextInt(10)+1);

        System.out.printf("%s:      Hull: %d    Shields: %d    Beam Weapons: %d    Torpedoes: %d", newName,hull,shield,beam,torp);
        System.out.println();

        //fleet.add

    }
}
