package dev.thepaulcode.duck.choice;

import java.util.Arrays;

public class ShopApp {
    public static void main(String[] args) {

        Double tax = 0.2;
        Double total = 0.0;

        Customer customer1 = new Customer("Paulo Santos", 3);

        System.out.println("Min_Price " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 12.6, "S");
        Clothing item2 = new Clothing("Orange T-Shirt", 12.6, "M");
        Clothing item3 = new Clothing("Green Scarf", 25.0, "L");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.99, "XL");

        Clothing[] items = {item1, item2, item3, item4};

        System.out.println("Customer size: " + customer1.getSize());

        customer1.addItems(items);
        customer1.getTotalClothingCost();
        System.out.println("Customer is " + customer1.getName() + ", " + customer1.getSize() + ", " + customer1.getTotalClothingCost().floatValue());
        // Calculate total amount when Customer size is equal to the clothe size
        int avarage = 0;
        int count = 0;
        for(Clothing c : customer1.getItems()) {
            if (c.getSize().equals("L")) {
                count++;
                avarage += c.getPrice();
            }
            //System.out.println("Items " + c.getDescription());
            System.out.println("Item " + c);
        }
        try {
            avarage = (count == 0) ? 0 : avarage/count;
            avarage = avarage / count;
            System.out.println("Avarage price " + avarage + ", Count " + count);

        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero.");

        }
        Arrays.sort(customer1.getItems());
        for(Clothing item : customer1.getItems()){
            System.out.println("Item output " + item); // 8-2
        }

    }
}