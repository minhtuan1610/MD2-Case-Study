package controllers;

import models.coffeeCategory.CoffeeGroup;
import storage.ItemsFromBinaryFile;

import java.util.LinkedList;

public class BillManager {
    public static ItemsFromBinaryFile billReader = new ItemsFromBinaryFile();
    private static String path_bill = ItemsFromBinaryFile.SAVE_PATH_BILL;
    public static LinkedList<CoffeeGroup> savedBillList = billReader.readFile(path_bill);

    public BillManager() {
    }

    public static String getPath_bill() {
        return path_bill;
    }

}
