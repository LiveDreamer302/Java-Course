package OOP;

public class Student1 extends Polymorphism_example {
    boolean isThere1 = true;
    String firstNameStudent1 = "Stefan";
    String lastNameStudent1 = "Manoil";
     public void present(){
          if(isThere1) {
               System.out.println(firstNameStudent1 + " " + lastNameStudent1 + " is present at lesson");
          } else {
               System.out.println(firstNameStudent1 + " " +  lastNameStudent1 + " isn't present at lesson");
          }
     }
}
