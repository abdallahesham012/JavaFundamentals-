import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // ArrayList is resizable array that stores objects
        // The type of ArrayList is Wrraper Classes
        ArrayList<Integer> list=new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(1);
        System.out.println(list);

        ArrayList<String> fruits=new ArrayList<>();

        fruits.add("APPle");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Kewi");
        fruits.add("Coconut");
        System.out.println(fruits);

        //Remove by value
        fruits.remove("Orange");
        System.out.println(fruits);

        //remove by index
        fruits.remove(1);
        System.out.println(fruits);

        for(String f:fruits)
            System.out.println(f);


        fruits.set(0,"berry");
        System.out.println(fruits);

        System.out.println(fruits.get(1));

        System.out.println(fruits.size());

        Collections.sort(fruits);
        System.out.println(fruits);


    }
}