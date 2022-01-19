package uppgift2;
import java.util.Random;

public class CarFactory {
    public Car makeNewCar(String carType) {


        Car car = null;
        switch (carType) {
            case "Electric", "electric":
                car = new ElectricCar(Brand.getRandomBrand(), BaseColor.getRandomColor(), consumerCar.Electric);
                break;
            case "Gas", "gas":
                car = new GasCar(Brand.getRandomBrand(), BaseColor.getRandomColor(), consumerCar.Gas);
                break;
            case "Disel", "disel":
                car = new DiselCar(Brand.getRandomBrand(), BaseColor.getRandomColor(), consumerCar.Disel);
                break;
            case "Hybrid","hybrid":
                car = new HybridCar(Brand.getRandomBrand(), BaseColor.getRandomColor(), consumerCar.Hybrid);
                break;
            default:
                return null;
        }
        return car;
    }

}

