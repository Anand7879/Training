package class17;

class student{
    //Design a class `Student` with private variables `name` and `marks`.
    // Write methods to set and get the values. 
    //Also, write a method to print student details.

    private String name;
    private int marks;

    public void setValues(String name, int marks){
         this.name = name;
         this.marks = marks;        

    }
    public int getMarks(){
        return marks;
    }
    public void print(){
        System.out.println("Name : "+name);
    }

}


class Temperature {
        //Write a class `Temperature` that has a private variable `celsius`.
        //Provide methods to convert and return the temperature 
        //in Fahrenheit using getter


    private double celsius;

    // Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter for Celsius
    public double getCelsius() {
        return celsius;
    }

    // Getter for Fahrenheit
    public double getFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32;
    }

}

class Rectangle{
    //Create a class `Rectangle` with private fields `length` and `width`.
    //Write setter methods to assign values and
    //getter methods to return area and perimeter.

    private int length,width;

    public void setter(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return  length*width;
    }

    public int getPerimeter(){
        return 2*(length+width);
    }
}

public class class17Practice {
    
    public static void main(String[] args) {
        
        // student s = new student();
        // s.setValues("Anand", 85);
        // s.print();
        // System.out.print("Marks : "+ s.getMarks());
        
        // Temperature temp = new Temperature(25.0);
        // System.out.println("Temperature in Celsius: " + temp.getCelsius() + "°C");
        // System.out.println("Temperature in Fahrenheit: " + temp.getFahrenheit() + "°F");
         
        // Rectangle r1 = new Rectangle();
        // r1.setter(5, 3);
        // System.out.println("Area : "+ r1.getArea());
        // System.out.println("Perimeter : "+ r1.getPerimeter());
        

    }
    
}
