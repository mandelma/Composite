package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Computer implements Hardware {
    private List<Hardware> components = new ArrayList<>();

    public Computer () {

    }

    public void add(Hardware hw) {
        components.add(hw);
    }

    public List<Hardware> getHardware () {

        return components;
    }

    public double totalPrice () {
        double result = 0;

        for (Hardware hardware : components) {
            result += hardware.getPrice();
        }
        return result;
    }

    @Override
    public double getPrice() {

        return totalPrice();
    }

    @Override
    public void print() {
        Iterator<Hardware> it = components.iterator();

        while(it.hasNext())  {
            Hardware hw = it.next();
            hw.print();
        }
    }

}



