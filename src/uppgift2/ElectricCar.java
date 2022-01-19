package uppgift2;

public class ElectricCar extends Car{


    private final consumerCar sort;

    public ElectricCar(Brand brand, BaseColor color, consumerCar electric){
        super(brand, color);
        this.sort = electric;

    }

    @Override
    public String toString() {
        return "An "+ sort+"-car" + super.toString();
    }
}
