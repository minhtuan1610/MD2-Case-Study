package views;

import controllers.CoffeeBeanManager;
import controllers.DataInput;
import models.bill.Bill;
import models.bill.Items;
import models.coffeeCategory.*;
import models.qualityOfBean.BeanQuality;

import java.util.LinkedList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        LinkedList<CoffeeGroup> coffeeGroupList = new LinkedList<>();
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
        String nameInputFromUser = dataInput.getNameInputFromUser();
        Scanner inputChoice = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Display the list of coffee beans");
            System.out.println("2. Add new bean");
            System.out.println("3. Edit bean");
            System.out.println("4. Delete bean");
            System.out.println("5. Print Bill");
            System.out.println("0. Exit");
            choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    beanManager.displayBeanInfo();
                    break;
                case 2:
                    newBean = dataInput.setBeanInfo();
                    beanManager.addBean(newBean);
                case 3:
                    beanManager.editBeanByName();
                    break;
                case 4:
                    beanTarget = beanManager.getBeanByName(nameInputFromUser);
                    beanManager.deleteBeanByName(beanTarget);
                    break;
                case 5:
                    double quantity = dataInput.getAmountOfRoastedCoffee();
                    double numberOfShot = dataInput.getNumberOfCoffeeShot();
                    beanTarget = beanManager.getBeanByName(nameInputFromUser);
                    Items items = new Items(beanTarget, quantity, numberOfShot);
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
