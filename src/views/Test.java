package views;

import controllers.BillManager;
import controllers.CoffeeBeanManager;
import models.coffeeCategory.CoffeeGroup;
import models.coffeeCategory.EthiopianLandrace;
import models.qualityOfBean.BeanQuality;
import storage.ItemsFromBinaryFile;

import java.util.LinkedList;

public class Test {

    public static LinkedList<CoffeeGroup> coffeeList = CoffeeBeanManager.savedCoffeeList;
    public static LinkedList<CoffeeGroup> billList = BillManager.savedBillList;

    public static void main(String[] args) {
        /*CoffeeGroup geisha = new EthiopianLandrace("Geisha", BeanQuality.EXCEPTIONAL);
        coffeeList.add(geisha);
        CoffeeBeanManager beanManager = new CoffeeBeanManager();
        beanManager.displayBeanInfo();
        ItemsFromBinaryFile IOtool = new ItemsFromBinaryFile();
        IOtool.writeFile(CoffeeBeanManager.getPath_bean(), coffeeList);
        IOtool.writeFile(BillManager.getPath_bill(), billList);*/
    }
}
