package lld.design.questions.shopingCoupons.models;

import java.util.List;

public class Product {

    public String productName;
    public String productId;
    public double productPrice;
    List<Coupon> couponList;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
