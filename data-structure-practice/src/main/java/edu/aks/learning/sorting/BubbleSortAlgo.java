package edu.aks.learning.sorting;

public class BubbleSortAlgo {

    public static void main(String[] args) {
        int[] a={5,7,2,9,1};
        int[] b = sort(a);

        for (int i : b) {
            System.out.print(" " + i);
        }

    }

    public static int[] sort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }


}
