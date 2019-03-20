import java.util.Random;

public class Paladin extends PlayerCharacter{


    private int wisdom;
    private int constitution;

    public Paladin(String newName) {

        name = newName;
        System.out.println("A paladin, " + newName + ", has been created");

        Random rand = new Random();

        strength = 10 + (rand.nextInt(6) + 1);
        intelligence = 15 + (rand.nextInt(6) + 1);
        agility = 5 + (rand.nextInt(6) + 1);
        wisdom = 10 + (rand.nextInt(6) + 1);
        constitution = 10 + (rand.nextInt(6)+1);

        hp = maxhp = strength + (2 * constitution);
        mp = maxmp = intelligence + (2 * wisdom);

    }

    public void showStats() {
        System.out.printf("%s, a paladin:\n",name);
        System.out.printf("STR: %3d  INT: %3d  AGI: %3d  WIS: %3d  CON: %3d\n",strength,intelligence,agility,wisdom,constitution);
        System.out.printf(" HP: %3d/%3d\n", hp, maxhp);
        System.out.printf(" MP: %3d/%3d\n", mp, maxmp);
        System.out.println();
    }

}
