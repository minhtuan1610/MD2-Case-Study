package storage;

import models.coffeeCategory.CoffeeGroup;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public interface CoffeeBeanData {
    LinkedList<CoffeeGroup> readFile(String path);

    void writeFile(String path, LinkedList<CoffeeGroup> savedList);
}
