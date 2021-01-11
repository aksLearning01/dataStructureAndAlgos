package edu.aks.learning.sorting;

public class InsertionSort {


    public static void main(String[] args) {
        int[] a = {5, 7, 2, 9, 1};
        int[] b = sort(a);

        for (int i : b) {
            System.out.print(" " + i);
        }

    }

    public static int[] sort(int[] a) {


        for(int i=1;i<a.length;i++){
            int curr = a[i];
            int j=i-1;
            while(j>=0 && curr<a[j]){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=curr;
        }
        return a;

    }
}
