package models.bill;

import java.time.LocalDate;

public class Bill {
    private LocalDate localDate;
    private Items items;

    public Bill(Items items) {
        this.items = items;
    }

    public double getItemsPrice() {
        double total;
        total = items.getPriceByRoastedCoffee() + items.getPriceByCoffeeShot();
        return total;
    }
}
