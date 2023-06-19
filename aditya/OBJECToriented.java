
import java.util.*;
public class OBJECToriented{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip() );
        p1.setColor("green");
        System.out.println(p1.getColor());
        
        
        
        
        
        
        BankAccount myAcc=new BankAccount();
        myAcc.username="Aditya";
        myAcc.setPassword("hello123");
        //here we will only be able to change the password
        //but not be able to display it ;since it is a private varible
        
    }

} 


class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }



}
class Pen{
    private String  color;
    private int tip;

    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip(int Tip){
        this.tip=Tip;

    }
    String getColor() {
        return this.color;
    }
    int getTip(){
        return this.tip;

    }
}
class Student{
    String name;
    int age;
    float percentage;
    
    void calcPercentage( int phy ,int math ,int chem ){
        percentage=(math+phy+chem)/3;
    }
}
