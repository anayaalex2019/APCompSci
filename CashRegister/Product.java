public class Product {

    String name;

    int code;

    boolean taxed;

    double price;

    int inventory;

    String type;

    public Product(String newName, int newCode, boolean newTax, double newPrice, int newInventory, String newType) {

        name = newName;
        code = newCode;
        taxed = newTax;
        price = newPrice;
        inventory = newInventory;
        type = newType;

        System.out.printf("%d units of %s, are priced at %.2f, is %s, and is in our %s department.\n",inventory,name,price,taxed ? "taxable" : "not taxable",type);
    }

    public void showInfo(){

        System.out.printf("%d units of %s, are priced at %.2f, is %s, and is in our %s department.\n",inventory,name,price,taxed ? "taxable" : "not taxable",type);

    }
}