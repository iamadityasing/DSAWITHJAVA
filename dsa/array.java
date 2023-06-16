package dsa;

import java.rmi.server.SocketSecurityException;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //store a number
        int a=15;
        //store a name 
        String name ="Aditya";

        //store  an array
        //syntax
        //datatype[] varible name =new datatype[size]
         
        //or directly   
        int[] rno={21,3,4,56,3,53,4,5};
        //index=   0  1 2  3 4  5 6 7
        // for (int i=0;i<rno.length;i++){
        //     System.out.println(" "+rno[i]);
        int rnos[]=new int[5];
        for(int j =0;j<rnos.length;j++){
            System.out.println("Enter "+j+"th number");
            rnos[j]=in.nextInt();
 
        }
        //for enhanced loop syntax is--->  for(data type  varible name:array to be traversed) 
        for (int element : rnos) {
            System.out.print(element+" ");
        }
        System.out.println("Now enter the characters");
        //for directly traversing the array 
        System.out.println(Arrays.toString(rnos));
            
        // }

    //    ARRAYS OF OBJECTS  

        //String array is used to create an array with string
        String[] arr=new String[5];
        for (int i =0; i < arr.length;i++){
            arr[i]=in.next();
        }
        System.out.println(Arrays.toString(arr));

    }
}
