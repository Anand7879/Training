package class3;

public class class3 {
    public static void main(String[] args) {
//pattern1(5);
//pattern2(5);
//    pattern3(6);
//    pattern4(6);
//pattern5(3);
// pattern5(5);
//    pattern6(6);
    pattern7(6);
    }

    public static void pattern1(int n){
        for(int i = 0; i<n; i++)
        {
            for(int j =0; j<n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i = 0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i = 1; i <= n; i++)
        {
            for(int j  = 0; j < i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i = 0; i < n; i++)
        {
            for(int j  = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i = 1; i<=n; i++)
        {
            for(int j=i; j<n; j++)
            {
                System.out.print(" ");
            }

            /* Print star in increasing order or row */
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            /* Move to next line */
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i = 1; i<=n; i++)
        {
            for(int j = 0; j<i; j++)
            {
                System.out.print("*");
            }
            for(int j=0; j<(2*i-1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for(int i = 1; i<=n; i++)
        {
            for(int j = n; j<i; j--)
            {
                System.out.print(" ");
            }
            for(int j=(2*i-1); j<0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


