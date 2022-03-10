package models.coffeeCategory;

import models.qualityOfBean.BeanQuality;

public class EthiopianLandrace extends CoffeeGroup {
    public EthiopianLandrace() {
    }

    public EthiopianLandrace(String name, BeanQuality quality, double coffeeBeanPrice) {
        super(name, quality, coffeeBeanPrice);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
