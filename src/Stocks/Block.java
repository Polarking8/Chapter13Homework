package Stocks;

import java.util.LinkedList;
import java.util.Queue;

public class Block {
    private final Queue<Integer> buyQuantity =  new LinkedList<>();
    private final Queue<Integer> buyPrice =  new LinkedList<>();
    private final Queue<Integer> sellQuantity =  new LinkedList<>();
    private final Queue<Integer> sellPrice =  new LinkedList<>();
    private int difference = 0;


    /**
     * @param newQuantity amount of stocks bought
     * @param newPrice price sold at
     */
    public void buyStock(int newQuantity, int newPrice){
        buyQuantity.add(newQuantity);
        buyPrice.add(newPrice);
    }

    /**
     * @param soldQuantity the amount of stocks sold
     * @param soldPrice the price sold at
     */
    public void sellStock(int soldQuantity, int soldPrice){
        sellPrice.add(soldPrice);
        sellQuantity.add(soldQuantity);
        difference += ((sellQuantity.remove()*sellPrice.remove())-(buyQuantity.remove()*buyPrice.remove()));
    }

    /**
     * @return the difference in price aka how much you make from the stocks
     */
    public int getDifference(){
        return difference;
    }
}
/* Suppose you buy 100 shares of a stock at $12 per share, then another 100 at $10 per share, and then sell 150 shares at $15.
You have to pay taxes on the gain, but exactly what is the gain?
In the United States, the FIFO rule holds:
You first sell all shares of the first batch for a profit of $300, then 50 of the shares from the second batch,
for a profit of $250, yielding a total profit of $550.
Write a program that can make these calculations for arbitrary purchases and sales of shares in a single company.
The user enters commands: buy quantity, price, sell quantity (which causes the gain to be displayed), and quit.
 Hint: Keep a queue of objects of a class Block that contains the quantity and price of a block of shares.
Include javadoc, a junit test, a UML diagram, and all business logic in the business class.
*/