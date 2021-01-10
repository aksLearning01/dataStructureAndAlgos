package edu.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please provide input for testing without recursion");
        Integer n =Integer.parseInt(br.readLine());
        System.out.println("Febonacci series till this number is ");
        feb(n);

        System.out.println("<<<<< With Recursion >>>>>");
        for(int i=1;i<n;i++){
            System.out.print(recFeb(i)+" ");
        }

    }

    public static void feb(int n){
        int x=1;
        int y=1;
        int z=0;
        System.out.print(" "+x);
        System.out.print(" "+y);
        while(z<n){
            z=x+y;
            x=y;
            y=z;
            System.out.print(" "+z);
        }
    }

    public static int recFeb(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        return recFeb(n-2)+recFeb(n-1);
    }

}
