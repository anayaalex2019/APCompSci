import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Overall available fleet:");

        ArrayList<Starship> fleet = new ArrayList<Starship>();
        ArrayList<Starship> attack = new ArrayList<Starship>();
        ArrayList<Starship> deffense = new ArrayList<Starship>();

        String registry[] =  new String[]{"Reliant","Enterprise","Yorktown","Saratoga","Voyager","Discovery","Constitution","Constellation","Grissom","Defiant","Intrepid","Britaan","Stargazer","Yamato","Iowa","Galaxy","Ambassador","Nimitz","Equinox","Relativity"};

        for(int i=0;i<5;i++) {
            fleet.add(new Escort(registry[i]));
        }
        for(int i=5;i<10;i++) {
            fleet.add(new Frigate(registry[i]));
        }
        for(int i=10;i<15;i++) {
            fleet.add(new Cruiser(registry[i]));
        }
        for(int i=15;i<20;i++) {
            fleet.add(new Battleship(registry[i]));
        }

        System.out.println(fleet.size());

        for (Starship x : fleet) {
//
        }
        for (Starship x : fleet) {
//
        }

    }
}
