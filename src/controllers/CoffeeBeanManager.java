package controllers;

import models.coffeeCategory.*;
import models.qualityOfBean.BeanQuality;
import storage.ItemsFromBinaryFile;

import java.util.LinkedList;
import java.util.Scanner;

public class CoffeeBeanManager {
    public static ItemsFromBinaryFile coffeeReader = new ItemsFromBinaryFile();
    private static String path_bean = ItemsFromBinaryFile.SAVE_PATH_BEAN;
    public static LinkedList<CoffeeGroup> savedCoffeeList = coffeeReader.readFile(path_bean);
    //    public static LinkedList<CoffeeGroup> savedCoffeeList = new LinkedList<>();
    DataInput dataInput = new DataInput();

    public CoffeeBeanManager() {
    }

    public static String getPath_bean() {
        return path_bean;
    }

    public void displayBeanInfo() {
        for (CoffeeGroup i : savedCoffeeList
        ) {
            System.out.println(i);
        }
    }

    public void addBean(CoffeeGroup newBean) {
        savedCoffeeList.add(newBean);
    }

    public CoffeeGroup getBeanByName(String name) {
        CoffeeGroup beanName = null;
        for (CoffeeGroup i : savedCoffeeList
        ) {
            if (i.getName().equals(name)) {
                beanName = i;
            }
        }
        return beanName;
    }

    public void deleteBeanByName(CoffeeGroup bean) {
        savedCoffeeList.remove(bean);
    }

    public void searchBeanByChar() {

    }

    public void editBeanByName(String name) {
        for (CoffeeGroup i : savedCoffeeList
        ) {
            if (i.getName().equals(name)) {
                String newName = dataInput.getNameInputFromUser();
                i.setName(newName);
                System.out.println("Which new quality of the bean do you choose?");
                System.out.println("1. Exceptional");
                System.out.println("2. Very good");
                System.out.println("3. Good");
                System.out.println("4. Low");
                Scanner inputNumberQuality = new Scanner(System.in);
                int numberQuality = inputNumberQuality.nextInt();
                switch (numberQuality) {
                    case 1:
                        i.setQuality(BeanQuality.EXCEPTIONAL);
                        break;
                    case 2:
                        i.setQuality(BeanQuality.VERY_GOOD);
                        break;
                    case 3:
                        i.setQuality(BeanQuality.GOOD);
                        break;
                    case 4:
                        i.setQuality(BeanQuality.LOW);
                        break;
                }
            }
        }
    }
}
