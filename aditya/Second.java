import java.util.Scanner;

class Second{
    void abc(int x){
        System.out.print(x*x+"\n");
    }
    int xyz(int x,int y){
        int c=x+y;
        return c;
    }
    Second(int x, int y){
        System.out.print("Welcome"+x*y);
    }
public static void main(String[] e){
    Second f=new Second(3,8);
    f.abc(5);
    int z=f.xyz(5,10);
    System.out.print("\n"+z);
    
}
}
    
    
    
    
    
