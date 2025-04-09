package class1;

import java.util.Scanner;

public class practicesQuestion {
    public static void main(String[] args) {
        
     //calculator();
     int_To_Float();
    }

    // Q.1 Calculator
   public static void calculator()
    {
       int  a,b;
       char op;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter A & B :");
       a = sc.nextInt();
       b = sc.nextInt();

       System.out.println("Enter Operator :");
       op = sc.next().charAt(0);

       if(op == '+')
       {
        System.out.println("Addition :"+(a+b));
       }else if(op == '-'){
        System.out.println("Subtraction :"+(a-b));
       }else if(op == '*')
       {
        System.out.println("Multiplication:"+(a*b));
       }else
       {
        System.out.println("Division :"+(a/b));
       }
       
     sc.close();
    }
  
    //Q.2 Convert int to float
    public static void int_To_Float()
    {
        int a = 10;
        float b = (float) a;
        System.out.print(b);
    }
}
