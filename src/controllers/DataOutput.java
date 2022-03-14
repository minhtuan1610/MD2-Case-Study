package controllers;

public class DataOutput {
    DataInput dataInput = new DataInput();

    public DataOutput() {
    }

    public void displayMenu() {
        System.out.println("Menu");
        System.out.println("1. Display the list of coffee beans");
        System.out.println("2. Add new bean");
        System.out.println("3. Edit bean");
        System.out.println("4. Delete bean");
        System.out.println("5. Print Bill");
        System.out.println("6. Save bean & bill");
        System.out.println("0. Exit");
        System.out.println("Enter the corresponding number:");
    }

    public void backToMenu() {
        System.out.println("Type 'back' to the menu");
        dataInput.getNothingInputFromUser();
    }
}
