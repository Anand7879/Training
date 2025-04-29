package class10;

import java.util.Scanner;

public class Class10Practice {

    public static void main(String[] args) {
        // Q34();  
        // Q33();
        // Q32();
        // Q31();
        // Q30();
        // Q29();
        // Q28();
        // Q27();
        // Q26();
        // Q25();
        // Q24();
        // Q23();
        Q21();

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
       int countDigits2=countDigits;
        temp = n;
        while(temp>0){
            if(countDigits%2!=0)
            {
                sum+=temp%10;
                temp/=100;
            }
            else{
                sum+=temp/Math.pow(10, countDigits2-1);
                temp = (int) (temp % Math.pow(10, countDigits2-1));
                countDigits2--;
                temp=(int) (temp % Math.pow(10, countDigits2-1));
                countDigits2--;
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
        
     //WAP to print Fibonacci numbers in a given range
     public static void Q29()
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Series Is: ");
        System.out.print(a+" "+b+" ");
       
        int c = a+b;
        while(c<=n)
        {
           System.out.print(c+" ");
           a=b;
           b=c;
           c=a+b;
        }

     }

     //WAP to print Fibonacci series up to n terms
     public static void Q28()
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for(int i = 2; i<n;i++)
        {
            int c = a+b;
            a = b;
            b = c;

            System.out.print(c+" ");
        }

     }

      //WAP to find factorial of a number
     public static void Q27() {
        System.out.print("Enter A Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<=n; i++)
        {
           fact = fact*i;
        }
        System.out.println("Factorial Of "+ n + " Is "+ fact);
     }
    
    //WAP to find GCD (HCF) of two numbers
     public static void Q26(){
        System.out.print("Enter First Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        
        int n = a;
        int m = b;
    
        while (n!=m) {
            if(n>m){
               n=n-m;
            }else
            m= m-n;
        }
        System.out.println("HCF Of "+ a + " And "+ b +" is "+ n);



     }    

    //WAP to find LCM of two numbers
    public static void Q25()
    {
        System.out.print("Enter First Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        
        int n = a;
        int m = b;

        while (n!=m) {
            if(n>m){
               n=n-m;
            }else
            m= m-n;
        }

        int LCM = (a*b)/n;
        System.out.println("LCM Of "+ a + " And "+ b +" is "+ LCM);
        
       
    }

    //WAP to check if a number is a Harshad number
    public static void Q24()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int n = sc.nextInt();
       int temp = n;
        int sum= 0;
         while(temp>0)
         {
            sum+=temp%10;
            temp/=10;
         }

         if(n%sum==0)
         {
            System.out.println("Given Number Is A HArshad Number ");

         }else
         System.out.println("Given Number Is Not A HArshad Number!");


    }

    //WAP to print all Armstrong number between two given range
    public static void Q23()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int n  = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            int countDigits = 0;
            int sum = 0;
           int temp = i;
           while(temp>0)
           {
            temp/=10;
            countDigits++;
           }
           temp = i;
           while(temp>0)
           {
               sum+=Math.pow(temp%10,countDigits);
               temp/=10;
           }
           if(sum==i)
           System.out.print(i+" ");
        }
    }

    //WAP to check a number is Armstrong or not
    public static void Q21()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n  = sc.nextInt();

        int countDigits = 0;
        int sum = 0;
       int temp = n;
       while(temp>0)
       {
        temp/=10;
        countDigits++;
       }
       temp = n;
           while(temp>0)
           {
               sum+=Math.pow(temp%10,countDigits);
               temp/=10;
           }
           if(sum==n)
           System.out.print(n+" Is An ArmStrong Number");
           else
           System.out.print(n+" Is Not An ArmStrong Number");

    }



}
    






    






    
