public class Jeans {
    String name;
    int size;
    int buyingPrice;
    int sellingPrice;

    public Jeans(String name, int size, int bp, int sp) {

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

    public int totalCost() {
        return buyingPrice;
    }

}
