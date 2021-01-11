package edu.aks.learning.sorting;

public class MergeSort {

    public static void main(String[] args) {
       int[] a = {5, 7, 2, 9, 1, 19, 6};
      //  int[] a = {7,5};
        mergeSort(a,0,a.length-1);

        for (int i : a) {
            System.out.print(" " + i);
        }

    }

    public static void mergeSort(int[] a,int start,int end) {
        if(start<end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    private static void merge(int[] a, int start, int mid, int end) {

        int n1= mid-start+1;
        int n2=end-mid;

        int[] la= new int[n1];
        int[] ra= new int[n2];

        for(int i=0;i<n1;i++){
            la[i]=a[start+i];
        }
        for(int j=0;j<n2;j++){
            ra[j]=a[mid+1+j];
        }

        int i=0,j=0,k=start;
        while(i<n1 && j<n2){
            if(la[i]<ra[j]){
                a[k]=la[i];
                i++;
            }else{
                a[k]=ra[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=la[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=ra[j];
            j++;
            k++;
        }
    }


}
