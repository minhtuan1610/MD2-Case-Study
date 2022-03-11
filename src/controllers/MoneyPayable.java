package controllers;

import models.coffeeCategory.CoffeeGroup;
import models.qualityOfBean.BeanQuality;

public class MoneyPayable {
    private DataInput dataInput;
    private CoffeeGroup coffeeGroup;
    private BeanQuality beanQuality;

    public MoneyPayable() {
    }

    public MoneyPayable(DataInput dataInput, CoffeeGroup coffeeGroup, BeanQuality beanQuality) {
        this.dataInput = dataInput;
        this.coffeeGroup = coffeeGroup;
        this.beanQuality = beanQuality;
    }

    public double priceByRoastedCoffee() {
        double roastedCoffeePrice;
        roastedCoffeePrice = dataInput.getAmountOfRoastedCoffee() * coffeeGroup.getCoffeeBeanPrice();
        return roastedCoffeePrice;
    }

    public double priceByCoffeeShot() {
        double coffeeShotPrice;
        coffeeShotPrice = dataInput.getNumberOfCoffeeShot() * beanQuality.getPriceByQualityPerShot();
        return coffeeShotPrice;
    }
}
