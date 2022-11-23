package org.example.Sort;

public class Selection {
    /*
        Complexity O(n2)
        Auxiliary space O(1)
    */
    public static void sort(int [] arr){
        int aux;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if (arr[j] < arr[i]) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
