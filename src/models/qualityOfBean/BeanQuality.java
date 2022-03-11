package models.qualityOfBean;

public class BeanQuality {
    private String quality;
    private double pricePerShot;
    private double priceOfRoastedCoffee;

    public BeanQuality() {
    }

    public BeanQuality(String quality) {
        this.quality = quality;
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
        return "BeanQuality{" +
                "quality='" + quality + '\'' +
                ", pricePerShot=" + pricePerShot +
                '}';
    }
}
