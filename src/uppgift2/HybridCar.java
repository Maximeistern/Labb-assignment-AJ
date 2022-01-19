package uppgift2;

public class HybridCar extends Car{
    private final consumerCar sort;

    public HybridCar(Brand brand, BaseColor color, consumerCar hybrid){
        super(brand, color);
        this.sort = hybrid;

    }
    @Override
    public String toString() {
        return "An "+ sort+"-car" + super.toString();
    }
}
