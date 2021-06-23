class Box3 {
    double height;
    double weight;
    double width;

    void volume()
    {
        System.out.println("Volume is : "+ (height*weight*width));
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();

        mybox1.height = 10;
        mybox1.weight = 12;
        mybox1.width = 5;

        mybox2.height = 8;
        mybox2.weight = 15;
        mybox2.width = 6;

        mybox1.volume();
        mybox2.volume();
    }
}
