package org.example.Sort;

public class BubbleRecursive {
    /*
        Complexity O(n * n)
     */
    public static void sort(int[] arr, int n){
        int aux;
        int counter = 0;
        for(int i = 0 ; i < n - 1 ; i ++){
            if(arr[i] > arr[i + 1]){
                aux = arr[i];
                arr[i] = arr[i + 1];
                arr[ i + 1] = aux;
                counter++;
            }
        }
        if(counter == 0) return;
        BubbleRecursive.sort(arr, n -1);
    }
}
