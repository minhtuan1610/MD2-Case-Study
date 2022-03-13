package models.coffeeCategory;

import models.qualityOfBean.BeanQuality;

import java.io.Serializable;

public class CoffeeGroup {
    private String name;
    private BeanQuality quality;

    public CoffeeGroup() {
    }

    public CoffeeGroup(String name, BeanQuality quality) {
        this.name = name;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BeanQuality getQuality() {
        return quality;
    }

    public void setQuality(BeanQuality quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "CoffeeGroup {" +
                "name='" + name + '\'' +
                ", quality=" + quality +
                '}';
    }
}
