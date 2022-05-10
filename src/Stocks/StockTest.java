package Stocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataTest {
    private StockManager stockManager = new StockManager();
    @BeforeEach
    void setUp() {
        stockManager.buy(100, 25);
        stockManager.buy(200, 27);
        stockManager.buy(60, 29);

        double salesPrice = 30;
        int soldQuantity = 200;
    }
    @Test
    void soldPrice() {
        Assertions.assertEquals(603.0, stockManager.sell(200,30));
    }

}
