package OOP;

public class Polymorphism_example {
    boolean isThere = false;
    String firstName = "John";
    String lastName = "Doe";
    public void present(){
        if(isThere) {
            System.out.println(firstName + " " + lastName + " is present at lesson");
        } else {
            System.out.println(firstName + " " +  lastName + " isn't present at lesson");
        }
    }
}
