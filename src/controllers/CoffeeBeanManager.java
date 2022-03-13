package controllers;

import models.coffeeCategory.*;
import models.qualityOfBean.BeanQuality;
import storage.BeanFromBinaryFile;
import storage.CoffeeBeanData;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CoffeeBeanManager {
    private static CoffeeBeanData coffeeBeanData = new BeanFromBinaryFile();
    private static List<CoffeeGroup> savedCoffeeList = coffeeBeanData.readFile();

    public CoffeeBeanManager() {
    }

    public void displayBeanInfo() {
        for (CoffeeGroup i : savedCoffeeList
        ) {
            System.out.println(i);
        }
    }

    public CoffeeGroup setBeanInfo() {
        CoffeeGroup beanInfo = null;
        BeanQuality beanQuality = null;
        System.out.println("Enter name of coffee bean:");
        Scanner inputBeanName = new Scanner(System.in);
        String beanName = inputBeanName.nextLine();
        System.out.println("Which quality of the bean do you choose?");
        System.out.println("1. Exceptional");
        System.out.println("2. Very good");
        System.out.println("3. Good");
        System.out.println("4. Low");
        Scanner inputNumberQuality = new Scanner(System.in);
        int numberQuality = inputNumberQuality.nextInt();
        switch (numberQuality) {
            case 1:
                beanQuality = BeanQuality.EXCEPTIONAL;
                break;
            case 2:
                beanQuality = BeanQuality.VERY_GOOD;
                break;
            case 3:
                beanQuality = BeanQuality.GOOD;
                break;
            case 4:
                beanQuality = BeanQuality.LOW;
                break;
        }
        System.out.println("Choose the coffee group:");
        System.out.println("1. Ethiopian Landrace");
        System.out.println("2. F1 Hybrids");
        System.out.println("3. Bourbon-Typica Group");
        System.out.println("4. Introgressed");
        Scanner inputBeanGroup = new Scanner(System.in);
        int beanGroup = inputBeanGroup.nextInt();
        switch (beanGroup) {
            case 1:
                beanInfo = new EthiopianLandrace(beanName, beanQuality);
                break;
            case 2:
                beanInfo = new F1Hybrids(beanName, beanQuality);
                break;
            case 3:
                beanInfo = new BourbonTypicaGroup(beanName, beanQuality);
                break;
            case 4:
                beanInfo = new Introgressed(beanName, beanQuality);
                break;
        }
        return beanInfo;
    }

    public void addBean(CoffeeGroup newBean) {
        savedCoffeeList.add(newBean);
        try {
            coffeeBeanData.writeFile(savedCoffeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteBeanByName(CoffeeGroup bean) {
        savedCoffeeList.remove(bean);
        try {
            coffeeBeanData.writeFile(savedCoffeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void searchBeanByChar() {

    }

    public void editBeanByName() {

    }


}
