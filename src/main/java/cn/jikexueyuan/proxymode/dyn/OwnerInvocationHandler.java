package cn.jikexueyuan.proxymode.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/5 17:26
 **/
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get")){
            return method.invoke(personBean,args);
        }else if(method.getName().equals("setHotOrNotRating")){
            return new IllegalAccessException();
        }else if(method.getName().startsWith("set")){
            return method.invoke(personBean,args);
        }
        return null;
    }
}
