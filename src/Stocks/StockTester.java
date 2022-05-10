package Stocks;

public class StockTester {
    public static void main(String[] args) {
        StockManager manager = new StockManager();
        manager.buy(300, 24);
        manager.buy(100, 26);
        manager.buy(30, 28);

        double salesPrice = 30;
        int soldQuantity = 200;
        double gain = manager.sell(soldQuantity, salesPrice);

        System.out.printf("Sold %d at %.2f with a gain of %.2f", soldQuantity,salesPrice,gain);
    }
}
/* my code attempt for tester, to go with Block.
Scanner in = new Scanner (System.in);
        Block stocks = new Block();
        String next;
        do {
            System.out.println("Press B to buy or S to sell, or quit to end the program");
            next = in.next();
            if(next.equals("B") || next.equals("b")){
                System.out.println("Enter quantity to buy: ");
                int buyQuantity = in.nextInt();
                System.out.println("Enter price to buy at: ");
                int buyPrice = in.nextInt();
                stocks.buyStock(buyQuantity,buyPrice);
            } else if(next.equals("S")|| next.equals("s")){
                System.out.println("Enter quantity to sell: ");
                int sellQuantity = in.nextInt();
                System.out.println("Enter price to sell at: ");
                int sellPrice = in.nextInt();
                stocks.sellStock(sellQuantity,sellPrice);
                System.out.println("profit: " + stocks.getDifference());
            }
        } while(!next.equals("quit"));
 */
