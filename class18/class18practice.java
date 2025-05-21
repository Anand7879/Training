package class18;

public class class18practice {
    public static void main(String[] args) {
        
        // Human obj = new Human();
        // obj.walk();
        // obj.run();

        // Demo obDemo = new Demo();
        // obDemo.display();

        // Animal obj = new Dog();
        // obj.makeSound();


        // Circle obj = new Circle();
        // System.out.print("Area Of Circle : ");
        // double result = obj.area();
        // System.out.println(result);

        // Car obj = new Car();
        // obj.start();
    }


    
}

// Q1. Create two interfaces Walkable and Runnable.
// Each should have a method: walk() and run() respectively.
// Then, create a class Human that implements both interfaces and defines both methods.
// Create a main method where an object of Human is created and both methods are called.

interface Walkable{
    void walk();
    void run();

}
interface Runnable{
    void walk();
    void run();  
}

class Human implements Walkable,Runnable{

    public void walk(){
        System.out.println("Walking");
    }
    public void run(){
        System.out.println("Running");
    }

}


// Q2. Create two interfaces A and B. Both interfaces should have a method named display().
// Then, create a class Demo that implements both interfaces.
// Implement the display() method and call it in the main method using a Demo object.

interface A{
    void display();

}
interface B{
    void display();
}

class Demo implements A,B {
 
      public void display(){
        System.out.println("Hello");
      }   
}

// Q3. Create an interface Animal with a method makeSound().
// Then, create a class Dog that implements Animal and overrides makeSound() to print "Bark".
// In the main method, use the interface reference to call the method from Dog.

interface Animal{
    void makeSound();
}

class Dog implements Animal{

 public void makeSound() {
        
        System.out.println("Bark");
    }

}


// Q4. Create an interface Shape with a method area().
// Then, create a class Circle that implements Shape and calculates the area using radius = 5.
// Print the area in the main method./

interface Shape{
    double  area();
}

class Circle implements Shape{

    public double area(){
        return (3.14*5*5);
    }
}

// Q5. Create an interface Vehicle with a default method start() that prints "Vehicle is starting...".
// Create a class Car that implements Vehicle.
// Call the default method from an object of Car in the main method.

interface Vehicle{
    default void start(){
   System.out.println("Vehical is starting.....");
     }
}

class Car implements Vehicle{

}
