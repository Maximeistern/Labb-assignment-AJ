package uppgift2;

public abstract class Car {

    private final Brand brand;
    private final BaseColor color;

    public Car(Brand brand, BaseColor color){
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return ", Brand = " + brand +
                ", Color = " + color;
    }
}
