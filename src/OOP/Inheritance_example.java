package OOP;

public class Inheritance_example {
    public int age = 15;
    public String firstName = "Ion";
    public void newMethod(){
        System.out.print(firstName + " are " + age + " ani\n");
    }
    public Inheritance_example() {
        ///Sorry. No body!
    }

    public Inheritance_example(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }
    public static class Child extends Inheritance_example {
        Inheritance_example elev1 = new Inheritance_example(35, "Miguel");
        public void addNew() {
            Inheritance_example elev2 = new Inheritance_example(20, "Alexandru");
            elev2.newMethod();
        }
    }
}
