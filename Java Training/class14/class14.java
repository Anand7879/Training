package class14;

class Main{
    void sum(){
        System.out.println(this);
    }
    }

class student{
    int a;
     student(int a)
     {
        //a=a;
        this.a = a;
     }

     void print(){
        System.out.println(a);
     }
}

//CONSTRUCTOR CHAINING
class ConstructorChaining{
    ConstructorChaining(){
        System.out.println("Mai Hu Ankit Don!!!");
    }
    ConstructorChaining(int a)
    {
        this();
        System.out.println(a);
    }
    ConstructorChaining(int a,int b)
    {
       this(6);
       System.out.println(a + " "+ b);
    }
}
public class class14 {

    public static void main(String[] args) {
        // student s= new student(1000000);
        // s.print();


        // Main obj = new Main();
        // System.out.println(obj);
        // obj.sum();

        ConstructorChaining  ch = new ConstructorChaining(3,8);
    }
    
}
