public class Jeans {
    String name;
    int size;
    int buyingPrice;
    int sellingPrice;
    String sellingDate;
    String buyingDate;

    public Jeans(String name, int size, int bp, String bd, int sp, String sd) {

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

    public int totalCost() {
        return buyingPrice;
    }

}
