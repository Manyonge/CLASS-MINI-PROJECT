
import java.util.Scanner;

//demonstration of inheritance
public class Sneakers extends Evaluator {
    static Scanner scanner = new Scanner(System.in);

    String name;
    int size;
    int buyingPrice;
    int sellingPrice;
    String sellingDate;
    String buyingDate;

    // demonstration of constructors
    public Sneakers(String name, int size, int bp, String bd, int sp, String sd) {
        this.name = name;
        this.size = size;
        this.buyingPrice = bp;
        this.buyingDate = bd;
        this.sellingPrice = sp;
        this.sellingDate = sd;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Buying Price: " + buyingPrice);
        System.out.println("Buying Date: " + buyingDate);
        System.out.println("Selling Price: " + sellingPrice);
        System.out.println("Selling Date: " + sellingDate);
    }

    // demonstration of polymorphism
    public int totalCost() {
        return buyingPrice;
    }

}
