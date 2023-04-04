package OOP;

import java.util.Date;

public class UTC2 extends  Abstraction_example{

    @Override
    public void displayTime() {
        Date myDate = new Date();
        System.out.println(myDate.toString());
    }
}