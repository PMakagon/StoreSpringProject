package pro.makagon.service;

import pro.makagon.data.Order;
import pro.makagon.data.Product;

import java.util.Collection;

public interface StoreService {

Product addProduct(int id);
Collection<Product> getProduct();
Product deleteProduct(int id);
}
