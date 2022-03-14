package views;

import controllers.BillManager;
import controllers.CoffeeBeanManager;
import controllers.DataInput;
import controllers.DataOutput;
import models.bill.Bill;
import models.bill.Items;
import models.coffeeCategory.*;
import models.qualityOfBean.BeanQuality;
import storage.ItemsFromBinaryFile;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class Client {
    public static LinkedList<CoffeeGroup> coffeeGroupList = CoffeeBeanManager.savedCoffeeList;
    public static LinkedList<CoffeeGroup> billList = BillManager.savedBillList;

    public static void main(String[] args) {
        final int MENU_CHOICE = -1;
        int choice = MENU_CHOICE;
        CoffeeGroup geisha = new EthiopianLandrace("Geisha", BeanQuality.EXCEPTIONAL);
        CoffeeGroup nayarita = new F1Hybrids("Nayarita", BeanQuality.VERY_GOOD);
        CoffeeGroup catuai = new BourbonTypicaGroup("Catuai", BeanQuality.GOOD);
        CoffeeGroup costaRica95 = new Introgressed("Coasta Rica 95", BeanQuality.LOW);
        coffeeGroupList.add(geisha);
        coffeeGroupList.add(nayarita);
        coffeeGroupList.add(catuai);
        coffeeGroupList.add(costaRica95);
        //  Khoi tao doi tuong
        CoffeeBeanManager beanManager = new CoffeeBeanManager();
        CoffeeGroup newBean;
        CoffeeGroup beanTarget;
        DataInput dataInput = new DataInput();
        DataOutput dataOutput = new DataOutput();
        ItemsFromBinaryFile IOtool = new ItemsFromBinaryFile();
        String nameInputFromUser;
        Items items;
        Bill bill;

        while (choice != 0) {
            dataOutput.displayMenu();
            Scanner inputChoice = new Scanner(System.in);
            choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    beanManager.displayBeanInfo();
                    break;
                case 2:
                    newBean = dataInput.setNewBeanInfo();
                    beanManager.addBean(newBean);
                case 3:
                    nameInputFromUser = dataInput.getNameInputFromUser();
                    beanManager.editBeanByName(nameInputFromUser);
                    break;
                case 4:
                    System.out.println("Enter name of bean to delete:");
                    nameInputFromUser = dataInput.getNameInputFromUser();
                    beanTarget = beanManager.getBeanByName(nameInputFromUser);
                    beanManager.deleteBeanByName(beanTarget);
                    break;
                case 5:
                    System.out.println("Enter name of bean for your order:");
                    nameInputFromUser = dataInput.getNameInputFromUser();
                    System.out.println("Enter the quantity of roasted coffee (per 100 gram):");
                    double quantity = dataInput.getAmountOfRoastedCoffee();
                    System.out.println("Enter the number of coffee shot:");
                    double numberOfShot = dataInput.getNumberOfCoffeeShot();
                    beanTarget = beanManager.getBeanByName(nameInputFromUser);
                    items = new Items(beanTarget, quantity, numberOfShot);
                    bill = new Bill(items);
                    bill.setLocalDate(LocalDate.now());
                    System.out.println("Date: " + bill.getLocalDate());
                    System.out.println("Total: " + bill.getItemsPrice() + " VND");
                    break;
                case 6:
                    IOtool.writeFile(CoffeeBeanManager.getPath_bean(), coffeeGroupList);
                    IOtool.writeFile(BillManager.getPath_bill(), billList);
                    break;
                case 0:
                    System.exit(0);
            }
            dataOutput.backToMenu();
        }
    }
}
