package class19;

import java.util.Scanner;

public class class19 {
    public static void main(String[] args) {
    
        //Exception Handling
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
         int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt(); 
        // try {
        //     int c = a/b;
        //     System.out.println(c);
            
        // } catch (Exception e) {

        // System.out.println("We can not divide by zero ");

        // }
    // System.out.println("Hello ");
    // System.out.println("Hii");
    // sc.close();

    int[] arr = {1,2,3,4};
    
    // try {

    //     System.out.print(arr[6]);
        
    // } catch (Exception e) {
    //    System.out.println("Array Index out of bound ");
    // }

    try {
         int c = a/b;
         System.out.println(c);
          System.out.print(arr[6]);

    } catch (ArrayIndexOutOfBoundsException e) {

    //    System.out.println("Array Index out of bound ");
    System.out.println(e);
    }
    catch (ArithmeticException e)
    {
        System.out.println("We can not divide by zero ");
    }
    finally{
        
    }
    System.out.print("Hello <._.> ");
} 
}
