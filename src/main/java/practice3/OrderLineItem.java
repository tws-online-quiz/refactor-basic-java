package practice3;

import java.math.BigDecimal;

/**
 * Created by jxzhong on 2017/8/29.
 */
public class OrderLineItem {
    private BigDecimal price;

    public OrderLineItem(double price) {
        this.price = new BigDecimal(price);
    }

    public BigDecimal getPrice() {
        return price;
    }
}
