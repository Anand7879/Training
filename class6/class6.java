
public class class6 {
    public static void main(String[] args) {
//        countElements();
//convert1DArray();
    // matrix_multiplication();
    // SamestringCount();
    // palindromeCheckar("racecar");
    // frequencyCheck();
    VowelsCheck();

    // String str = "Hello";
    // System.out.println(str.length());
    // System.out.println(str.charAt(1));

    // System.out.println("All character :");
    // for(int i = 0; i<str.length(); i++)
    // {
    //     System.out.println(str.charAt(i));

    // }

    // System.out.println("Reverse string: ");
    // {
    //     for(int i = str.length()-1; i>=0; i--)
    //     {
    //         System.out.println(str.charAt(i));
    //     }
    // }


    }


    public static void countElements()
    {
        int [][]  arr = {{1,2,3,4},{3,4,5,6},{4,5,6,7}};
        int n = arr.length,totalcount= 0;
         int s = 0;
//        System.out.print(n);
        for(int i =0; i<n; i++)
        {
//            for(int j = 0; j<arr[i].length; j++)
//            {
//                s++;
//            }

            // second method without nested loop

             totalcount+=arr[i].length;
        }
//        System.out.print(s);
        System.out.println(totalcount);
    }

    public static void convert1DArray()
    {
        int [][]  arr = {{1,2,3,4},{3,4,5,6},{4,5,6,7}};
        int m = arr.length;;
        int [] a = new int[m * arr[0].length];
        int s=0;
        int n = a.length;

        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<arr[0].length;j++)
            {
               a[s++] = arr[i][j];
            }
        }
        for(int k = 0; k<n;k++)
        {
            System.out.print(a[k]+" ");
        }


    }

    public static void matrix_multiplication()
    {
        int [][] arr1 = {{1,2},{3,2}};
        int [][] arr2 = {{4,3},{2,3}};
        int m = arr1.length;
        int n = arr1[0].length;

        int[][] arr3 = new int[m][n];
        int s = arr3.length;
//        System.out.println(k);

        for(int i = 0; i<s; i++)
        {
            for(int j = 0; j<s; j++) {
                int p = 0;
                for (int k = 0; k < s; k++) {
                    p += arr1[i][k] * arr2[k][j];
                }
                arr3[i][j] = p;
            }
        }

        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<arr3[0].length; j++)
            {
                System.out.print(arr3[i][j] +" ");
            }
            System.out.println();
        }
    }

   public static void palindromeCheckar(String str)
   {
       int l = 0, h = str.length()-1;
        boolean palindrome = true;
       while(l<h)
       {
          if(str.charAt(h)!=str.charAt(l))
          {
            palindrome = false;
            break;
          }
          l++;
          h--;
       }
       if(palindrome)
       System.out.println("String Is Palindrome");
       else
       System.out.println("String Is not Palindrome");
   } 

   public static void SamestringCount()
   {
          String str = "Hello";
          String str2 = "Hiiii";
          int count = 0;
          int h = str.length();

          for(int i =0; i<h;i++)
          {
              if(str.charAt(i)==str2.charAt(i))
              {
                 count++;

              }
          }
          System.out.println(count);
   }

   public static void frequencyCheck()
   {
      String str ="rrrrr";
      char target = 'r';
      int count=0;
      int n = str.length();
      for(int i = 0; i<n; i++)
      {
           if(str.charAt(i)==target)
           {
               count++;
           }
      }
      System.out.println("Frequency of "+ target +" is "+ count);
   }

   public static void VowelsCheck()
   {
    String str = "racecarjhdgahaha";
    int n = str.length();
    int count = 0;
    
    for(int i =0; i<n; i++)
    {
        char c = str.charAt(i);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            count++;
        }
    }
    System.out.println(count);
   }

   public static void RemoveDuplicate() {
    String str = "hello";
    String result = "";

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (result.indexOf(c) == -1) {
            result += c;
        }
    }

    System.out.println("String after removing duplicates: " + result);
}

}