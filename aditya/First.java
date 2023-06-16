import java.util.Scanner;

class First
{
 int add()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number");
        int a=sc.nextInt();
        System.out.print("Enter second number");
        int b=sc.nextInt();
        int c=a+b;
        return c;
        
    }
 int subtract()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number");
        int a=sc.nextInt();
        System.out.print("Enter second number");
        int b=sc.nextInt();
        int c=a-b;
        if(c<0)
        {
            System.out.print("enter the first numner as the greater number\n");
            First f=new First();
            int z=f.subtract();

            return z;
        }
        else
        {
            return c;
        }
        
        
        
    }
 int multiply()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number");
        int a=sc.nextInt();
        System.out.print("Enter second number");
        int b=sc.nextInt();
        int c=a*b;
        return c;
        
    }
 float divide()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number");
        float a=sc.nextFloat();
        System.out.print("Enter second number");
        float b=sc.nextFloat();
        float c=a/b;
        return c;
        
    }
    
 public static void main(String[] e)
 {
     Scanner sc=new Scanner(System.in);
     
     
     
     
     First f=new First();
     float z;
     z=f.multiply();
     System.out.print("division of two numbers are"+z);
     
    
        
    
     
 }
    
}