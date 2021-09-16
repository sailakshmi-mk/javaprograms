import java.util.*;

class Shapes{

    void area(float radius){
        System.out.println("Area of the Circle is : "+ (3.14*radius));
    }

    void area(float length, float breadth){
        System.out.println("Area of the Rectangle is : "+ (breadth*length));
    }
    void area(float length, float breadth, float height){
        System.out.println("Area of the Box is : "+ ((2*length*breadth)+(2*length*height)+(2*height*breadth)));
    }

}


public class OverLoading {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        float r,l,b,lbox,bbox,hbox;
        Shapes s=new Shapes();
        System.out.print("Enter the Radius of the circle:");
        r=read.nextFloat();
        s.area(r);
        System.out.println("Enter the length and breadth of the Rectangle:");
        System.out.print("Length : ");
        l=read.nextFloat();
        System.out.print("Breadth : ");
        b=read.nextFloat();
        s.area(l,b);
        System.out.println("Enter the length,height and breadth of the Box:");
        System.out.print("Length : ");
        lbox=read.nextFloat();
        System.out.print("Breadth : ");
        bbox=read.nextFloat();
        System.out.print("Height : ");
        hbox=read.nextFloat();
        s.area(lbox,bbox,hbox);

    }
}
