package controllers;

import models.coffeeCategory.CoffeeGroup;

import java.util.List;

public class CoffeeBeanManager {
    public CoffeeBeanManager() {
    }

    public void displayBeanInfo(List<CoffeeGroup> coffeeGroupList) {
        for (CoffeeGroup i : coffeeGroupList
        ) {
            System.out.println(i);
        }
    }

    public void addBean() {

    }

    public void editBeanByName() {

    }

    public void deleteBeanByName() {

    }

    public void searchBeanByChar() {

    }
}
