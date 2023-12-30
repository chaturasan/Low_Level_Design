package models;

public class GellPen extends Pen implements Refillable {
    private Refill refill;

    public GellPen(String name, String brandName, int price, Refill refill) {
        super(name, brandName, price, PenType.GELL);
        this.refill = refill;
    }


    @Override
    public void open() {
        System.out.println("Opening Gell pen using cap");
    }

    @Override
    public void close() {
        System.out.println("Closing Gell pen using cap");
    }

    @Override
    public void write() {
        System.out.println("Gell pen writing");
    }

    @Override
    public void changeRefill() {
        System.out.println("Changed Gell refill");
    }
}
