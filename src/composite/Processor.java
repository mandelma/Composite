package composite;

public class Processor extends MotherBoard {
    private double price;
    private String name;

    public Processor () {
        super();
        this.price = 670.70;
        this.name = "processor";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Price of " + name + ": " + getPrice() + " euroa.");
    }
}

