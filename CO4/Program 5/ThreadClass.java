import java.util.*;

class MultiplicationTable extends Thread {

    @Override
    public void run() {
        System.out.println("\nMultiplication table of 5 is : \n");
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "*5 = " + (i * 5));
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class primeNumbers extends Thread {
    int limit;
    Scanner read = new Scanner(System.in);

    primeNumbers(Scanner read) {
        System.out.print("\nEnter the limit for prime numbers: ");
        limit = read.nextInt();
    }

    @Override
    public void run() {
        System.out.println("\nThe prime numbers upto " + limit + " is : \n");
        try {
            for (int i = 2, count = 1; count <= limit; i++) {
                int flag = 0;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(i);
                    count += 1;
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ThreadClass {
    public static void main(String[] ars) {
        Scanner read = new Scanner(System.in);
        MultiplicationTable mObj = new MultiplicationTable();
        primeNumbers pObj = new primeNumbers(read);
        mObj.start();
        pObj.start();
    }
}
