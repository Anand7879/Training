import java.util.ArrayList;
import java.util.Arrays;

public class something {
    public static void main(String[] args) {
        
        int[] arr = {2,3,1,2,3};

        Arrays.sort(arr); // 1 2 2 3 3
         
        ArrayList<Integer> list1 = new ArrayList<>(); 

        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] == arr[i+1] && !list1.contains(arr[i]))
            {
                list1.add(arr[i]);
            }
        }

        System.out.println(list1);

    }
}