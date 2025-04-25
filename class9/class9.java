package class9;

//import java.util.Scanner;

public class class9 {
    int a = 5; //Instance variable for the use of it we have to create obj
    static  int b = 12; // we can use this directly in our static method without creating object


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


    public static void main(String[] args) {

       class9 obj = new class9();  // For NonStatic Variable
        System.out.println(obj.a);

        System.out.println(b);   // For static variables
        System.out.println(class9.b);







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
