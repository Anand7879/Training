package class22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Iterator
public class class22 {
    public static void main(String[] args) {
        
        // ArrayList<String> list = new ArrayList<>();
        // list.add("Rahul");
        // list.add("Om");
        // list.add("Shanti");
        // list.add("Mohit");
        // list.add("Rohit");

//         System.out.println(list);

//         Iterator<String> it = list.iterator();
//         // System.out.println(it.hasNext());

//         while (it.hasNext()) {
//             String data = it.next();
//             if(data.startsWith("R")){
//                 it.remove();
//             }
//         }
// System.out.println(list);



// ListIterator
        ArrayList<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Om");
        list.add("Shanti");
        list.add("Mohit");
        list.add("Rohit");

        ListIterator<String> it = list.listIterator();

        // while (it.hasNext()) {
        //     String data = it.next();
        //     System.out.println(data);

        // }

        // System.out.println();

        // while (it.hasPrevious()) {
        //     String privData = it.previous();
        //     System.out.println(privData);
        // }




        // while (it.hasNext()) {
        //     String data = it.next();
          
        //     if(data.length() < 3)
        //     {
        //         it.set("byee");
        //     }

        // }
        // System.out.println(list);

        //  while (it.hasPrevious()) {
        //     String data = it.previous();
          
        //     if(list.get(0)!=data)
        //     {
        //         it.set("helllo");
        //     }
    
        // }
        // System.out.println(list);


        // String target = "Shanti";
        //   while (it.hasNext()) {
        //     String data = it.next();
          
        //     if(data == target)
        //     {
        //        System.out.println(it.nextIndex()-1);
        //     }
        // }    
        

        ArrayList<Integer> names = new ArrayList<>();

        names.add(1);
        names.add(10);
        names.add(0);
        names.add(12);
        names.add(21);
        





      
    }

}
