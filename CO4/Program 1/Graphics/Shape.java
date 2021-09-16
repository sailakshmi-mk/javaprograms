package Graphics;

interface Area{
    public Double Rectangle(Double length,Double breadth);
    public Double Triangle(Double length,Double breadth);
    public Double Circle(Double radius);
    public Double Square(Double side);
}

public class Shape implements Area{
    public Double Rectangle(Double length,Double breadth){
        return length*breadth;
    }
    public Double Triangle(Double length,Double breadth){
        return (0.5*length*breadth);
    }
    public Double Circle(Double radius){
        return (3.14*radius* radius);
    }
    public Double Square(Double side){
        return (side*side);
    }
}
