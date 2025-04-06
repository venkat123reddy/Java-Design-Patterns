package lld.design.questions.shopingCoupons.serviceImpl;

import lld.design.questions.shopingCoupons.models.Product;
import lld.design.questions.shopingCoupons.service.ShoppingCart;

import java.util.List;
import java.util.Map;

public class ShoppingCartServiceImpl implements ShoppingCart {

    Map<Product,Integer> productList;


    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product removeProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getPorductList() {
        return List.of();
    }
}
