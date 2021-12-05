package pro.makagon.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;
import pro.makagon.data.Order;
import pro.makagon.data.Product;
import pro.makagon.service.StoreService;
import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping("/order")
public class StoreController {

    private final StoreService StoreService;

    public StoreController(StoreService StoreService) {
        this.StoreService = StoreService;
    }

//    http://localhost:8080/store/order/add?id=2
//    http://localhost:8080/store/order/get


//@Bean
//@GetMapping("/new_order")
//@ResponseBody
//public void createOrder(){
//        Order order = new Order();
//        int key= order.key++;
//        System.out.println("Корзина " + key + " создана");
//
//}

@GetMapping("/add")
public List<Integer> addProduct(@RequestParam List<Integer> id){
    return StoreService.addProduct(id);
}
@GetMapping("/get")
public Collection<Product> getProduct(){
    return StoreService.getProduct();
}

}

