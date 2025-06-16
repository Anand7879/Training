package class30;

import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {
        String str =  "helllo";
        
        String str1 =  "ollhe";

      if (str.length() != str1.length()) {
            System.out.println("Not a valid Anagram");
            return;
        }
      
       HashMap<Character,Integer> map = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

      map.forEach((key,value)->{
        System.out.println(key + " " + value);
      });

       for (char ch : str1.toCharArray()) {
            if (!map.containsKey(ch)) {
                System.out.println("Not a valid Anagram");
                return;

            }
             map.put(ch, map.get(ch) - 1);

            if (map.get(ch) < 0) {
                System.out.println("Not a valid Anagram");
                return;
        }
    }

    //   map.forEach((key,value)->{
    //    if(value!=0)
    //       System.out.println("Not a Valid Anagram");
    //   });





}
}