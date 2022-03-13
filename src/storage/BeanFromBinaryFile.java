package storage;

import controllers.CoffeeBeanManager;
import models.coffeeCategory.CoffeeGroup;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class BeanFromBinaryFile implements CoffeeBeanData {
    public static final String SAVE_PATH = "src/storage/bean.dat";

    @Override
    public LinkedList<CoffeeGroup> readFile() {
        FileInputStream fis = null;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream(SAVE_PATH);
        } catch (FileNotFoundException e) {
            System.err.println("File is not initialized");
            try {
                fis.close();
            } catch (IOException er) {
                er.printStackTrace();
            }
            return new LinkedList<>();
        }
        try {
            ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            LinkedList<CoffeeGroup> coffeeGroupList = (LinkedList<CoffeeGroup>) result;
            ois.close();
            fis.close();
            return coffeeGroupList;
        } catch (IOException e) {
            System.err.println("Cannot close file");
        } catch (ClassNotFoundException er) {
            er.printStackTrace();
        }
        return new LinkedList<>();
    }

    @Override
    public void writeFile(LinkedList<CoffeeGroup> savedList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(SAVE_PATH);
        } catch (FileNotFoundException e) {
            System.err.println("File is not initialized, created new one");
            writeFile(savedList);
            return;
        }
        try {
            oos = new ObjectOutputStream(fos);
            oos.writeObject(savedList);
            oos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
