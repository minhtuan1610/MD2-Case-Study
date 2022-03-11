package views;

import models.coffeeCategory.CoffeeGroup;
import models.coffeeCategory.EthiopianLandrace;
import models.qualityOfBean.BeanQuality;

public class Client {
    public static void main(String[] args) {
        CoffeeGroup coffeeGroup = new EthiopianLandrace("Geisha", BeanQuality.EXCEPTIONAL);
        CoffeeGroup coffeeGroup2 = new EthiopianLandrace("Dat", BeanQuality.GOOD);
    }
}
