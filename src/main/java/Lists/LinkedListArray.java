package Lists;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListArray {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.addFirst("first");

        cars.addLast("last");
        System.out.println(cars);
        cars.removeFirst();
        cars.removeLast();
        cars.getFirst();
        cars.getLast();
        System.out.println(cars);

    }
    @Test(priority = 1,groups = "toTest")
    public static void printonly()
    {
        System.out.println("in linkedlist");
    }

}
