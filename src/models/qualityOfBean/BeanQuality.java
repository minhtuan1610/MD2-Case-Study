package models.qualityOfBean;

public class BeanQuality {
    private String quality;
    private double priceByQualityPerShot;

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

    public double getPriceByQualityPerShot() {
        return priceByQualityPerShot;
    }

    public void setPriceByQualityPerShot(double priceByQualityPerShot) {
        this.priceByQualityPerShot = priceByQualityPerShot;
    }

    @Override
    public String toString() {
        return "BeanQuality{" +
                "quality='" + quality + '\'' +
                '}';
    }
}
