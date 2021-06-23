class Box {
    double height;
    double weight;
    double width;
}

class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.height = 10;
        mybox.width = 5;
        mybox.weight = 20;

        vol = mybox.height * mybox.width * mybox.weight;

        System.out.println("volume is:" + vol);
    }
}
