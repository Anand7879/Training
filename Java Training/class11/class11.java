package class11;


class AreaOfRectangle{
    int length;
    int width;

    AreaOfRectangle(int l,int w)
    {
        length = l;
        width  = w;
        System.out.println("Length = "+ length);
        System.out.println("Width = "+ width);
        System.out.println("Area Of Rectangle = " + length*width);
        System.out.println();
    }
    
}


class student{
    // String FirstName = "Anand";
    // String LastName = "Patel";
    String FirstName;
    String LastName;

    student(String Fname,String Lastname)
    {
        FirstName = Fname;
        LastName = Lastname;
        System.out.println(FirstName + " "+ LastName);
    }

}

public class class11 {
public static void main(String[] args) {
    //  StringSort();
        // PrintAlphbets();

        // student obj = new student();
        // student s1 = new student("Anand", "Patel");

        AreaOfRectangle A1 =new AreaOfRectangle(10, 15);
        AreaOfRectangle A2 =new AreaOfRectangle(10, 20);
       
    }
    
public static void StringSort()
{
    String [] str = {"A","B","C","F"};
    int n = str.length;
    
    for(int i = 0; i<n-1; i++)
   {
        boolean flag= false;
         for(int j = 0; j<n-1;j++)
         {
               if(str[j].charAt(0)>str[j+1].charAt(0))
               {
                   String temp = str[j];
                   str[j] = str[j+1];
                   str[j+1]= temp;

                   flag = true;
               }
               if(flag)
                break;
           }
    }
    for(int i = 0; i<str.length; i++)
    {
       System.out.println(str[i]);
    }
}


public static void PrintAlphbets()
{
    char c = 65;

    for(c=65; c<=90; c++)
    {
        System.out.println(c);
    }
    for(c=97; c<=122; c++)
    {
        System.out.println(c);
    }

}

}







