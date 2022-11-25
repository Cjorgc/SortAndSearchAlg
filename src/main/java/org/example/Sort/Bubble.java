package org.example.Sort;

public class Bubble {
    public static void sort(int [] arr){
        int swap = 1;
        int iterations = 0;
        int aux;
        while(swap > 0){
            swap = 0;
            for(int i = 0 ; i < arr.length - 1 ; i++ ){
                if(arr[i] > arr[i + 1]){
                    aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                    swap ++;
                }
            }
            iterations++;
        }
    }

    public static void sort2(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
          for (int j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1]) {
              // swap arr[j+1] and arr[j]
              int temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
            }
    }
}
