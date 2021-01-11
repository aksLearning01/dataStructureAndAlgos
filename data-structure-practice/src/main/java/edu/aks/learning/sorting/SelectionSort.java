package edu.aks.learning.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {5, 7, 2, 9, 1, 19, 6};
        int[] b = sort(a);

        for (int i : b) {
            System.out.print(" " + i);
        }

    }

    public static int[] sort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }
            int temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
        }
        return a;

    }


}
