package PracticeQues;

public class TwoDArray {
    public static void main(String[] args) {
        // MatrixPrint();
        // SumOFAll();
        // RowWiseSum();
        // ColoumWiseSum();
        MaxElement();
        MinElement();
    }
    
public static void MatrixPrint()
{
    int [][] arr ={{1,2,3},{2,3,4},{3,2,1}};

    for(int i = 0; i<arr.length; i++)
    {
        for(int j = 0; j<arr[i].length;j++)
        {
            System.out.println("a["+i+"]"+"["+j+"] = "+ arr[i][j]);
        }
    }
}

public static void SumOFAll()
{
    int [][] arr ={{1,2,3},{2,3,4},{3,2,1}};
    int sum = 0;   
    for(int i = 0; i<arr.length; i++)
    {
        for(int j = 0; j<arr[i].length;j++)
        {
           sum+=arr[i][j];
        }
    }
    System.out.println("Sum = "+sum);
}

public static void RowWiseSum()
{
    int [][] arr ={{1,2,3},{2,3,4},{3,2,1}};
    int sum = 0;   
    for(int i = 0; i<arr.length; i++)
    {     
        sum =0;
        for(int j = 0; j<arr[i].length;j++)
        {
           sum+=arr[i][j];
        }
        System.out.println("Sum Of "+(i+1)+" row = "+sum);

    }
}
public static void ColoumWiseSum()
{
    int [][] arr ={{1,2,3},{2,3,4},{3,2,1}};
    int sum = 0;   
    for(int i = 0; i<arr[0].length; i++)
    {     
        sum =0;
       for(int j = 0; j<arr.length;j++)
       {
            sum+=arr[j][i];
       }
    
    System.out.println("Sum Of "+(i+1)+" coloum = "+sum);
    }

}

public static void MaxElement()
{
    int [][] arr ={{1,2,3},{2,3,4},{3,2,1}};
    int max = 0;

    for(int i = 0; i<arr.length; i++)
    {     
   
       for(int j = 0; j<arr[i].length;j++)
       {
            if(arr[i][j]>max)
            max= arr[i][j];
       }
    }
    System.out.println("Max Element Is : "+max);

}

public static void MinElement()
{
    int [][] arr ={{1,2,3},{2,3,4},{3,2,1}};
    int min = arr[0][0];

    for(int i = 0; i<arr.length; i++)
    {     
   
       for(int j = 1; j<arr[i].length;j++)
       {
            if(arr[i][j]<min)
            min= arr[i][j];
       }
    }
    System.out.println("Max Element Is : "+min);

}
}
 
