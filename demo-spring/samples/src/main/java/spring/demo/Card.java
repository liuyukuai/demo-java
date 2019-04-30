package spring.demo;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : liuyk
 */
public abstract class Card implements Payment {

    private static Map<String, Payment> paymentMap = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        paymentMap.put(this.getType(), this);
    }

    abstract String getType();
}
