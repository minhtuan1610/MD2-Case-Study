package models.bill;

import controllers.DataInput;
import models.coffeeCategory.CoffeeGroup;

public class Items {
    private CoffeeGroup coffeeGroup;    //  lay ten cua item
    private double amount;        //  lay so luong cua tung item

    public Items() {
    }

    public Items(CoffeeGroup coffeeGroup, double amount) {
        this.coffeeGroup = coffeeGroup;
        this.amount = amount;
    }

    public CoffeeGroup getCoffeeGroup() {
        return coffeeGroup;
    }

    public void setCoffeeGroup(CoffeeGroup coffeeGroup) {
        this.coffeeGroup = coffeeGroup;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPriceByRoastedCoffee() {
        double roastedCoffeePrice;
        roastedCoffeePrice = amount * coffeeGroup.getQuality().getPriceOfRoastedCoffee();
        return roastedCoffeePrice;
    }

    public double getPriceByCoffeeShot() {
        double coffeeShotPrice;
        coffeeShotPrice = amount * coffeeGroup.getQuality().getPricePerShot();
        return coffeeShotPrice;
    }
}
