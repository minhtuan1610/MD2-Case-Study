package views;

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

        DataInput dataInput = new DataInput();
        System.out.println("Nhap so luong roasted coffee:");
        double amount = dataInput.getAmountOfRoastedCoffee();
        System.out.println("Nhap so luong shot:");
        double shot = dataInput.getNumberOfCoffeeShot();
        System.out.println("Tien roasted coffee:");
        Items items = new Items(geisha, amount, shot);
        double b = items.getPriceByRoastedCoffee();
        System.out.println(b);
        System.out.println("Tien coffee shot:");
        double c = items.getPriceByCoffeeShot();
        System.out.println(c);
        Bill bill = new Bill(items);
        bill.setLocalDate(LocalDate.now());
        LocalDate localDate = bill.getLocalDate();
        System.out.println("Ngay xuat bill: " + localDate);
        System.out.println("Tong so tien trong bill la:");
        double d = bill.getItemsPrice();
        System.out.println(d);
    }
}
