package class23;

// Day: 26
// Date: 02/06/2025
// Day: Monday

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int age;
    String name;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name;
    }

    public int compareTo(Student s) {
        return this.age - s.age;
    }
}

class SortByName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}

class SortByAge implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.age- s2.age;
    }
}

class class23{
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(0);
        // list.add(5);
        // list.add(3);
        // Collections.sort(list);
        // System.out.println(list);
        // ArrayList<Student> list = new ArrayList<>();
        // list.add(new Student(19, "Ankit"));
        // list.add(new Student(20, "Pravesh"));
        // list.add(new Student(10, "Anand"));
        // Collections.sort(list);
        // for(Student s : list) {
        //     System.out.println(s.toString());
        // }
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(20, "Pravesh"));
        list.add(new Student(19, "Ankit"));
        list.add(new Student(80, "Anand"));
        Collections.sort(list, new SortByName());
        for(Student s : list){
            System.out.println(s.toString());
        }
        Collections.sort(list, new SortByAge());
        for(Student s : list){
            System.out.println(s.toString());
        }
    }
}