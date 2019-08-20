package inheritance;

public class Main {
    public static void main(String[] args) {
        Child child1=new Child();
        child1.setHeight(6.2);
        System.out.println(child1.getHeight());
        child1.setFamilyName("Imani");
        System.out.println(child1.getFamilyName());
    }
}
