package models;

public class BallPointPen extends Pen implements Refillable {

    private Refill refill;
    public BallPointPen(String name, String brandName, int price, Refill refill) {
        super(name, brandName, price, PenType.BALLPONT);
        this.refill = refill;
    }

    @Override
    public void write() {
        System.out.println("Ballpoint pen writing");
    }

    @Override
    public void open() {
        System.out.println("opening ballpoint pen using cap");
    }

    @Override
    public void close() {
        System.out.println("closing ballpoint pen using cap");
    }

    @Override
    public void changeRefill() {
        System.out.println("Changed ballpoint pen refill");
    }
}
