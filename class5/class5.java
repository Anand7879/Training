package class5;
import java.util.Arrays;

public class class5 {
    public static void main(String[] args) {
//        SumOfTwoArray();
//    TwoArraySumInArray();
//    MergeTwoArray();
//    FindCommon();
       FindUnique();
    }


    public static void SumOfTwoArray() {
        int [] arr1 = {1,2,3,4,5,6,7};
        int [] arr2 = {2,3,4,5,6,7,8};
        int sum1=0,sum2=0;
        int n=arr1.length;
        int m = arr2.length;

        for(int i =0; i<n; i++) {
              sum1+=arr1[i];
              sum2+=arr2[i];
        }
        System.out.println("Sum Of First Array: "+sum1);
        System.out.println("Sum of Second Array: "+ sum2);

    }

    public static void TwoArraySumInArray() {
        int [] arr1 = {1,2,3,4,5,6,7};
        int [] arr2 = {2,3,4,5,6,7,8};
        int sum = 0;
        int n = arr1.length;
        int m = arr2.length;
        int [] arr3 = new int[n];

        for(int i=0; i<n; i++)
        {
           arr3[i] = arr1[i]+arr2[i];
        }

        System.out.println("Sum of Elements in Array : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr3[i]+" ");
        }

    }

    public static void MergeTwoArray(){
        int [] arr1 = {1,2,3,4,5,6,7};
        int [] arr2 = {2,3,4,5,6,7,8};
        int n = arr1.length;
        int m =arr2.length;
        int [] arr3 = new int[n+m];

        System.arraycopy(arr1, 0, arr3, 0, n);
        System.arraycopy(arr2, 0, arr3, n + 0, m);
        System.out.println("Elements of Merger Array: ");

        Arrays.sort(arr3);
        for(int i = 0; i<(m+n); i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }

    public static void FindCommon(){
        int [] arr1 = {1,2,3,4,5,6,7};
        int [] arr2 = {2,3,4,5,6,7,8};
        int n = arr1.length;
        int m = arr2.length;

        for(int i =0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }

    public static void FindUnique(){
        int [] arr1 = {1,2,3,4,5,6,7};
        int [] arr2 = {2,3,4,5,6,8,7};
        int n = arr1.length;
        int m = arr2.length;
        for(int i =0; i<n; i++)
        {
            boolean found = false;
            for(int j = 0; j<m; j++)
            {
                if(arr1[i]==arr2[j])
                {
                     found = true;
                     break;
                }
            }
            if(!found)
            {
                System.out.print(arr1[i]+" ");
            }
        }

    }


}
