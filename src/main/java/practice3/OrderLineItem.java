package practice3;

import java.math.BigDecimal;

public class OrderLineItem {
    private BigDecimal price;

    OrderLineItem(double price) {
        this.price = new BigDecimal(price);
    }

    BigDecimal getPrice() {
        return price;
    }
}
