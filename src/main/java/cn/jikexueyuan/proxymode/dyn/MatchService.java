package cn.jikexueyuan.proxymode.dyn;

import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/5 17:41
 **/
public class MatchService {
    public MatchService(){
        PersonBean joe=getPersonInfo("joe","male",  "running");

        PersonBean ownerProxy=getOwnerProxy(joe);

        System.out.println("name is "+ownerProxy.getName());
        System.out.println("interests is "+ownerProxy.getInterests());

        ownerProxy.setInterests("bowling");
        System.out.println("interests are  "+ownerProxy.getInterests());
        ownerProxy.setHotOrNotRating(50);
        System.out.println("rating is "+ownerProxy.getHotOrNotRating());
        ownerProxy.setHotOrNotRating(40);
        System.out.println("rating is "+ownerProxy.getHotOrNotRating());

        System.out.println("*************");

        PersonBean nonOwnerProxy=getNonOwner(joe);

        System.out.println("name is "+nonOwnerProxy.getName());
        System.out.println("interests are "+nonOwnerProxy.getInterests());
        nonOwnerProxy.setInterests("basketball");
        System.out.println("interests are "+nonOwnerProxy.getInterests());
        nonOwnerProxy.setHotOrNotRating(70);
        System.out.println("rating is "+nonOwnerProxy.getHotOrNotRating());
        nonOwnerProxy.setHotOrNotRating(90);
        System.out.println("rating is "+nonOwnerProxy.getHotOrNotRating());
        nonOwnerProxy.setHotOrNotRating(110);
        System.out.println("rating is "+nonOwnerProxy.getHotOrNotRating());

    }

    private PersonBean getNonOwner(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
    }

    private PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }


    private PersonBean getPersonInfo(String name, String male, String interests) {
        PersonBeanImpl personBean = new PersonBeanImpl();
        personBean.setName(name);
        personBean.setGender(male);
        personBean.setInterests(interests);
        return personBean;
    }
}
