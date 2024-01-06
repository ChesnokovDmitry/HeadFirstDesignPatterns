package org.decorator;

import org.decorator.additions.Mocha;
import org.decorator.additions.Soy;
import org.decorator.additions.Whip;
import org.decorator.coffee.DarkRoast;
import org.decorator.coffee.Espresso;
import org.decorator.coffee.HouseBlend;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso(); //заказываем Espresso без дополнений
        espresso.setSize(Beverage.Size.AVERAGE);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast.setSize(Beverage.Size.BIG);
        darkRoast = new Mocha(darkRoast);   //заворачиваем в объект Mocha (шоколад)
        darkRoast = new Mocha(darkRoast);   //заворачиваем второй раз в Mocha
        darkRoast = new Whip(darkRoast);    //заворачиваем в объект Whip (взбитые сливки)
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);   //заворачиваем в объект Soy (соя)
        houseBlend = new Mocha(houseBlend); //заворачиваем в объект Mocha
        houseBlend = new Whip(houseBlend);  //заворачиваем в объект Whip
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
