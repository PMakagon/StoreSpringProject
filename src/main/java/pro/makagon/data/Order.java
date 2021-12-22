package pro.makagon.data;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


//@Primary
@Component
@SessionScope
public class Order {

    private final List<Product> productList = new ArrayList<>();

    public Product addToOrder(Product product){
         productList.add(product);
        return product;
    }

    public Product deleteProduct(int id) {
        return productList.remove(id);
    }

    public List<Product> getOrder(){
        return Collections.unmodifiableList(productList);
    }

    public List<Product> addAll (List<Integer> id){
       return id.stream()
               .map(Product::new)
               .map(this::addToOrder)
               .collect(Collectors.toList());
    }


    @PostConstruct
    public void initOrder(){
        productList.add(new Product(1));
//        System.out.println("Корзина " + key + " создана");
    }
//
//    @PreDestroy
//    public void destroyOrder(){
//        System.out.println("Корзина " + key + " удалена");
//    }

}
