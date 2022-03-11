package models.bill;

import models.coffeeCategory.CoffeeGroup;

public class Items {
    private CoffeeGroup coffeeGroup;    //  lay ten cua item
    private double amount;              //  lay so luong cua tung loai coffee
    private double shot;                //  lay so luong shot tuong ung tung loai coffee

    public Items() {
    }

    public Items(CoffeeGroup coffeeGroup, double amount, double shot) {
        this.coffeeGroup = coffeeGroup;
        this.amount = amount;
        this.shot = shot;
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
        coffeeShotPrice = shot * coffeeGroup.getQuality().getPricePerShot();
        return coffeeShotPrice;
    }
}
