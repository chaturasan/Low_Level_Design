package models;

public abstract class Pen implements Writable{
    private String name;
    private String brandName;
    private int price;

    private PenType penType;

    public Pen(String name, String brandName, int price, PenType penType) {
        this.name = name;
        this.brandName = brandName;
        this.price = price;
        this.penType = penType;
    }

    public abstract void open();
    public abstract void close();

    public String getName() {
        return name;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getPrice() {
        return price;
    }

    public PenType getPenType() {
        return penType;
    }
}
