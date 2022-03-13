package views;

import controllers.CoffeeBeanManager;
import models.coffeeCategory.CoffeeGroup;
import models.coffeeCategory.EthiopianLandrace;
import models.qualityOfBean.BeanQuality;
import storage.BeanFromBinaryFile;

import java.util.LinkedList;

public class Test {

    public static LinkedList<CoffeeGroup> coffeeList = CoffeeBeanManager.savedCoffeeList;

    public static void main(String[] args) {
        CoffeeGroup geisha = new EthiopianLandrace("Geisha", BeanQuality.EXCEPTIONAL);
        coffeeList.add(geisha);
        CoffeeBeanManager beanManager = new CoffeeBeanManager();
        beanManager.displayBeanInfo();
        BeanFromBinaryFile IOtool = new BeanFromBinaryFile();
        IOtool.writeFile(coffeeList);
    }
}
