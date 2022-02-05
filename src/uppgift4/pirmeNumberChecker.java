package uppgift4;

public class pirmeNumberChecker extends Thread {

    int start;
    int end;
    public pirmeNumberChecker(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){
        for (int num = start; num < end; num++) {
            if (isPrimeNum(num)){
                System.out.println(num + " is a prime number");

                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                }
            }
        }
        System.out.println("Thread 1 is done");

    }
    static boolean isPrimeNum(int num){
        if (num <= 1)
            return false;

        else if (num == 2)
            return true;

        else if (num % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
