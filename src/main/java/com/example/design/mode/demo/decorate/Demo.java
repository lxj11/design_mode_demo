package com.example.design.mode.demo.decorate;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/13 下午7:41
 */
public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Tom");
        Sandal sandal = new Sandal();
        Pelisse pelisse = new Pelisse();
        Jeans jeans = new Jeans();
        TShirt tShirt = new TShirt();

        tShirt.decoratorObj(person);
        jeans.decoratorObj(tShirt);
        pelisse.decoratorObj(jeans);
        sandal.decoratorObj(pelisse);
        sandal.show();


    }
}
