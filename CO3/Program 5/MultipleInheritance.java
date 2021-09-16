import java.util.Scanner;

interface Student{
    public void Details(Scanner read);
    public void AcademicScore(Scanner read);
}

interface Sports{
    public void SportsScore(Scanner read);
}

class Result implements Student,Sports{
    String SName;
    int RollNo,Max,Mark,SportScore;
    Result(Scanner read){
        Details(read);
        AcademicScore(read);
        SportsScore(read);
    }
    public void Details(Scanner read){
        System.out.print("Enter Student Name : ");
        SName=read.nextLine();
        System.out.print("Roll number of the student : ");
        RollNo= Integer.parseInt(read.nextLine());
    }
    public void AcademicScore(Scanner read){
        System.out.print("Enter the Maximum mark : ");
        Max= read.nextInt();
        System.out.print("Enter the mark optained : ");
        Mark = read.nextInt();
    }
    public void SportsScore(Scanner read){
        System.out.print("Enter the sports score : ");
        SportScore=read.nextInt();
    }
    void Display(){
        System.out.println("\n___________________________________");
        System.out.println("\nName of the Student : "+ SName);
        System.out.println("Roll number of the Student : "+ RollNo);
        System.out.println("Mark optained ("+Max+") : "+Mark);
        System.out.println("Mark optained Sports (100): "+ SportScore);
        System.out.println("___________________________________\n");
    }
}

public class MultipleInheritance {
    public static void main(String arg[]){
        Scanner read = new Scanner(System.in);
        Result r = new Result(read);
        r.Display();
    }
}
