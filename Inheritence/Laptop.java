package Inheritence; // single level inheritence

public class Laptop {
    double size;
    String OS;

    public Laptop () {}

    public Laptop(double size, String OS) {
        this.size=size;
        this.OS=OS;
    }

    public void getLaptopSize(double size){
        System.out.println("Laptop Size:" + size);
    }

    public void getLaptopOS (String OS) {
        System.out.println("Laptop OS:" + OS);
    }
}
