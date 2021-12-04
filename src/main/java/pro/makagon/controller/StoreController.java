package pro.makagon.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.makagon.data.Order;
import pro.makagon.data.Product;
import pro.makagon.service.StoreService;

import java.util.Collection;


@RestController
@RequestMapping("/store")
public class StoreController {

    private final StoreService StoreService;

    public StoreController(StoreService StoreService) {
        this.StoreService = StoreService;
    }

@Bean
@GetMapping("/store/new_order")
public Order createOrder(){
    return new Order();
}

@GetMapping("/store/order/add")
public Product addProduct(int id){
    return StoreService.addProduct(id);
}
@GetMapping("/store/order/get")
public Collection<Product> getProduct(Order order){
    return StoreService.getProduct(order);
}

}

