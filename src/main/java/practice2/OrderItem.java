package practice2;

/**
 * Created by jxzhong on 2017/8/29.
 */
public class OrderItem {
    private Integer count;
    private long code;

    public OrderItem(long code, int count) {
        this.code = code;
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public long getCode() {
        return code;
    }
}
