package pro.makagon.service;

import pro.makagon.data.Product;
import java.util.Collection;
import java.util.List;

public interface StoreService {
    Collection<Product> addProduct(List<Integer> id);
    Collection<Product> getProduct();
    Product deleteProduct(int id);
}
