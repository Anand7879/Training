public class something {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int[] res = new int[arr.length];
        for(int i = 0; i<arr.length; i++)
        {
            int temp = 1;
            for(int j = 0; j<arr.length; j++)
            {
                if(i==j)
                 continue;

                 temp = temp*arr[j];

            }
           res[i] = temp;
        }

        for(int i = 0; i<res.length; i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    
}
