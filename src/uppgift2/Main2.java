package uppgift2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Car car;
        boolean minBool = true;
        List<Car> cars = new ArrayList<>();

        CarFactory carFactory = new CarFactory();
        Scanner scan = new Scanner(System.in);
        while (minBool) {
            System.out.printf("What kind of car do you want to create?%nElectric/Gas/Disel/Hybrid%nIf you want to quit? Just press Enter%n");
            String kindOfCar = scan.nextLine();
            if (kindOfCar.equals("")) {
                System.out.println("Thank you");
                minBool = false;
            } else {
                car = carFactory.makeNewCar(kindOfCar);
                if (car == null) {
                    System.out.println("Please try again");
                } else {
                    System.out.println("You have created: " + car);
                    System.out.printf("Would you like to save this to your list?%nY/N%n");
                    String yN = scan.nextLine();
                    if (yN.equals("Y") || yN.equals("y")||yN.equals("Yes")||yN.equals("yes")) {
                        cars.add(car);
                    } else {
                        System.out.println("You did not select Yes, your car has been destroyed! Lets create a new car!");
                    }
                }
            }
        }
        if(cars.size()>0){
            System.out.print("You have saved ");
            cars.forEach(x -> System.out.println(x.toString()));
            System.out.println("Well done!");
        }else{
            System.out.println("Next time, try to make a car!");
        }
    }
}
