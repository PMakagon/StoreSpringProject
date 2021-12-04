package pro.makagon.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.makagon.data.Order;
import pro.makagon.data.Product;

import java.util.Collection;

@Service
public class StoreServiceImpl implements StoreService {
    
    public final Order Order;

    public StoreServiceImpl( Order Order) {
        this.Order = Order;
    }


    @Override
    public Product addProduct(int id) {
        Order.productList.put(id,new Product(id));
        return Order.productList.get(id);
    }

    @Override
    public Collection<Product> getProduct() {
        return Order.productList.values();
    }


    @Override
    public Product deleteProduct(int id) {
        return Order.productList.remove(id);
    }
}
