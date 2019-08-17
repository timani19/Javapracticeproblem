package inToJavaProgramming;

public class VariablesTypes {
    static String gender = "Male"; // this is class or static variable
    // static variable is Independent. Anyone can access this variable inside class  creating an object

    double salary = 80000.00;   // instance variable can access from any method and constructors
    // we can access this variable inside a method by creating a object for this class VariableTypes

    // local variable [ we define local variables w/in any method, constructor or block
    // we can not access the local variable outside a method
    // do net get default value, we have to initialize a value, cannot write int age;

    public static void main(String[] args) {
        int age = 2;  // local variable
        String name = "Ashaz";
        System.out.println("My name is" + " " + name + " " + "and my age is" + " " +age); // giving "" will leave a space in words.
        VariablesTypes obj1=new VariablesTypes(); // created object for VariableTypes class
        System.out.println("My salary is " + " " + obj1.salary); // calling instance variable Salary
        System.out.println(VariablesTypes.gender); // calling static variable gender directly, no need to create object



    }

}
