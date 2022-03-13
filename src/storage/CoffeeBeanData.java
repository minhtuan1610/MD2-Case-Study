package storage;

import models.coffeeCategory.CoffeeGroup;

import java.io.IOException;
import java.util.List;

public interface CoffeeBeanData {
    List<CoffeeGroup> readFile();

    void writeFile(List<CoffeeGroup> savedList) throws IOException;
}
