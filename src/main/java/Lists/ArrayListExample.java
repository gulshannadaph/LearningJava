package Lists;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.remove("Volvo");
     //   System.out.println(cars);
       // cars.clear();
        System.out.println(cars.size());
        for(int i=0;i<=2;i++)
        {
            System.out.println(cars.get(i));
        }
        Collections.sort(cars);
        Collections.reverse(cars);
        System.out.println(cars);
    for (String i: cars )
    {
        System.out.println(i);
    }

    }
    @Test(priority = 2)
    @Parameters("myName")
    public static void printonly(String myName)
    {
        System.out.println("in Arraylist");
        System.out.println(myName);
    }
}
