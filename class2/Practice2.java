import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
//        Q1();
//        Q2();
//        Q3();
//        Q4();
//        Q5();
//        Q6();
//        Q7();
//        Q8();
//        Q9();
//        Q10();
//        Q11();
//        Q12();
//        Q13();
    }

    public static void Q1(){
    //  Check Even or Odd using if-else
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Integer: ");
        n = sc.nextInt();

        if(n%2==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number Is Odd");
    }

    public static void Q2(){
        //  Check Positive, Negative or Zero
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Integer: ");
        n = sc.nextInt();

        if(n>0)
            System.out.println("Number is Positive");
        else if(n<0)
            System.out.println("Number Is Negative");
        else
            System.out.println("Number Is Zero");
    }

    public static void Q3(){
        //  Find Greatest of Two Numbers using if-else
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        b = sc.nextInt();

        if(a>b)
            System.out.println(a +" is greater");
        else if(b>a)
            System.out.println(b +" ig greater");
        else
            System.out.println(a +" Is Equal to "+ b);
    }

    public static void Q4(){
        // Check whether a character is vowel or consonant using switch-case
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Character: ");
        c = sc.next().charAt(0);

        switch(Character.toLowerCase(c)) {  // convert character to lowercase
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(c + " is a Vowel.");
                break;
            default:
                if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    System.out.println(c + " is a Consonant.");
                } else {
                    System.out.println(c + " is not an alphabet.");
                }
        }
    }

    public static void Q5(){
        //  Print numbers from 1 to N using a for loop
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Integer: ");
        n = sc.nextInt();

        for(int i = 1; i<=n;i++)
        {
            System.out.println(i);
        }
    }

    public static void Q6(){
        // Sum of first N natural numbers using while loop
        int n,i=1,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Integer: ");
        n = sc.nextInt();
        while(i<=n)
        {
            sum +=i;
            i++;
        }
        System.out.print("Sum of First "+ n +" Natural Number is: "+ sum);
    }

    public static void Q7(){
        // Print multiplication table of a number using loop
        int n,i=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any number: ");
        n = sc.nextInt();
        System.out.println("Multiplication Table Of "+ n +"Is :");
        while(i<=10)
        {
            System.out.println(i*n);
            i++;
        }

    }

    public static void Q8(){
        // Check whether a number is divisible by 5 and 11 using if-else
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        n = sc.nextInt();

        if(n % 5 == 0 && n % 11 == 0) {
            System.out.println(n + " is divisible by both 5 and 11.");
        }
        else {
            System.out.println(n + " is not divisible by both 5 and 11.");
        }
    }

    public static void Q9(){
        //  Type casting example: Convert float to int and print both
        float f;
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float number: ");
        f = sc.nextFloat();

        // Type Casting from float to int
        i = (int)f;

        System.out.println("Float value: " + f);
        System.out.println("Integer value after type casting: " + i);
    }

    public static void Q10(){
        // Check whether a number is a multiple of 3 or not using if-else
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        n = sc.nextInt();

        if(n%3==0) {
            System.out.println(n + " is Multiple Of 3.");
        }
        else {
            System.out.println(n + " is not a Multiple Of 3");
        }
    }

    public static void Q11(){
        //Take a character input and print its ASCII value (Type casting)
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Character: ");
        c = sc.next().charAt(0);

        int i = (int) c;
        System.out.println("ASCII Value Of "+ c +" Is: "+i);
    }

    public static void Q12(){
        // Find factorial of a number using for loop
        int n,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        n = sc.nextInt();

        for(int i =1; i<=n; i++)
        {
            fact *=i;
        }
        System.out.println("Factorial Of "+ n +" Is: "+ fact);
    }

    public static void Q13() {
        //  Write a program to reverse a number using while loop
        int n, rem, reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        n = sc.nextInt();

        while (n != 0) {
            rem = n % 10;        // Get last digit
            reverse = reverse * 10 + rem; // Add it to reversed number
            n = n / 10;
        }
        System.out.println("Reverse Is: " + reverse);
    }
}
