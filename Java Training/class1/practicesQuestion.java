package class1;

import java.util.Scanner;

public class practicesQuestion {
    public static void main(String[] args) {
        
     //calculator();
    //  int_To_Float();
    SwapTwoNumbers();
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

   public static void SwapTwoNumbers()
   {
    //  Using a third variable
    int a = 10;
    int b = 20;
    int temp = 0;

    temp=a;
    a=b;
    b= temp;
    System.out.println("After Swapping a = "+a);
    System.out.println("After Swapping b = "+b);

    // Using a third Variable
    int c = 9;
    int d = 10;

    c=c+d;   //19
    d=c-d;   //9
    c = c-d; //10

    System.out.println("After Swapping c = "+c);
    System.out.println("After Swapping d = "+d);



   }
}
