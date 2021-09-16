import java.util.*;

class NegativeNumberException extends Exception {
    public String toString() {
        return "*Please enter a non negative number!!!";
    }
}

class Calculate {
    Double Total = 0.0;
    int value, num = 0;

    Calculate(Scanner read, int limit) {
        System.out.println("Enter the Numbers: ");
        for (int i = 0; i < limit; i++) {
            try {
                value = read.nextInt();
                if (value < 0) {
                    throw new NegativeNumberException();
                }
                Total = Total + value;
                num += 1;
            } catch (NegativeNumberException e) {
                System.out.println("\tException: " + e);
            }

        }
    }

    void Avarage() {
        System.out.println("The average of positive numbers entered is : " + (Total / num));
    }
}

public class PositiveIntegersAvg {
    public static void main(String[] args) {
        int limit;
        Scanner read = new Scanner(System.in);
        System.out.print("\nEnter the limit: ");
        limit = read.nextInt();
        Calculate CObj = new Calculate(read, limit);
        CObj.Avarage();

    }
}
