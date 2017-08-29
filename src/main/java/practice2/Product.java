package practice2;

import java.math.BigDecimal;

/**
 * Created by jxzhong on 2017/8/28.
 */
public class Product {
    private BigDecimal price;
    private BigDecimal availableDiscounts;
    private long code;

    public Product(long code, double price, double discount) {
        this.code = code;
        this.price = new BigDecimal(price);
        this.availableDiscounts = new BigDecimal(discount);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getAvailableDiscounts() {
        return availableDiscounts;
    }

    public long getCode() {
        return code;
    }
}
