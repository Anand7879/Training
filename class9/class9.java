package class9;
import java.util.Arrays;

//import java.util.Scanner;

public class class9 {
    // int a = 5; //Instance variable for the use of it we have to create obj
    // static  int b = 12; // Static variable we can use this directly in our static method without creating object


   public static void sum(int a,int b)
    {
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = a+b;
//        System.out.println(sum);
//        int result=0;
//        while(a!=0)
//        {
//            int digit = a%10;
//            a/=10;
//            result+=digit;
//       }
//        System.out.println(result);
        int sum = a+b;
        int sum1=0;
        int max=0;
        while(sum>0)
        {
            sum1=sum%10;
            sum/=10;
            if(sum1>max)
            {
                max=sum1;
            }
        }
        System.out.println(max);

    }


   public static int SmallestElement(int arr[])
   {
        int n = arr.length;
        int small = arr[0];

        for(int i = 1; i<n; i++)
        {
            if(arr[i]<small)
            small = arr[i];
        }
    return small;
    
   }

   public static void CopyArray(int arr[],int arr2[])
   {
       for(int i = 0; i<arr.length;i++ )
       {
            arr2[i]=arr[i]; 
       }

    
   }
   
   public static void findMissing(int arr[])
   {
         Arrays.sort(arr);
         int sum=0;

         int[] miss = new int[5];
         int k =0;
         for(int i =0; i<arr.length; i++)
         {
            sum+=arr[i];
         }
         int differance = sum-arr[0];
         for(int j = 1; j<arr.length; j++)
         {

            if(sum-arr[j]!=differance-1)
            {
                miss[k]= arr[j]-1;
                k++;
            }
         }
         for(int i = 0; i<miss.length;i++)
         {
            System.out.println(miss[i]);
         }
   }
   public static void main(String[] args) {

        int [] arr = {3,5,7,2,1};
        // int [] arr2 = new int[arr.length];
        // int min = SmallestElement(arr);
        // System.out.println(min);
        // CopyArray(arr, arr2);
        findMissing(arr);

    //    class9 obj = new class9();  // For NonStatic Variable
    //     System.out.println(obj.a);

    //     System.out.println(b);   // For static variables
    //     System.out.println(class9.b);







//         class9 obj = new class9();
//         obj.sum();
//        sum(123);
      //sum(5,7);
        // String is immutable
//        String str = "hello";
//        System.out.println(str.concat("hii"));
//        System.out.println(str);


        // Mutable String
//        StringBuilder str1 = new StringBuilder("hello");
//        str1.append("hello");
//
//        System.out.println(str1);
//
//        StringBuilder str2 = new StringBuilder(10);  // here capacity is not fixed
//                                                            // it will be automatically change
                                                         // if the length of the string is more than the capacity
//        str2.append("hello hii byyy");

        // if the length of the string is more than the capacity
        // then the capacity will automatically increases using the following formula
        // oldcapacity*2+2
//        System.out.println(str2.length());
//        System.out.println(str2.capacity());

    }



}
