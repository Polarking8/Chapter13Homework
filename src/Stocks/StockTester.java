package Stocks;

import java.util.Scanner;

public class StockTester {
    public static void main(String[] args) {
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
    }
}
/* Suppose you buy 100 shares of a stock at $12 per share, then another 100 at $10 per share, and then sell 150 shares at $15.
You have to pay taxes on the gain, but exactly what is the gain?
In the United States, the FIFO rule holds:
You first sell all shares of the first batch for a profit of $300, then 50 of the shares from the second batch,
for a profit of $250, yielding a total profit of $550.
Write a program that can make these calculations for arbitrary purchases and sales of shares in a single company.
The user enters commands buy quantity price, sell quantity (which causes the gain to be displayed), and quit.
 Hint: Keep a queue of objects of a class Block that contains the quantity and price of a block of shares.
Include javadoc, a junit test, a UML diagram, and all business logic in the business class.
*/
