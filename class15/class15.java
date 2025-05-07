package class15;



// Inharitance
// class Animal{
      
//     void eat()
//     {
//         System.out.println(" I am Eating");
//     }
   
// }

// // Single Inheritance
// class Dog extends Animal{
//       void bark()
//       {
//          System.out.println("Bow Bow");
//       }
// }

// // Multilevel Inheritance
// class  puppy extends Dog{
//     void cute(){
//         System.out.println("I am Cute");
//     }
// }

// // Heirarical 
// class cat extends Animal{
//     void Cat(){
//         System.out.println("I am Cat");
//     }
// }


// Method OverLoading
// class Parent{
//     void sum(int a, int b)
//     {
//         System.out.println(a+b);
//     }
//     void sum(int a, int b,int c)
//     {
//         System.out.println(a+b+c);
//     }
// }


//Question1 : Write a Java program where:
// - Class Employee has method work()
// - Class Manager inherits Employee and has method attendMeeting()
// - Create an object of Manager and call both methods.

// class Employee{

//     void work(){
//         System.out.println("Employee Is Working");
//     }
// }
// class Manager extends Employee{
//     void attendMeeting()
//     {
//         System.out.println("Manager Is Attending A meeting");
//     }
// }

// //Question2 : Write a Java program where:
// // - Class Person has method displayName()
// // - Class Student inherits Person and adds method displayClass()
// // - Class Monitor inherits Student and adds method checkDiscipline()
// // - Create an object of Monitor and call all three methods.

// class Person{
//     String name;
//     Person(String name)
//     {
//         this.name = name;
//     }
//     void displayName(){
//         System.out.println("My name is "+ name);
//     }
// }
// class Student extends Person {

//     Student(String name) {
//         super(name);
//     }

//     void displayClass(){
//         System.out.println("B.Tech CSE");
//     }  
// }

// class Monitor extends Student{

//     Monitor(String name) {
//         super(name);
//     }

// void checkDiscipline(){
//     System.out.println("Diciplained");
// }
    
// }


// Method OverRiding
// class Ankit{
//     void eat()
//     {
//         System.out.println("Ankit Eat Moongfali Khale beta Moongfali");
//     }
// }
// class Anand extends Ankit{
//     void eat(){
//         System.out.println("Anand Eat Sada Bhojan");
//         super.eat();
//     }
// }


public class class15 {
    public static void main(String[] args) {
        
        // puppy p = new puppy();
        // p.bark();
        // p.cute();
        // p.eat();

        // cat c = new cat();
        // c.Cat();
        // c.eat();

        // Parent p = new Parent();
        // p.sum(40, 41);
        // p.sum(40, 041, 49);
        
        // Manager m = new Manager();
        // m.attendMeeting();
        // m.work();
        
        // Monitor m = new Monitor("Anand");
        // m.displayName();
        // m.displayClass();
        // m.checkDiscipline();

        // Anand A1 = new Anand();
        // A1.eat();
    }
    
}
