package views;

import controllers.DataInput;
import models.bill.Items;
import models.coffeeCategory.CoffeeGroup;
import models.coffeeCategory.EthiopianLandrace;
import models.qualityOfBean.BeanQuality;

public class Client {
    public static void main(String[] args) {
        CoffeeGroup coffeeGroup = new EthiopianLandrace("Geisha", BeanQuality.EXCEPTIONAL);
        CoffeeGroup coffeeGroup2 = new EthiopianLandrace("Dat", BeanQuality.GOOD);
        DataInput dataInput = new DataInput();
        System.out.println("Nhap so luong roasted coffee");
        double amount = dataInput.getAmountOfRoastedCoffee();
        System.out.println("Tien roasted coffee");
        Items items = new Items(coffeeGroup, amount);
        double b = items.getPriceByRoastedCoffee();
        System.out.println(b);
    }
}
