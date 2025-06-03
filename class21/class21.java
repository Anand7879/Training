package class21;

import java.util.HashMap;

public class class21 {
    public static void main(String[] args) {
        //  HashMap<Character,Integer> map = new HashMap<>();
        //  map.put("Id", 0);
        //  map.get("Id");
        //  map.getOrDefault("Id", 5);


    //  Q1 -> Find The Count Of each character using HashMap

        // String str = "programming";

        //  for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (map.containsKey(ch)) {
        //         map.put(ch, map.get(ch) + 1);
        //     } else {
        //         map.put(ch, 1);
        //     }
        // }

        //2nd Method

    //     char[] ch = str.toCharArray(); 
    //     for (char i : ch) {
    //         map.put(i, map.getOrDefault(i, 0)+1);
            
    //     }
    //    System.out.println(map);
    //     map.forEach((key,value)->{
    //      System.out.println(key + " = " + value);
    // });


    // Q2 -> count the frequency of Word in a string using HashMap

        // String str1 = "programming is a fun and fun is a programming";
        
        // String[] words = str1.split(" ");

        // HashMap<String, Integer> wordMap = new HashMap<>();

        // for (String word : words) {
        //     wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        // }

        // System.out.println(wordMap);


        String str = "aaabcccdddeef";
         HashMap<Character,Integer> map = new HashMap<>();


      
        char[] ch = str.toCharArray(); 
        for (char i : ch) {
            map.put(i, map.getOrDefault(i, 0)+1);
            
        }
      
    //  map.forEach((key,value) ->{
    //     if(value == 1)
    //     {
    //         System.out.println(key);
    //     }
    // });

    for (char i : map.keySet()) {
        if(map.get(i) == 1)
        {
            System.out.println(i);
            break;
        }
    }
      
    }
    
}





