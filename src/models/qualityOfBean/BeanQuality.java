package models.qualityOfBean;

import java.io.Serializable;

public class BeanQuality implements Serializable {
    public static final BeanQuality EXCEPTIONAL = new BeanQuality("exceptional", 100000.0, 500000.0);
    public static final BeanQuality VERY_GOOD = new BeanQuality("very good", 75000.0, 400000.0);
    public static final BeanQuality GOOD = new BeanQuality("good", 70000.0, 300000.0);
    public static final BeanQuality LOW = new BeanQuality("low", 50000.0, 200000.0);

    private String quality;
    private double pricePerShot;
    private double priceOfRoastedCoffee;

    public BeanQuality() {
    }

    public BeanQuality(String quality, double pricePerShot, double priceOfRoastedCoffee) {
        this.quality = quality;
        this.pricePerShot = pricePerShot;
        this.priceOfRoastedCoffee = priceOfRoastedCoffee;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public double getPricePerShot() {
        return pricePerShot;
    }

    public void setPricePerShot(double pricePerShot) {
        this.pricePerShot = pricePerShot;
    }

    public double getPriceOfRoastedCoffee() {
        return priceOfRoastedCoffee;
    }

    public void setPriceOfRoastedCoffee(double priceOfRoastedCoffee) {
        this.priceOfRoastedCoffee = priceOfRoastedCoffee;
    }

    @Override
    public String toString() {
        return '\'' + quality + '\'' +
                ", pricePerShot= " + pricePerShot;
    }
}
