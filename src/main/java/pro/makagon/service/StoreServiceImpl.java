package pro.makagon.service;

import org.springframework.stereotype.Service;
import pro.makagon.data.Order;
import pro.makagon.data.Product;
import java.util.Collection;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    
    public final Order Order;

    public StoreServiceImpl( Order Order) {
        this.Order = Order;
    }


    @Override
    public List<Integer> addProduct(List<Integer> id) {
        for(Integer integer:id){
            Order.addToOrder(new Product(integer));
        }
        return id;
    }

    @Override
    public Collection<Product> getProduct() {
        return Order.getOrder();
    }


    @Override
    public Product deleteProduct(int id) {
        return Order.productList.remove(id);
    }
}
