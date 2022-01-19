package uppgift2;

public class GasCar extends Car{
    private final consumerCar sort;

    public GasCar(Brand brand, BaseColor color, consumerCar gas){
        super(brand, color);
        this.sort = gas;

    }
    @Override
    public String toString() {
        return "An "+ sort +"-car" + super.toString();
    }
}
