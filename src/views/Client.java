package views;

import controllers.DataInput;
import controllers.MoneyPayable;
import models.coffeeCategory.CoffeeGroup;
import models.coffeeCategory.EthiopianLandrace;
import models.qualityOfBean.BeanQuality;
import models.qualityOfBean.ExceptionalQuality;

public class Client {
    public static void main(String[] args) {
        BeanQuality quality1 = new ExceptionalQuality();
        DataInput input1 = new DataInput();
        CoffeeGroup type1 = new EthiopianLandrace("heloo", quality1, 45000);
        MoneyPayable paid1 = new MoneyPayable(input1, type1, quality1);
        System.out.println("nhap di ban oi");
        double a = paid1.priceByRoastedCoffee();
        System.out.println(a);
        System.out.println("muon uong bao nhieu");
        double b = quality1.getPriceByQualityPerShot();
        double c = paid1.priceByCoffeeShot();
        System.out.println(c);
    }
}
