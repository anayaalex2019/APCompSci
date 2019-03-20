public abstract class PlayerCharacter {

    protected String name;

    protected int strength;
    protected int intelligence;
    protected int agility;

    protected int hp,maxhp;
    protected int mp,maxmp;

    private static int count;

    public PlayerCharacter(){


        System.out.println("PlayerCharacter extended class created");
        count ++;

    }

    public static int numCharacters(){
        return count;
    }

}


