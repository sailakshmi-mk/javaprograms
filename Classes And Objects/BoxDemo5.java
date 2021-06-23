class Box5 {
    double height;
    double depth;
    double width;

    double volume()
    {
        return height * depth * width;
    }

    void SetDim(double h, double w, double d){
        height = h;
        depth = d;
        width = w;
    }
}

public class BoxDemo5 {
    public static void main(String[] args){
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();

        double vol;

        mybox1.SetDim(10, 8, 5);

        vol = mybox1.volume();

        System.out.println("Volume is : "+ vol);

        mybox2.SetDim(9, 6, 8);

        vol = mybox2.volume();

        System.out.println("Volume is : "+ vol);
    }
    
}
