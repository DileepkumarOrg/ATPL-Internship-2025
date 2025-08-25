import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProductNamePrices {

    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Product1", 100);
        product.put("Product2", 101);
        product.put("Product3", 102);
        product.put("Product4", 103);
        Iterator<Map.Entry<String, Integer>> iterator = product.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Product Name: " + entry.getKey() + ", Price : " + entry.getValue());
        }
    }
}