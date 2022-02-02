package uppgift4;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        pirmeNumberChecker firstHalf = new pirmeNumberChecker(0, 350_000);
        pirmeNumberChecker secondHalf = new pirmeNumberChecker(350_000, 500_000);


        System.out.println("Do you want to run all threads at the same time? Y/N");
        String s = scan.nextLine();
        if (s.equalsIgnoreCase("y")){
            firstHalf.start();
            secondHalf.start();
        }else if(s.equalsIgnoreCase("n")){
            firstHalf.start();
            secondHalf.run();
        }else{
            System.out.println("Please try again, restart the program!");
        }


    }
}
