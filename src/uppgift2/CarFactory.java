package uppgift2;
import java.util.Random;

public class CarFactory {
    public Car makeNewCar(String carType) {
        Car car = null;

        switch (carType.toLowerCase()) {
            case "electric":
                car = new ElectricCar(Brand.getRandomBrand(), BaseColor.getRandomColor(), consumerCar.Electric);
                break;
            case "gas":
                car = new GasCar(Brand.getRandomBrand(), BaseColor.getRandomColor(), consumerCar.Gas);
                break;
            case "disel":
                car = new DiselCar(Brand.getRandomBrand(), BaseColor.getRandomColor(), consumerCar.Disel);
                break;
            case "hybrid":
                car = new HybridCar(Brand.getRandomBrand(), BaseColor.getRandomColor(), consumerCar.Hybrid);
                break;
            default:
                return null;
        }
        return car;
    }

}

