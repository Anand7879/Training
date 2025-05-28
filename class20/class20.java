package class20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class class20 {
    public static void main(String[] args) {
        // LinkedList<Integer> arr = new LinkedList<>();
        // long start = System.nanoTime();
        // arr.add(5);
        // System.out.println(arr.contains(5));
        // long end = System.nanoTime();
        // System.out.println(end-start);


    //     LinkedList<Integer> List = new LinkedList<>();

    //     List.add(5);
    //     List.add(7);
    //     List.add(9);
    //     List.addFirst(0);
    //     List.add(0,5);

    //     for (Integer integer : List) {
    //         System.out.println(integer);
    //     }


    // HashSet<String> set = new HashSet<>();
    // set.add("C");
    // set.add("A");
    // set.add("B");
    // set.add("A");
    // set.add("a");
    // set.add("b");
    // System.out.println(set);

    //  TreeSet<String> set2 = new TreeSet<>();
    // set2.add("C");
    // set2.add("A");
    // set2.add("B");
    // set2.add("A");
    // set2.add("a");
    // set2.add("b");
    // System.out.println(set2);

    // int[] arr = {1,2,1,2,42,4,5,3,53,45,3,5};
    // ArrayList<Integer> arr1 = new ArrayList<>();

    // HashSet<Integer> set =  new HashSet<>();

    // for(int i = 0; i<arr.length; i++)
    // {
    //     if(set.contains(arr[i]))
    //     {
    //         arr1.add(arr[i]);

    //     }
    //     set.add(arr[i]);
    // }

    // // for (Integer integer : arr) {
    // //     set.add(integer);
    // // }

    // System.out.println(set);
    // System.out.println(arr1);

    // HashMap<String,Integer> map = new HashMap<>();
    // map.put("Anand", 10);
    // map.put("Ankit", 10);
    // map.put("Purvesh", 10);
    // map.put("Shivansh", 10);

    // System.out.println(map.get("Anand"));
    // System.out.println(map.get("Purvesh"));
    // System.out.println(map.get("Shivam"));

    // map.remove("Anand");
    // System.out.println(map.get("Anand"));

    // for(String key : map.keySet()){
    //     System.out.println(key);
    // }

    // HashMap<Integer,Integer> map = new HashMap<>();
    // map.put(1,1);
    // map.put(2,2);
    // map.put(3,5);

    // for(int key : map.keySet())
    // {
    //     if(key>2)
    //     {
    //         System.out.println(key);
    //         System.out.println(map.get(key));
    //     }
    // }

    // map.forEach((key,value)->{
    //     System.out.println(key + " " + value);
    // }
    // );

     HashMap<Integer,String> map = new HashMap<>();
    map.put(1,"My");
    map.put(2,"Name");
    map.put(3,"Is");
    map.put(3,"Anand");

    map.forEach((key,value) ->{
        if(value == "Name")
        {
            System.out.println(key);
        }
    });






    
    
    
    }
    

}
