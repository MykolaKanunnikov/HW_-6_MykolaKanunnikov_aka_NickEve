package education.cursor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Task 1
        List<Integer> container = new ArrayList<>();
        container.add(3);
        container.add(9);
        container.add(11);
        container.add(18);
        container.add(20);
        container.add(22);

        container.removeIf(i -> i % 3 == 0);
        System.out.println("1. Only values divisible by 3: " + container);

        //Task 2
        List<String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("grapefruit");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("orange");

        if (!fruits.contains("orange")) {
            System.out.println("2. Value is not present");
        } else {
            for (int i = fruits.indexOf("orange");
                 i >= 0;
                 i = fruits.indexOf("orange")) {
                fruits.set(fruits.indexOf("orange"), "grapefruit");
            }
            System.out.println("2. Orange replaced to grapefruit (if any): " + fruits);
        }

        //Task 3
        List<Integer> data1 = new ArrayList<>();
        data1.add(0, 1234);
        data1.add(1, 3452);
        data1.add(2, 4623);
        data1.add(3, 6423);
        data1.add(4, 1536);

        List<Integer> data2 = new ArrayList<>();
        data2.add(0, 1536);
        data2.add(1, 7777);
        data2.add(2, 1111);
        data2.add(3, 4623);
        data2.add(4, 3333);

        data1.retainAll(data2);
        System.out.println("3. Similar elements of two ArrayLists: " + data1);

    }
}