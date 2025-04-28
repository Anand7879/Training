package class10;

import java.util.Scanner;

public class Class10Practice {

    public static void main(String[] args) {
        // Q34();
        // Q33();
        // Q32();
        // Q31();
        Q30();
    }

    //WAP to check if a number is a Magic Number
    public static void Q35()
    {
        
    }

    // WAP to check if a number is a Buzz number
    public static void Q34()
    {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        int temp = n%10;

        if(n%7==0 || temp ==7 )
        {
            System.out.println(n + " is a Buzz Number");
        }else
        System.out.println(n + " Is not a Buzz Number!");
    }
    
    //WAP to check whether the number is duck number
     public static void Q33()
     {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        int temp = n;
        int start = 0;
        boolean found = false;
        while(temp>0)
        {
            start = temp%10;
            temp/=10;

            if(start == 0)
            {
                found = true;
            }   
        }
        if(found && start!=0)
        {
            System.out.print(n + " Is a duck Number");
        }else
        System.out.print(n + " Is not a duck Number");
       
     }

     //WAP to calculate the sum of alternate digits in a number
     public static void Q32()
     {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        int countDigits = 0;
        int temp = n;
         int sum=0;
        while(temp>0)
        {
           temp/=10;
           countDigits++;
        }
       
        temp = n;
        while(temp>0){
            if(countDigits%2!=0)
            {
                sum+=temp%10;
                temp/=100;
            }
            else{
              
                int FirstDigit = (int) (temp/Math.pow(10, countDigits-1));

                temp=(int) (temp %Math.pow(10, countDigits-1));
                 sum+=FirstDigit;
            }
        }
       
        System.out.println("Sum Of Alternative digits is: "+ sum);
     }
    
     //WAP to swap first and last digit of a number
    public static void Q31()
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        int temp = n;
        int temp1 = n;
        int lastdigit=temp%10;
        int FirstDigit = 0;
        int count = 0;
          while(temp>0)
          {
           FirstDigit = temp%10;
               temp/=10;
               count++;
          }

          //Remove First And Last Digit to get middlepart;
          int  m =  (int) (n/(Math.pow(10,count/2-1)));
          count--;

          int middlepart=  (int) (m%Math.pow(10, count-1));
          count--;

          // Swap and Add
          int SwappNuber = (int) (lastdigit*Math.pow(10, count+1)) + (middlepart*10) + FirstDigit;
          count+=2;
          System.out.print("After Swapping First And Last digit The Number is : "+ SwappNuber);



        

      }
    

     //WAP to swap to numbers
     public static void Q30()
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();

        int temp = a;
        a=b;
        b=temp;

        System.out.println("After Swapping: ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        
     }
        




     
    }
    






    






    
