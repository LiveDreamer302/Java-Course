package controlFlow;
import OOP.*;


public class Trying {
    public static void main(String[] args) {
//============Inheritance==========//
        Inheritance_example.Child student = new Inheritance_example.Child();
        student.addNew();
        System.out.println(student.age);
//============Encapsulation==========//
   Encapsulation_example MAIB = new Encapsulation_example();
   int oldPin = MAIB.getCardPin();
   System.out.print("Your old PIN was : " + oldPin);
   int newPin = 1234;
   MAIB.setCardPin(newPin);
   System.out.println("\nYour new PIN is :  " + MAIB.getCardPin());
//============Abstraction==========//
        UTC2 displayMyDate = new UTC2();
        displayMyDate.displayTime();
//============Polymorphism==========//
 Polymorphism_example general = new Polymorphism_example();
 Polymorphism_example student1 = new Student1();
 Polymorphism_example student2 = new Student2();
 general.present();
 student1.present();
 student2.present();
    }
    }
