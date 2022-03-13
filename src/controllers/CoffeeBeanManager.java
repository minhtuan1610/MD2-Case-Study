package controllers;

import models.coffeeCategory.*;
import models.qualityOfBean.BeanQuality;
import storage.BeanFromBinaryFile;
import storage.CoffeeBeanData;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CoffeeBeanManager {
    private static CoffeeBeanData coffeeBeanData = new BeanFromBinaryFile();
    public static LinkedList<CoffeeGroup> savedCoffeeList = coffeeBeanData.readFile();

    public CoffeeBeanManager() {
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

    public void editBeanByName() {

    }


}
