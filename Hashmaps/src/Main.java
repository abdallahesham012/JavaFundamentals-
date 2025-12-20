import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        // Data Types is >> Wrapper Classes
        HashMap <String,Integer> mp=new HashMap<>();

        mp.put("apple",50);
        mp.put("tomato",40);
        mp.put("banana",32);
        mp.put("orange",23);

        System.out.println(mp+"\n");

        mp.put("orange",2); // Will override the value of orange
        System.out.println(mp+"\n");

        mp.remove("tomato");
        System.out.println(mp+"\n");

        mp.put("coconut",12);
        System.out.println(mp.get("coconut")+"\n");

        if(mp.containsKey("apple"))
        {
            System.out.println("apple = "+mp.get("apple")+"\n");
        }
        else
        {
            System.out.println("apple not found\n");
        }

        System.out.println(mp.size()+"\n");

        // Foreach To iterate in map
        for(String key: mp.keySet())
        {
            System.out.println(key+" ; "+mp.get(key));
        }

        mp.clear();
        System.out.println(mp);
    }
}