import java.util.Random;

public class Mage extends PlayerCharacter {


    private int wisdom;

    public Mage(String newName) {

        name = newName;
        System.out.println("A mage, " + newName + ", has been created");

        Random rand = new Random();

        strength = 7 + (rand.nextInt(6) + 1);
        intelligence = 15 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        wisdom = 10 + (rand.nextInt(6) + 1);

        hp = maxhp = strength;
        mp = maxmp = intelligence + (2 * wisdom);

    }

    public void showStats() {
        System.out.printf("%s, a Mage:\n",name);
        System.out.printf("STR: %3d  INT: %3d  AGI: %3d  WIS: %3d\n",strength,intelligence,agility,wisdom);
        System.out.printf(" HP: %3d/%3d\n", hp, maxhp);
        System.out.printf(" MP: %3d/%3d\n", mp, maxmp);
        System.out.println();
    }

}
