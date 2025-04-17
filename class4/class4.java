package class4;

import java.util.Scanner;

public class class4 {
    public static void main(String[] args) {
//        PalindromeCheck();
//array();
        int [] array = {1,2,3,4,5,6,7};
        SumOfArray(array,6);
//        int x = 123, sum = 0;
//        int a = x;
//
//        while (a > 0) {
//            int digit = a % 10;
//            a = a / 10;
//            sum = sum + digit;
//        }
//        System.out.println(sum);

    }

    public static void PalindromeCheck()
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x;
        int rev = 0;
        while(a>0)
        {
            int digit = a%10;
            rev = rev + digit;
            a/=10;
        }
        System.out.println(rev);
        if(rev == x)
        {
            System.out.println("Number "+ x + "Is Palindrome");
        }
    }
    public static void array()
    {
//        int[] a = {1,2,3,4,5};
//        int n = a.length;
//        for (int j : a) {
//            System.out.print(j + " ");
//        }
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int [] a = new int[n];
        for(int i = 0;i<n; i++)
        {
           a[i] = sc.nextInt();
        }
        System.out.println("Elements of Array: ");
        for(int i = 0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }

        //Reverse an array
        int start =0,temp = 0;
        int end = n-1;

        while(start<end)
        {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;

        }
        System.out.println("Reversed Array is: ");
        for(int i =0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static void SumOfArray(int[] a, int target)
    {
       int  n = a.length;
        for(int i =0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(a[i]+a[j]==target)
                {
                    System.out.println(a[i] +" "+a[j+1] );
                }
            }
        }
    }
}
