import java.util.*;

class FibonacciNums implements Runnable {
    int limit;

    FibonacciNums(Scanner read) {
        System.out.print("\nEnter the range for Fibonacci numbers: ");
        limit = read.nextInt();
    }

    synchronized public void display() {
        System.out.println("\nFibonacci numbers are: ");
        for (int i = 1, j = 1; i <= limit;) {
            System.out.println(i);
            j = i + j;
            i = j - i;
            j = (j - i) + i;
        }
    }

    @Override
    public void run() {
        display();
    }
}

class evenNums implements Runnable {
    int limit;

    evenNums(Scanner read) {
        System.out.print("\nEnter the limit for generating even numbers: ");
        limit = read.nextInt();
    }

    synchronized public void display() {
        System.out.println("\nThe Even numbers upto " + limit + " is : ");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    @Override
    public void run() {
        display();
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        evenNums eObj = new evenNums(read);
        FibonacciNums fObj = new FibonacciNums(read);
        Thread t1 = new Thread(eObj);
        Thread t2 = new Thread(fObj);
        t1.start();
        t2.start();
    }
}
