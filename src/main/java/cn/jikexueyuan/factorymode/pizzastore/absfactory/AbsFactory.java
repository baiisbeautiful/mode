package cn.jikexueyuan.factorymode.pizzastore.absfactory;

import cn.jikexueyuan.factorymode.pizzastore.pizza.Pizza;

public interface AbsFactory {
    public Pizza CreatePizza(String ordertype);
}
