package pro.makagon.service;

import org.springframework.stereotype.Service;
import pro.makagon.data.Order;
import pro.makagon.data.Product;
import java.util.Collection;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    
    public final Order order;

    public StoreServiceImpl( Order order) {
        this.order = order;
    }

    @Override
    public Collection<Product> addProduct(List<Integer> id) {
        return order.addAll(id);
    }


    @Override
    public Collection<Product> getProduct() {
        return order.getOrder();
    }


    @Override
    public Product deleteProduct(int id) {
        return order.deleteProduct(id);
    }
}
