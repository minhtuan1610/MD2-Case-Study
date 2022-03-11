package models.bill;

import java.time.LocalDate;

public class Bill {
    private LocalDate localDate;
    private Items items;

    public Bill() {
    }

    public Bill(Items items) {
        this.items = items;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public double getItemsPrice() {
        double total;
        total = items.getPriceByRoastedCoffee() + items.getPriceByCoffeeShot();
        return total;
    }
}
