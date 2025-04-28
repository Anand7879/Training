package class10;

public class class10 {
    public static void main(String[] args) {
        int [] arr = {2,4,2,6,3};
        // BubbleSort(arr);
        // Question();
        Question2();

    }

public static void BubbleSort(int [] arr)
{
    for(int i = 0; i<arr.length-1; i++)
    {
         boolean flag= false;
          for(int j = 0; j<arr.length-1;j++)
          {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;

                    flag = true;
                }
                if(flag)
                 break;
            }
     }
     for(int i = 0; i<arr.length; i++)
     {
        System.out.println(arr[i]);
     }
}

public static void Question() {
    int[][] arr = {
        {1, 2, 3},
        {0, 4, 5},
        {1, 8, 9}
    };

    int rows = arr.length;
    int cols = arr[0].length;
   
    boolean[] zeroRows = new boolean[rows];
    boolean[] zeroCols = new boolean[cols];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (arr[i][j] == 0) {
                zeroRows[i] = true;
                zeroCols[j] = true;
            }
        }
    }

    
    for (int i = 0; i < rows; i++) {
        if (zeroRows[i]) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = 0;
            }
        }
    }


    for (int j = 0; j < cols; j++) {
        if (zeroCols[j]) {
            for (int i = 0; i < rows; i++) {
                arr[i][j] = 0;
            }
        }
    }

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}
    
public static void Question2(){
    int[][] arr = {
        {1, 2, 3},
        {0, 4, 5},
        {1, 8, 9}
    };
int row = 0;
int column = 0;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == 0) {
                row = i;
                column = j;
            }
        }
    }
    
    for(int j = 0; j<arr[row].length; j++)
    {
        arr[row][j]=0;
    }
    for(int j = 0; j<arr[row].length; j++)
    {
        arr[row][j]=0;
    }



    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j <arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}
}
