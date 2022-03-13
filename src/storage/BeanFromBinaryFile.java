package storage;

import models.coffeeCategory.CoffeeGroup;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class BeanFromBinaryFile implements CoffeeBeanData {
    public static final String SAVE_PATH = "src/storage/bean.dat";

    @Override
    public List<CoffeeGroup> readFile() {
        try {
            FileInputStream fis = new FileInputStream(SAVE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            List<CoffeeGroup> coffeeGroupList = (List<CoffeeGroup>) result;
            fis.close();
            ois.close();
            return coffeeGroupList;
        } catch (FileNotFoundException e) {
            System.err.println("File is not initialized");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new LinkedList<>();
    }

    @Override
    public void writeFile(List<CoffeeGroup> savedList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(SAVE_PATH);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(savedList);
        } catch (FileNotFoundException e) {
            System.err.println("File is not initialized");
        } catch (IOException e) {
            System.err.println("Writing error");
        } finally {
            assert oos != null;
            oos.close();
            fos.close();
        }
    }
}
