import java.util.*;
public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya");
    }
class Student{
    String name;
    int roll;


    Student(String name){
        this.name=name;
    }

}
    
}
