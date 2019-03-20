import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Product fujiApples = new Product("Fuji Apples",4131,false,.49,75,"Produce");
        Product apricots = new Product("Apricots",4218,false,.39,75,"Produce");
        Product oranges = new Product("Naval Orange",1,false,.45,50,"Produce");
        Product bananas = new Product("Banana",2,false,.51,100,"Produce");
        Product avocado = new Product("Avocado",3,false,1.29,200,"Produce");
        Product cerealLuckCharms = new Product("Lucky Charms",4,false,3.50,25,"Dry Good");
        Product milk = new Product("Milk (2%)",5,false,4.00,39,"dairy");

        ArrayList<Product> inventory= new ArrayList<>();

        inventory.add(fujiApples);
        inventory.add(apricots);
        inventory.add(oranges);
        inventory.add(bananas);
        inventory.add(avocado);
        inventory.add(cerealLuckCharms);
        inventory.add(milk);

        //ad scanner so that you can change "fuji apples" to scanner output"

        for(Product x: inventory){
            if (x == fujiApples){
                System.out.println("Here is the info for fuji apples");
                (x).showInfo();
            }
        }


    }
}
