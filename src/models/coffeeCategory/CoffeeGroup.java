package models.coffeeCategory;

import models.qualityOfBean.BeanQuality;

public class CoffeeGroup {
    private String name;
    private BeanQuality quality;
    private double coffeeBeanPrice;

    public CoffeeGroup() {
    }

    public CoffeeGroup(String name, BeanQuality quality, double coffeeBeanPrice) {
        this.name = name;
        this.quality = quality;
        this.coffeeBeanPrice = coffeeBeanPrice;
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

    public double getCoffeeBeanPrice() {
        return coffeeBeanPrice;
    }

    public void setCoffeeBeanPrice(double coffeeBeanPrice) {
        this.coffeeBeanPrice = coffeeBeanPrice;
    }

    @Override
    public String toString() {
        return "CoffeeGroup{" +
                "name='" + name + '\'' +
                ", quality=" + quality +
                ", coffeeBeanPrice=" + coffeeBeanPrice +
                '}';
    }
}
