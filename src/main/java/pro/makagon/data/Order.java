package pro.makagon.data;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;

@Primary
@Component
//@SessionScope
@Scope("prototype")
public class Order {

    public int key =0;
    public Map<Integer,Product> productList = new HashMap<>();

    public void setKey(int key) {
        this.key = key;
    }

    @PostConstruct
    public void initOrder(){
        productList.put(1,new Product(1));
        System.out.println("Корзина " + key + " создана");
    }

    @PreDestroy
    public void destroyOrder(){
        System.out.println("Корзина " + key + " удалена");
    }
}
