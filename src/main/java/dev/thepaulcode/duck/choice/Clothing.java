package dev.thepaulcode.duck.choice;

public class Clothing implements Comparable<Clothing>{
    // Attributes
    private String description;
    private Double price;
    private String size = "M";
    public final static Double MIN_PRICE = 10.0;
    public static final Double TAX = 0.2;
    private Customer customer;
    // Encapsulation

    public Clothing(String description, Double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize;
    }


    // Getters and Setters

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {

       // price = price + (price * (TAX));
        return price;
    }

    public void setPrice(Double price) {

        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return getDescription() + ", " + getSize() + ", " + getPrice();

    }

    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }
}
