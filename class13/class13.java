package class13;

public class class13 {

    public static void main(String[] args) {
        Employee E1 = new Employee("Ankit Pal", 41);
        // Employee E2 = new Employee("Ankit Pal", 41,"Anj__i");

        
    }
    
}

class Employee{
    String name;
    int id;
    String FG;

    Employee(String name,int id)
    {
        this.name = name;
        this.id = id;
        System.out.println("Name : "+ name);
        System.out.println("ID : "+ id);
        System.out.println();
    }
    Employee(String name,int id,String FG)
    {
        this.name = name;
        this.id = id;
        this.FG = FG;
        System.out.println("Name : "+ name);
        System.out.println("ID : "+ id);
        System.out.println("FG Name : "+ FG);
        System.out.println();


    }
}
