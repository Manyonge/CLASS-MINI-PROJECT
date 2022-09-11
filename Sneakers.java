
import java.util.Scanner;

//demonstration of inheritance
public class Sneakers extends Evaluator {
    static Scanner scanner = new Scanner(System.in);

    String name;
    int size;
    int buyingPrice;
    int sellingPrice;

    // demonstration of constructors
    public Sneakers(String name, int size, int bp, int sp) {
        this.name = name;
        this.size = size;
        this.buyingPrice = bp;
        this.sellingPrice = sp;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Buying Price: " + buyingPrice);
        System.out.println("Selling Price: " + sellingPrice);
    }

    // demonstration of polymorphism
    public int totalCost() {
        return buyingPrice;
    }

}
