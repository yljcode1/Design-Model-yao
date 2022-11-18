package com.yao.simpleFactory;

import com.yao.simpleFactory.SimplePizzaFactory.Pizza;

/**
 * 简单工厂模式
 * 需求：举例一个pizza工厂的例子
 * pizza工厂一共生产三种类型的pizza：chesse,pepper,greak。通过工厂类（SimplePizzaFactory）实例化这三种类型的对象。类图如下
 *
 * @date: 2022-11-18
 * @author: yao
 */
public class SimplePizzaFactory {
    /**
     * 根据orderType获取相对应的Pizza
     *
     * @param orderType 类型
     * @return 相对应的Pizza
     */
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new GreekPizza();
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }

    class Pizza {
        private String name;

        private String orderType;

        void bake() {

        }

        void box() {

        }

        void cut() {

        }

        void prepare() {

        }
    }

    class CheesePizza extends Pizza {
        // this is CheesePizza
        private String id;
    }

    class GreekPizza extends Pizza {
        // this is CheesePizza
        private String taste;
    }

    class PepperPizza extends Pizza {
        // this is CheesePizza
    }
}
