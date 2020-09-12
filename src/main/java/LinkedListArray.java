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

}
