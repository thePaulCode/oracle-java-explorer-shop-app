package dev.thepaulcode.duck.choice;

public class Customer {

    // Attributes
    private String name;
    private String size;
    private Clothing[] items;
    private int measuremente;

    public Customer(String name, int measuremente){
        this.name = name;
        setSize(measuremente);
    }
    public void addItems (Clothing[] clothing){
        items = clothing;
    }

    public Clothing[] getItems(){
        return items;
    }

    public Double getTotalClothingCost(){
        Double total = 0.0;
        for(Clothing c : items){

        //    if(customer1.getSize().equals(c.getSize())){
                total = total + c.getPrice();
             //   System.out.println("Clothing item: " + c);
            //   total =total + (total * tax);
            //    if(total > 55){break;}
           // }
        }
        return total;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getSize() {
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }
    public void setSize(int measure) {

        switch (measure) {
            case 1, 2, 3:
                setSize("S");
                break;
            case 4, 5, 6:
                setSize("M");
                break;
            case 7, 8, 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
