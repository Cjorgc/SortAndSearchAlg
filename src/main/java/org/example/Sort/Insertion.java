package org.example.Sort;

    /*
        Complexity O(n^2)
        Auxiliary space N(1)
     */

public class Insertion {
    public static void sort(int [] arr){
        for(int i = 0 ; i < arr.length - 1 ; i ++){
            if(arr[i] > arr[i + 1]){
                swap(arr, i, i + 1);
                for(int j = i ; j > 0 ; j --){
                    if(arr[j] < arr[j - 1]){
                        swap(arr, j, j -1);
                    } else break;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int aux;
        aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }
}
