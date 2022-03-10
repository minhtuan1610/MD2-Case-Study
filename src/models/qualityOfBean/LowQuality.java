package models.qualityOfBean;

public class LowQuality extends BeanQuality {
    public LowQuality() {
        setQuality("low");
        setPriceByQualityPerShot(50000.0);
    }
}
