package cn.jikexueyuan.factorymode.pizzastore.pizza;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 11:23
 **/
public abstract class Pizza {
    protected String name;


    public abstract void prepare();
    public void bake(){
        System.out.println(name+" is baking");
    }
    public void cut(){
        System.out.println(name+" is cuting");

    }
    public void box(){
        System.out.println(name+" is boxing");

    }

    public void setName(String name) {
        this.name = name;
    }
}
