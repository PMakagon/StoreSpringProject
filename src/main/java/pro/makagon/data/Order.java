package pro.makagon.data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;

@Component
@Scope("prototype")
public class Order {

    public String id;
    public Map<Integer,Product> productList = new HashMap<>();


    @PostConstruct
    public void initOrder(){
        System.out.println("Корзина " + id + " создана");
    }

    @PreDestroy
    public void destroyOrder(){
        System.out.println("Корзина " + id + " удалена");
    }
}
