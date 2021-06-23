class Product {
    String pcode;
    String pname;
    double price;

    Product(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    String FindLowestPrice(Product p1, Product p2) {
        if (p1.price < p2.price && p1.price < price)
            return p1.pname;
        if (p2.price < p1.price && p2.price < price)
            return p2.pname;
        else
            return pname;
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("P1", "SOAP", 45);
        Product p2 = new Product("P2", "PEN", 10);
        Product p3 = new Product("P3", "BOOK", 25);

        String lname;

        lname = p3.FindLowestPrice(p1, p2);

        System.out.println("\nProduct having lowest price is : " + lname + "\n");

    }
}
