package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.Beans;

public class Main {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Beans beans = (Beans) applicationContext.getBean("beans");
        System.out.println(beans);

        beans = (Beans) applicationContext.getBean("beans");
        System.out.println(beans);
    }
}
