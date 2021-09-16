import java.util.*;
import Arithmetic.*;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Double Num1, Num2;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        Num1 = read.nextDouble();
        System.out.print("Enter the Second number : ");
        Num2 = read.nextDouble();
        Result rObj = new Result();
        System.out.println("\n(" + Num1+" + "+Num2 + ") = " + rObj.Addition(Num1, Num2));
        System.out.println("(" + Num1+" - "+Num2 + ") = " + rObj.Subtraction(Num1, Num2));
        System.out.println("(" + Num1+" * "+Num2 + ") = " + rObj.Multiplication(Num1, Num2));
        System.out.println("(" + Num1+" / "+Num2 + ") = " + rObj.Division(Num1, Num2));

    }
}
