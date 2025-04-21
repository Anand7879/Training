package class6;

public class class6 {
    public static void main(String[] args) {
//        countElements();
//convert1DArray();
    matrix_multiplication();
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


}