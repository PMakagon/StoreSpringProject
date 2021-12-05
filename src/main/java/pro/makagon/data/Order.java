package pro.makagon.data;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Primary
@Component
@SessionScope
//@Scope("prototype")
public class Order {

    public int key =0;
    public List<Product> productList = new ArrayList<>();

    public void setKey(int key) {
        this.key = key;
    }

    public void addToOrder(Product product){
        productList.add(product);
    }

    public List<Product> getOrder(){
        return productList;
    }

    @PostConstruct
    public void initOrder(){
        productList.add(new Product(1));
        System.out.println("Корзина " + key + " создана");
    }

    @PreDestroy
    public void destroyOrder(){
        System.out.println("Корзина " + key + " удалена");
    }
}
