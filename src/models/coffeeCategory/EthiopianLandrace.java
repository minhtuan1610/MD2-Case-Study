package models.coffeeCategory;

import models.qualityOfBean.BeanQuality;

public class EthiopianLandrace extends CoffeeGroup {
    public EthiopianLandrace() {
    }

    public EthiopianLandrace(String name, BeanQuality quality) {
        super(name, quality);
    }

    @Override
    public String toString() {
        return "EthiopianLandrace {" +
                "name='" + getName() + '\'' +
                ", quality=" + getQuality() +
                '}';
    }
}
