package models.coffeeCategory;

import models.qualityOfBean.BeanQuality;

public class BourbonTypicaGroup extends CoffeeGroup {
    public BourbonTypicaGroup() {
    }

    public BourbonTypicaGroup(String name, BeanQuality quality, double coffeeBeanPrice) {
        super(name, quality, coffeeBeanPrice);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
