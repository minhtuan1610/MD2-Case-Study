package models.coffeeCategory;

import models.qualityOfBean.BeanQuality;

public class F1Hybrids extends CoffeeGroup {
    public F1Hybrids() {
    }

    public F1Hybrids(String name, BeanQuality quality, double coffeeBeanPrice) {
        super(name, quality, coffeeBeanPrice);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
