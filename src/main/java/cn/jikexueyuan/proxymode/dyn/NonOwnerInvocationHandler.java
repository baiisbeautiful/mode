package cn.jikexueyuan.proxymode.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/5 17:33
 **/
public class NonOwnerInvocationHandler implements InvocationHandler{
    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get")){
            return method.invoke(person,args);
        }else if(method.getName().equals("setHotOrNotRating")){
            return method.invoke(person,args);
        }else if(method.getName().startsWith("set")){
            return new IllegalAccessException();
        }
        return null;
    }
}
