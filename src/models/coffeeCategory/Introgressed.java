package models.coffeeCategory;

import models.qualityOfBean.BeanQuality;

public class Introgressed extends CoffeeGroup {
    public Introgressed() {
    }

    public Introgressed(String name, BeanQuality quality, double coffeeBeanPrice) {
        super(name, quality, coffeeBeanPrice);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
