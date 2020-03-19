package designpattern.command;

/**
 * @author zq.huang
 * @date 2020/2/13
 */
public class SellStock implements Order{

    private Stock sellStock;

    public SellStock(Stock sellStock) {
        this.sellStock = sellStock;
    }

    @Override
    public void execute() {
        sellStock.sell();
    }
}
