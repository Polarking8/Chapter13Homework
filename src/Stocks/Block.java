package Stocks;

public class Block {
    private final double price;
    private int quantity;

    public Block(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void sell(int shares) {
        quantity -= shares;
    }
    /*
      my attempt at this code is below:
    private final Queue<Integer> buyQuantity =  new LinkedList<>();
    private final Queue<Integer> buyPrice =  new LinkedList<>();
    private final Queue<Integer> sellQuantity =  new LinkedList<>();
    private final Queue<Integer> sellPrice =  new LinkedList<>();
    private int difference = 0;
    /**
     * @param newQuantity amount of stocks bought
     * @param newPrice price sold at
    public void buyStock(int newQuantity, int newPrice){
        buyQuantity.add(newQuantity);
        buyPrice.add(newPrice);
    }
    /**
     * @param soldQuantity the amount of stocks sold
     * @param soldPrice the price sold at
    public void sellStock(int soldQuantity, int soldPrice){
        sellPrice.add(soldPrice);
        sellQuantity.add(soldQuantity);
        difference += ((sellQuantity.remove()*sellPrice.remove())-(buyQuantity.remove()*buyPrice.remove()));
    }
    /**
     * @return the difference in price aka how much you make from the stocks
    public int getDifference(){
        return difference;
}
*/
}