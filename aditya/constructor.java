import java.util.*;
public class constructor{
    public static void main(String[] args) {
        Employee ac =new Employee();
        //ac.setName("Aditya");
        //ac.setId(1);
        System.out.println(ac.getName()+"\n"+ac.getId());
    }
    
    
}  


class Employee{
    private int id;
    private String name;
    //Constructors
    public Employee(){
        id=45;
        name="Your name here"; 
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int a){
        this.id=a;
    }
}




