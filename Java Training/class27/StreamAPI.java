package class27;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,15,20,25);

        List<Integer> evenList = list.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());

         List<Integer>List2 = list.stream()
                                    .map(n->n*5)
                                     .collect(Collectors.toList());                           

        //   System.out.println(evenList); 
        //   System.out.println(List2);   
          
            List<Integer>List3 = list.stream()
                                    .filter(n -> n % 2 == 0)
                                    .map(n->n*5)
                                    .collect(Collectors.toList());

        //   System.out.println(List3);   

        //   Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
        //   int sum = list.stream().reduce(0,(a,b) -> a+b);

        //   System.out.println(sum);

           List<Integer> list4 = Arrays.asList(2,4,6,7,5,10,15,20,25,30);

            //  List<Integer> resuList = list4.stream()
            //                         .filter(n -> n > 2)
            //                         .filter(n->n%2==0)
            //                         .collect(Collectors.toList());                     
            //   System.out.println(resuList);      
            
             int resuLt = list4.stream()
                                    .filter(n -> n > 2)
                                    .filter(n->n%2==0)
                                    .reduce(0, (a,b) -> a+b);

                                    // System.out.println(resuLt);

System.out.println("Max : ");
             int ans = list4.stream().reduce(Integer.MIN_VALUE,(a,b) -> a>b?a:b);
             System.out.println(ans);   

System.out.println("Min : ");
             int ans1 = list4.stream().reduce(Integer.MAX_VALUE,(a,b) -> a<b?a:b);
             System.out.println(ans1);                            

    }
    
}
