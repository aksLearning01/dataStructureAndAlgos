package edu.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please provide input");
        Integer n =Integer.parseInt(br.readLine());
        System.out.println("Factorial of the number is " +fact(n));
    }

    public static int fact(int n){
        if(n==1)return 1;
        while(n>=1){
            return n*fact(n-1);
        }
        return n;
    }

}
