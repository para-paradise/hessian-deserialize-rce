import com.caucho.hessian.client.HessianProxyFactory;
import com.example.hessian.Hello;

import java.net.MalformedURLException;

public class Test {
    public static void main(String[] args) throws MalformedURLException {
        String target= "http://127.0.0.1:8080/hessian";
        HessianProxyFactory factory = new HessianProxyFactory();
        factory.setOverloadEnabled(true);
        Object o = factory.create(Hello.class, target);
    }
}
