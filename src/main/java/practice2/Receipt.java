package practice2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;


/**
 * Created by jxzhong on 2017/8/28.
 */
public class Receipt {

    public Receipt() {
        tax = new BigDecimal(0.1);
        tax = tax.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    private BigDecimal tax;

    public double CalculateGrandTotal(List<Product> products, List<OrderItem> counts) {
        BigDecimal subTotal = new BigDecimal(0);
        for (Product product : products) {
            for (OrderItem item : counts) {
                if (item.getCode() == product.getCode()) {
                    subTotal = subTotal.add(product.getPrice().multiply(new BigDecimal(item.getCount())));
                    break;
                }
            }
        }

        for (Product product : products) {
            for (OrderItem item : counts) {
                if (item.getCode() == product.getCode()) {
                    BigDecimal reducedPrice = product.getPrice()
                            .multiply(product.getAvailableDiscounts())
                            .multiply(new BigDecimal(item.getCount()));
                    subTotal = subTotal.subtract(reducedPrice);
                    break;
                }
            }
        }

        BigDecimal taxTotal = subTotal.multiply(tax);

        BigDecimal grandTotal = subTotal.add(taxTotal);

        return grandTotal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
