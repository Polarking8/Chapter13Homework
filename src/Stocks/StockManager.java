package Stocks;

import java.util.LinkedList;
import java.util.Queue;

public class StockManager {

    private Queue<Block> blocks;

    public StockManager() {
        blocks = new LinkedList<>();
    }

    /**
     * @param quantity the quantity of stocks bought
     * @param cost the amount of money to buy the stocks for
     */
    public void buy(int quantity, double cost){
        blocks.add(new Block(cost,quantity));
    }

    /**
     * @param quantity the quantity of stocks sold
     * @param cost the amount selling the stocks for
     * @return returns the gain of the stocks
     */
    public double sell(int quantity, double cost){
        double gain = 0;

        while (quantity> 0){
            if (blocks.size() < 1) {
                return gain;
            }
            int possibleQuantity = blocks.peek().getQuantity();
            if(possibleQuantity > quantity){
                gain += quantity + (cost - blocks.peek().getPrice());
                blocks.peek().sell(quantity);
                quantity = 0;
            } else{
                gain += possibleQuantity * (cost - blocks.remove().getPrice());
                quantity-= possibleQuantity;
            }
        }
        return gain;
    }

}
