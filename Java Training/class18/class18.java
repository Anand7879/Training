package class18;

import java.util.HashMap;

public class class18 {
    public static void main(String[] args) {
        
        String str = "aaabbbbcccccc";
        
        // HashMap<Character, Integer> map = new HashMap<>();
        
        // for (char ch : str.toCharArray()) {
        //     if (map.containsKey(ch)) {
        //         map.put(ch, map.get(ch) + 1);
        //     } else {
        //         map.put(ch, 1);
        //     }
        // }
        
        // for (char key : map.keySet()) {
        //     System.out.println("Character: " + key + ", Count: " + map.get(key));
        // }


        // Method2(str);
        // System.out.println(str.length());

        // Dev obDev = new Dev();
        // obDev.print();
        // obDev.show();

        // C oC = new C();
        // oC.print();
        // oC.show();
    }


    static void Method2(String str){
       StringBuilder newStr = new StringBuilder();
       int count = 1;
       for(int i = 1; i<str.length(); i++)
       {
         if(str.charAt(i) == str.charAt(i-1))
         {                                                   // String str = "aaabbbbcccccc";
            count++;
         }
         else
         {
            newStr.append(str.charAt(i-1)).append(count);
            count=1;
         }

       } 
       
       System.out.println(newStr);
    
    }


    
    
}

// Interfaces 

// interface Client {
      
//     void print();     // we can only use abstract methods by default it is abstract & public

//     void show();
//  }

//  class Dev implements Client {

//     public void print(){
//       System.out.println("Bill");
//     }
//     public void show(){
//         System.out.println("Roti Sabji");
//     }
 
    
//  }


// Multiple Inheritance Using Interface

//  interface A {
  
//     void print();
    
// }
// interface B {
  
//     void show();
    
// }

// class C implements A,B{
       
//     public void print(){
//         System.out.println("Mai hu A");
//     }
//     public void show(){
//         System.out.println("Mai hu B");
//     }




