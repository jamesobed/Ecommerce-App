package com.example.frutty.Service;

import com.example.frutty.Model.Cart;
import com.example.frutty.Model.Customer;
import com.example.frutty.Model.Product;
import com.example.frutty.Model.Wishlist;

import java.util.List;
import java.util.Map;

public interface CustomerService {
    Customer registerCustomer(Customer customer);

    boolean login(String email , String password);
    Product findProductById(int id);
    Map<Integer, Product> addToCart(int id , int cusromerId);
    Product getSingleProduct(int id);
    List<Product> getAllProducts();
    Wishlist addToWishList(Wishlist wishlist);
    Customer getCustomerEmail(String email);

   Customer getCustomerId(int customerId);

    int deleteWishlistByUserIdAndProductId(int customer_id, int product_id);
}
