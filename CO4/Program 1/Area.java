import Graphics.*;

public class Area {
    public static void main(String[] args){
        Shape s = new Shape();
        System.out.println("Area of the Rectangle is : "+s.Rectangle(5.0,4.0));
        System.out.println("Area of the Triangle is : "+s.Triangle(4.0,3.0));
        System.out.println("Area of the Circle is : "+s.Circle(4.0));
        System.out.println("Area of the Square is : "+s.Square(4.0));
        
    }
}
