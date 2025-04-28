package class10;

public class class10 {
    public static void main(String[] args) {
        int [] arr = {2,4,2,6,3};
        // BubbleSort(arr);
         Question();

    }

public static void BubbleSort(int [] arr){
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
    
// Wap to If in a Matrix any index has 0 then make all the elements
// zero of column and row of that indices
public static void Question(){
    int[][] arr = {
        {1, 2, 3},
        {0, 0, 5},
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
    for(int j = 0; j<arr.length; j++)
    {
        arr[j][column]=0;
    }



    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j <arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}




}
