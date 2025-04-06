package lld.design.questions.shopingCoupons.service;

import lld.design.questions.shopingCoupons.models.Product;

import java.util.List;

public interface ShoppingCart {

    Product addProduct(Product product);
    Product removeProduct(Product product);
    Product updateProduct(Product product);
    List<Product> getPorductList();

}
