package class27;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class class27 {

    public static void main(String[] args) {
        // Runnable r = new Runnable() {
        //     public void run(){
        //         System.out.println("Runnable using anonymous class");
        //     }
        // };

        // r.run();

        // Runnable R = ()->System.out.println("Runnable using lambda");

        // R.run();


        ArrayList<String> list = new ArrayList<>();
        list.add("Shivansh");
        list.add("Anand");
        list.add("Ankit");

        Collections.sort(list,new Comparator<String>() {
            
            public int compare(String a,String b){
                  return a.compareTo(b);
              
            }
        });
        
        // Collections.sort(list, (a, b) -> a.compareTo(b));
        
        System.out.println(list);
    }
    
}
