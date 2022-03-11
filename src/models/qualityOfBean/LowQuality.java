package models.qualityOfBean;

public class LowQuality extends BeanQuality {
    public LowQuality() {
        setQuality("low");
        setPricePerShot(50000.0);
        setPriceOfRoastedCoffee(200000.0);
    }
}
