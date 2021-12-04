package pro.makagon.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;
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

//    http://localhost:8080/store/order/add?1
//    http://localhost:8080/store/order/get


//@Bean
//@GetMapping("/order")
//@ResponseBody
//public Order createOrder(){
//    return new Order ();
//}

@GetMapping("/order/add")
public Product addProduct(@RequestParam int id){
    return StoreService.addProduct(id);
}
@GetMapping("/order/get")
public Collection<Product> getProduct(){
    return StoreService.getProduct();
}

}

