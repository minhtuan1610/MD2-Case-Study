package models.coffeeCategory;

import models.qualityOfBean.BeanQuality;

public class BourbonTypicaGroup extends CoffeeGroup {
    public BourbonTypicaGroup() {
    }

    public BourbonTypicaGroup(String name, BeanQuality quality) {
        super(name, quality);
    }

    @Override
    public String toString() {
        return "BourbonTypicaGroup {" +
                "name='" + getName() + '\'' +
                ", quality=" + getQuality() +
                '}';
    }
}
