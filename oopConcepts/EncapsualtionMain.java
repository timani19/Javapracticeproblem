package oopConcepts;

public class EncapsualtionMain {
    public static void main(String[] args) {
        Encapsulation student1= new Encapsulation();
        student1.setStudentName("Imani");
        student1.setStudentID(3998);
        student1.setStudentDOB("08-17-2018");
        System.out.println(student1.getStudentName());
        System.out.println(student1.getStudentID());
        System.out.println(student1.getStudentDOB());
    }
    // if I want to access name, id, dob without creating getter and setter method- will not allow because those are protected data.
}
