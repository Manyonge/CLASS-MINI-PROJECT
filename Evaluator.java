public class Evaluator {
    static Sneakers newSneaker = new Sneakers("daf", 4, 5, "daf", 4, "daf");
    static Jeans newJeans = new Jeans("daf", 4, 5, "daf", 4, "daf");

    public int totalCost(Sneakers sneaker, Jeans jeans) {
        int totalBuying = sneaker.buyingPrice + jeans.buyingPrice;
        return totalBuying;
    }
}
