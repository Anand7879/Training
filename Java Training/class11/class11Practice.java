package class11;

import java.util.Scanner;

class Student{
   String name;
   int rollNumber;
   double marks;

   Student(String n,int rollN,double M)
   {
    name = n;
    rollNumber= rollN;
    marks = M;
    System.out.println("Name Of Student: "+ name);
    System.out.println("RollNumber: "+ rollNumber);
    System.out.println("CGPA: "+ marks);
    System.out.println();

   }
}

class BankAccount
{
    String AccountHolder;
    int AccountNumber;
    double balance;
        
    BankAccount(String name,int AC,double bal)
    {
        AccountHolder = name;
        AccountNumber = AC;
        balance = bal;
    }
    void getdetails()
    {
        System.out.println("Account Holder Name : "+ AccountHolder);
        System.out.println("Account NUmber : "+ AccountNumber);
        System.out.println("Balance Is: "+ balance);
    }
    void withdrowMoney()
    {
        Scanner sc  = new Scanner(System.in);
        int n;
        System.out.print("Enter Amount to Withdrow: ");
        n = sc.nextInt();

        if(n>balance)
        {
            System.out.println("InSufficiant Balance!");
        }else if(n<=balance)
        {
            balance-=n;
            System.out.println("Succesfully Withdraw");
            System.out.println("Now Balance is: " + balance);
        }else
        System.out.println("Entered Amount is Wrong");
    
    }
    void DepositMoney()
    {
        Scanner sc  = new Scanner(System.in);
        int n;
        System.out.print("Enter Amount to Deposite: ");
        n = sc.nextInt();

        balance+=n;
        System.out.println("Succesfully Deposited Amount "+ n);
        System.out.println("Now Balance Is: "+ balance);
    }
}

class car{
    String Brand;
    String Model;
    String price;

   car(String B,String M,String P)
   {
     Brand = B;
     Model = M;
     price = P;
    System.out.println("Car Brand: "+ Brand);
    System.out.println("Model: "+ Model);
    System.out.println("Price: "+ price);
    System.out.println();

   }
}

public class class11Practice {
    public static void main(String[] args) {

        // Student s1 = new Student("Pravesh", 157,7.3 );
        // Student s2 = new Student("Anand", 034,7.8 );
        // Student s3 = new Student("Ankit", 041,8.0 );
       
        // BankAccount A1 = new BankAccount("Anand", 11535, 500);
        // A1.getdetails();
        // A1.withdrowMoney();
        // A1.DepositMoney();

        // car c1 = new car("Toyota","Fortuner","38L");
        // car c2 = new car("Volvo","XC90","80L");
        // car c3 = new car("Mahindra","Thar","21L");
        // car c4 = new car("Maruti","Brezza","15L");
        
    }
    
}
