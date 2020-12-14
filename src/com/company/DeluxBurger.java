package com.company;

public class DeluxBurger extends Hamburger {
    public DeluxBurger() {
        super("Delux", "sausage", 14.54, "white");
        super.addHamburgerAdditional1("chips", 2.75);
        super.addHamburgerAdditional2("drinks", 1.18);
    }

    @Override
    public void addHamburgerAdditional1(String name, double price) {
        System.out.println("Cannot add additional items to delux burger");
    }

    @Override
    public void addHamburgerAdditional2(String name, double price) {
        System.out.println("Cannot add additional items to delux burger");
    }

    @Override
    public void addHamburgerAdditional3(String name, double price) {
        System.out.println("Cannot add additional items to delux burger");
    }

    @Override
    public void addHamburgerAdditional4(String name, double price) {
        System.out.println("Cannot add additional items to delux burger");
    }
}
