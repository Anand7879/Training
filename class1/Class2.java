import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        System.out.println("To Solve :"+"\n"+"1.Add(+)"+"\n"+"2.Sub(-)"+"\n"+"3.Multiplication(*)"+"\n"+"4.Division(/)");
//        num = sc.nextInt();
        char c = sc.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.print("Sum IS : ");
                System.out.println(a + b);
                break;
            case '-':
                System.out.print("Subtraction IS : ");
                System.out.println(a-b);
                break;
            case '*':
                System.out.print("Multiplication IS : ");
                System.out.println(a*b);
                break;
            case '/':
                System.out.print("Division IS : ");
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }

}
