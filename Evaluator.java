public class Evaluator {
    static Sneakers newSneaker = new Sneakers("daf", 4, 5, 4);
    static Jeans newJeans = new Jeans("daf", 4, 5, 4);

    public int totalCost(Sneakers sneaker, Jeans jeans) {
        int totalBuying = sneaker.buyingPrice + jeans.buyingPrice;
        return totalBuying;
    }

    // demonstration of method overloading
    // this is helpful in case the numbers entered are of type double or int
    public int profitCalculator(int bp, int sp) {
        return sp - bp;
    }

    public double profitCalculator(double bp, double sp) {
        return sp - bp;
    }
}
