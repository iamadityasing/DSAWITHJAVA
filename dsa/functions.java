package dsa;

import java.util.Arrays;

public class functions {
    public static void main(String[] args) {
        // int a=20;
        // int b=40;
        // int temp=a;
        // a=b;
        // b=temp;
        // swap(a, b);
        // System.out.println(a+"  "+b);
        // //method to print the arrays 
        // int arr[]={2,5,6,7,8,};
        // System.out.println(Arrays.toString(arr));
        multiple(2,3,4,5,6,7,8);//any number of agruments
        //multiple agruments at a time with varible length and always add the variblbe agrument at the end
        multipleargs(3, 04, "helloworld");
    }  

    static void multiple(int...v){
        System.out.println(Arrays.toString(v));

    }
    static void multipleargs(int a, int b,String...v){
        System.out.println(Arrays.toString(v));

    }


    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    
}
