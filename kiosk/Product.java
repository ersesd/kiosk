package kiosk;

import java.util.ArrayList;

public class Product extends Menu {
    double price;

    public Product(String name, String explain, double price) {
        super(name, explain);
        this.price = price;
    }

    public Product() {

    }


    public double getPrice() {
        return price;
    }

    @Override
    public void Showkiosk() {
        System.out.println(getName() + "  / " + getPrice() + "원 / " + getExplain());
    }

}
