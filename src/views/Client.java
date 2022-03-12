package views;

import controllers.CoffeeBeanManager;
import controllers.DataInput;
import models.bill.Bill;
import models.bill.Items;
import models.coffeeCategory.*;
import models.qualityOfBean.BeanQuality;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<CoffeeGroup> coffeeGroupList = new LinkedList<>();
        CoffeeGroup geisha = new EthiopianLandrace("Geisha", BeanQuality.EXCEPTIONAL);
        CoffeeGroup nayarita = new F1Hybrids("Nayarita", BeanQuality.VERY_GOOD);
        CoffeeGroup catuai = new BourbonTypicaGroup("Catuai", BeanQuality.GOOD);
        CoffeeGroup costaRica95 = new Introgressed("Coasta Rica 95", BeanQuality.LOW);
        coffeeGroupList.add(geisha);
        coffeeGroupList.add(nayarita);
        coffeeGroupList.add(catuai);
        coffeeGroupList.add(costaRica95);
        CoffeeBeanManager a1 = new CoffeeBeanManager();
        a1.displayBeanInfo(coffeeGroupList);

    }
}
