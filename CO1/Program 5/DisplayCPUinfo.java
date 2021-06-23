Create CPU with attribute price. 
Create inner class Processor 
(no. of cores, manufacturer)
and static nested class RAM 
(memory, manufacturer). Create
 an object of CPU and print
information of Processor and RAM.
''''''''''''''''''''''''''''''''''
  
  import java.util.Scanner;

class CPU {
    double price;

    CPU(double price) {
        this.price = price;
    }

    class Processor {
        int no_of_cores;
        String manufacturer;

        void processorDetails(Scanner read) {
            System.out.print("Enter no.of cores in processor:");
            no_of_cores = read.nextInt();
            read.nextLine();
            System.out.print("Enter the manufacturer name:");
            manufacturer = read.nextLine();
        }
        void display(){
            System.out.println("\nProcessor Details");
            System.out.println("__________________");
            System.out.println("\nextLineNo of Cores : "+no_of_cores+"\nManufacturer : "+manufacturer+"\n");
        }
    }

    static class RAM {
        static int memory;
        static String manufacturer;
        static void ramDetails(Scanner read) {
            System.out.print("Enter the size of memory(in GB):");
            memory = read.nextInt();
            read.nextLine();
            System.out.print("Enter the manufacturer name:");
            manufacturer = read.nextLine();
        }
        static void display(){
            System.out.println("Memory Details");
            System.out.println("__________________");
            System.out.println("\nMemory size : "+memory+"GB\nManufacturer : "+manufacturer+"\n");
        }
    }

    void Display(Scanner read){
        Processor p= new Processor();
        p.processorDetails(read);
        RAM.ramDetails(read);
        p.display();
        RAM.display();
    }
}

public class DisplayCpuInfo {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.print("\nEnter the price of the cpu:");
        double price = read.nextDouble();
        CPU c1 = new CPU(price);
        c1.Display(read);
    }
}
