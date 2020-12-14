package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAdditional1("tomato", 0.27);
        hamburger.addHamburgerAdditional2("lettuce", 0.75);
        hamburger.addHamburgerAdditional3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealtyBurger healtyBurger = new HealtyBurger("bacon", 5.67);
        healtyBurger.addHealthyAddition1("egg", 5.43);
        healtyBurger.addHealthyAddition1("Lentils",3.41);
        System.out.println("Total Healthy hamburger Price is " +  healtyBurger.itemizeHamburger());

        DeluxBurger deluxBurger = new DeluxBurger();
        deluxBurger.addHamburgerAdditional3("should not do this", 50.53);
        deluxBurger.itemizeHamburger();
    }
}
