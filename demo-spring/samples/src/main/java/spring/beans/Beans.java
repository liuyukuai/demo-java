package spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Service;

/**
 * @author : liuyk
 */
@Service
public class Beans implements DisposableBean {

    private String name;

    @Override
    public void destroy() throws Exception {
        System.out.println(" beans destroy ... ");
    }
}
