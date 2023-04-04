package OOP;

public class Student2 extends Polymorphism_example {
    boolean isThere2 = true;
    String firstNameStudent2 = "Ion";
    String lastNameStudent2 = "Dreglea";
    public void present(){
        if(isThere2) {
            System.out.println(firstNameStudent2 + " " + lastNameStudent2 + " is present at lesson");
        } else {
            System.out.println(firstNameStudent2 + " " +  lastNameStudent2 + " isn't present at lesson");
        }
    }
}
