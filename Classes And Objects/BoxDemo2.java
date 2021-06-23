class Box1 {
    double height;
    double weight;
    double width;
}

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        mybox1.height = 10;
        mybox1.weight = 12;
        mybox1.width = 5;

        vol = mybox1.height * mybox1.width * mybox1.weight;

        System.out.println("\nVolume of first object is " + vol);

        mybox2.height = 8;
        mybox2.weight = 15;
        mybox2.width = 6;

        vol = mybox2.height * mybox2.width * mybox2.weight;

        System.out.println("Volume of second object is " + vol + "\n");
    }
}
