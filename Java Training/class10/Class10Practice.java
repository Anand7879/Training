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
        // Q21();
        // Q20();
        // Q19();
        // Q18();
        // Q17();
        // Q16();
        // Q15();
        // Q14();
        // Q13();
        // Q12();
        // Q11();
        // Q10();
        // Q9();
        // Q8();
        // Q7();
        // Q6();
        // Q5();
        // Q4();
        // Q3();
        // Q2();
        // Q1();


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
    
    //WAP to print all the perfect number between two given range
    public static void Q20(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int n  = sc.nextInt();

        for(int j=1; j<=n; j++)
        {
        int sum=0;
        for(int i = 1; i<=j/2; i++)
        {
              if(j%i==0)
              {
               sum+=i;
              }
        }
        if(j==sum)
        System.out.print(j+" ");
    }


    }

    //WAP to print all perfect numbers between 1 to 100
    public static void Q19(){
       
        for(int j=1; j<=100; j++)
        {
        int sum=0;
        for(int i = 1; i<=j/2; i++)
        {
              if(j%i==0)
              {
               sum+=i;
              }
        }
        if(j==sum)
        System.out.print(j+" ");
    }


    }

    //WAP to check a number is perfect or not
    public static void Q18(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n  = sc.nextInt();
        int sum=0;
        for(int i = 1; i<=n/2; i++)
        {
              if(n%i==0)
              {
               sum+=i;
              }
        }
        if(n==sum)
        System.out.println(n + " Is a Perfect Number");
        else
        System.out.println(n + " Is Not a Perfect Number!");



    }

    //WAP to print alternate prime numbers between 1 to 100
    public static void Q17()
    {
        int count = 0; 
        for(int j = 2; j<=100; j++)
        {
            boolean prime = true;
       for(int i= 2; i<=Math.sqrt(j); i++)
       {
             if(j%i==0)
             {
               prime = false;
               break;
             }
       }
       if(prime)
       {
        if (count % 2 == 0) { 
            System.out.print(j + " ");
        }
        count++;

       }
    
    }

    }
   
    //WAP to print all prime numbers between two given range
    public static void Q16()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int n  = sc.nextInt();
       
        for(int j = 1; j<=n; j++)
        {
            if (j == 1) continue;  // Skip 1 as it's not a prime
            boolean prime = true;
       for(int i= 2; i<=Math.sqrt(j); i++)
       {
             if(j%i==0)
             {
               prime = false;
               break;
             }
       }
       if(prime)
       {
           System.out.print(j +" ");
       }
    
    }

    }
   
    //WAP to print all prime numbers between 1 to 100
    public static void Q15()
    {
        for(int j = 1; j<=100; j++)
        {
            if (j == 1) continue;  // Skip 1 as it's not a prime
            boolean prime = true;
       for(int i= 2; i<=Math.sqrt(j); i++)
       {
             if(j%i==0)
             {
               prime = false;
               break;
             }
       }
       if(prime)
       {
           System.out.print(j +" ");
       }
    
    }

    }
   
    //WAP to check a number is prime or not
    public static void Q14()
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n  = sc.nextInt();
        boolean prime = true;
        for(int i = 2; i<=Math.sqrt(n); i++)
        {
              if(n%i==0)
              {
                prime = false;
                break;
              }
        }
        if(prime)
        {
            System.out.println("Number Is Prime");
        }
        else
        System.out.println("Number Is Not Prime");


     }
    
    //WAP to count all the factors of a given number and display it
    public static void Q13()
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n  = sc.nextInt();
        int count=0;
        for(int i = 1; i<=Math.sqrt(n); i++)
        {
              if(n%i==0)
              {
                count+=2;
              }
        }
        System.out.println("Count Of All Factors Is: "+count);
     }

    //WAP to find sum of all factors of a given number
    public static void Q12()
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n  = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=Math.sqrt(n); i++)
        {
              if(n%i==0)
              {
                 sum+=(n/i)+i;
              }
        }
        System.out.println("Sum Of ALL Factors Of "+ n+ " are "+ sum);
     }

    //WAP to find all factors of a given number
     public static void Q11()
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n  = sc.nextInt();

        for(int i = 1; i<=Math.sqrt(n); i++)
        {
              if(n%i==0)
              {
                System.out.print(i+" "+n/i+" ");
              }
        }
     }

    //WAP to check a number is palindrome or not
    public static void Q10(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n  = sc.nextInt();
        int count =  0;
        int temp = n;
        while(temp>0)
        {
            temp/=10;
            count++;
        }
        int reverse=0;
        temp = n;
        while (temp>0) {
            reverse+= temp%10 * Math.pow(10,count-1);
            temp/=10;
            count--;
        }
        if(n==reverse)
        {
            System.out.println(n + " Is A Palindrom ");
        }
        
    }

    //WAP to print reverse of a given number
    public static void Q9()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n  = sc.nextInt();
        int count =  0;
        int temp = n;
        while(temp>0)
        {
            temp/=10;
            count++;
        }
        int reverse=0;
        temp = n;
        while (temp>0) {
            reverse+= temp%10 * Math.pow(10,count-1);
            temp/=10;
            count--;
        }
        System.out.println(reverse);
    }

    //WAP to find the count of all digits in a given number
    public static void Q8(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A  Number: ");
        int n  = sc.nextInt();
        String str = String.valueOf(n);

        for(int i = 0; i<str.length(); i++)
        {
            int count = 1;
            for(int j=i+1; j<str.length(); j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count++;
                }
            }
            System.out.println("Count OF Digit "+ str.charAt(i) + " Is : "+ count);
        }



        
    }    

    //WAP to find sum of all digits in a given number
    public static void Q7(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A  Number: ");
        int n  = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp>0) {
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("Sum Is: "+ sum);
    }    

    //WAP to extract and display all digits from a given number
    public static void Q6(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A  Number: ");
        int n  = sc.nextInt();
        int temp = n;
        int count=0;
        while(temp>0)
        {
          temp/=10;
          count++;
        }
        temp = n;
        while(temp>0)
        {
            int digit = (int) (temp/Math.pow(10, count-1));
            System.out.println(digit);
            temp = (int) (temp % Math.pow(10, count-1));
            count--;
        }
    }

    //WAP to find product of 'n' natural numbers
    public static void Q5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n  = sc.nextInt();
        int product=1;
        for(int i = 1; i<=n; i++)
        {
           product *=i;
        }

       System.out.println("Product Of "+n+ " Natural Number Is: "+ product);
    } 

    //WAP to find sum of 'n' natural numbers
    public static void Q4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n  = sc.nextInt();
        int sum=0;
        for(int i = 1; i<=n; i++)
        {
           sum += i;
        }

       System.out.println("Sum Of "+n+ " Natural Number Is: "+ sum);
    }

    //WAP to print 'n' natural numbers in reverse order
    public static void Q3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n  = sc.nextInt();
        for(int i = n; i>=1; i--)
        {
            System.out.println(i);
        }
    }

    //WAP to print all even numbers between two given range
    public static void Q2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Range: ");
        int n  = sc.nextInt();
        System.out.print("Enter Ending Range: ");
        int m  = sc.nextInt();

        for(int i = n; i<=m; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }


    }

   //WAP to print natural numbers up-to 'n'
   public static void Q1() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int n  = sc.nextInt();
    for(int i = 1; i<=n; i++)
    {
        System.out.println(i);
    }
   }
}
    






    






    
