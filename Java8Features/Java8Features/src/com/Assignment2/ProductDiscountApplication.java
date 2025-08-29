package com.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ProductDiscountApplication {
    String productName;
    double price;

    public ProductDiscountApplication(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public static void main(String[] args) {
        List<ProductDiscountApplication> productDetails = new ArrayList<ProductDiscountApplication>();
        productDetails.add(new ProductDiscountApplication("Washing Machine", 36000));
        productDetails.add(new ProductDiscountApplication("Refrigerator", 20000));
        productDetails.add(new ProductDiscountApplication("Water Purifier", 30000));
        productDetails.add(new ProductDiscountApplication("TV", 15000));

        Function<Double, Double> discountedPrice = price -> price * 0.9;
        productDetails.stream().map(product -> {
                Optional<Double> finalPrice = Optional.ofNullable(product.price)
                                                      .map(discountedPrice);
                return product.productName + " - Final Price: " + finalPrice.orElse(0.0);
            })
            .forEach((product) -> {
            	System.out.println(product);
            });
    }
}
