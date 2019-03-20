import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<PlayerCharacter> players = new ArrayList<>();
        players.add(new Fighter("Alex"));
        players.add(new Mage("Will"));
        players.add(new Paladin("Ryan"));
        players.add(new Priest("Daniel"));

        System.out.println(players.size() + " Characters are in your party");

        for(PlayerCharacter x: players){
            if (x instanceof Priest){
                System.out.println("Here is a priest");
                ((Priest) x).showStats();
            }
        }

        System.out.println(PlayerCharacter.numCharacters());
    }
}
