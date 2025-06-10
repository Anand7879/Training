import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIpractice {
    public static void main(String[] args) {
        // Q1();
        // Q2();
        // Q3();
        // Q4();
        // Q5();
        // Q6();
        // Q7();
        // Q8();
        // Q9();
        Q10();
    }

    static void Q1(){

// Q1. Given a list of integers, return a list of squares of only even numbers.
// Input: [1, 2, 3, 4, 5]
// Output: [4, 16]
       
        List<Integer> list = Arrays.asList(1,2,3,4,5);

         List<Integer> evenSquareList = list.stream()
                                     .filter(n -> n % 2 == 0)
                                      .map(n->n*n)
                                     .collect(Collectors.toList());

                System.out.println(evenSquareList);                     

    }

    static void Q2(){

// Q2. Given a list of names, return a list of names in uppercase which have more than 3 characters.
// Input: ["Ram", "Shyam", "Om", "Sita"]
// Output: ["SHYAM", "SITA"]
       
           List<String> list = new ArrayList<>();

           list.add("Ram");
           list.add("Shyam");
           list.add("Om");
           list.add("Sita");

             List<String> list1 = list.stream()
                                     .filter(n -> n.length() > 3)
                                     .map(n -> n.toUpperCase())
                                     .collect(Collectors.toList());

                                     System.out.println(list1);
     
    }

    static void Q3(){

// Q3. Find the sum of all odd numbers in a list.
// Input: [1, 2, 3, 4, 5]
// Output: 9
      
              List<Integer> list = Arrays.asList(1,2,3,4,5);

              int result = list.stream().filter(n -> n % 2 != 0).reduce(0, (a,b) -> a+b);
                            
              System.out.println(result);                 

    }

    static void Q4(){

// Q4.Convert a list of words to their lengths.
// Input: ["Java", "Stream", "API"]
// Output: [4, 6, 3]

           List<String> list = new ArrayList<>();

           list.add("Java");
           list.add("Stream");
           list.add("API");

            List<Integer> list1 = list.stream().map(n -> n.length())
                                     .collect(Collectors.toList());

                                     System.out.println(list1);



    }

    static void Q5(){

// Q5. From a list of prices, remove duplicates, filter prices above 1000, and return total sum.
// Input: [999, 1000, 1500, 1000, 2000]
// Output: 3500

               List<Integer> list = Arrays.asList(999,1000,1500,1000,2000);

               int sum = list.stream().filter(n -> n>1000).reduce(0, (a,b) ->a+b);
               System.out.println(sum);
    }

    static void Q6(){
// Q6. Count how many strings in a list start with letter 'A' or 'a'.
// Input: ["apple", "banana", "apricot", "cherry", "Avocado"]
// Output: 3

              List<String> list = new ArrayList<>();

           list.add("apple");
           list.add("banana");
           list.add("apricot");
           list.add("cherry");
           list.add("Avocado");

           long result = list.stream().filter(n -> n.charAt(0) == 'A' || n.charAt(0) == 'a' ).count();

System.out.println(result);
          
    }

    static void Q7(){

// Q7. Return a comma-separated string of all names with more than 4 letters.
// Input: ["John", "Ravi", "Abhishek", "Raj"]
// Output: "Abhishek"

          
              List<String> list = new ArrayList<>();

           list.add("John");
           list.add("Ravi");
           list.add("Abhishek");
           list.add("AbhishekSingh");
           list.add("Raj");

           String result = list.stream().filter(n -> n.length()>4).collect(Collectors.joining(","));
           System.out.println(result);
    
    }

    static void Q8(){

//         Q8. Check if any number in a list is divisible by 7.
// Input: [10, 14, 22, 30]
// Output: true

               List<Integer> list = Arrays.asList(10,14,22,30);

               boolean resuLt = list.stream().anyMatch( n -> n%7 == 0);
               System.out.println(resuLt);
              
    }

    static void Q9(){
//         Q9. Multiply all the numbers in a list using reduce().
// Input: [1, 2, 3, 4]
// Output: 24

               List<Integer> list = Arrays.asList(1,2,3,4);
        int result = list.stream().reduce(1, (a,b) -> a*b);
        System.out.println(result);
    }

    static void Q10(){

//         Q10. From a list of sentences, return list of words (flat list).
// Input: ["Java is fun", "Streams are powerful"]
// Output: ["Java", "is", "fun", "Streams", "are", "powerful"]

               List<String> list = new ArrayList<>();

           list.add("Java is fun");
           list.add("Streams are powerful");
        
           List<String> list1 = list.stream().flatMap(n -> Arrays.stream(n.split(" ")) ).collect(Collectors.toList());

           System.out.println(list1);
  
    }
    
}
