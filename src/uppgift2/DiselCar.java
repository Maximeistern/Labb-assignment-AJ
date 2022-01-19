package uppgift2;

public class DiselCar extends Car{
    private final consumerCar sort;
    public DiselCar(Brand brand, BaseColor color, consumerCar disel){
        super(brand, color);
        this.sort = disel;
    }
    @Override
    public String toString() {
        return "An "+ sort+"-car" + super.toString();
    }
}
