package org.example.Sort;

public class Bubble {
    /*
        Complexity O(n2)
     */

    //sort 2 gives better times for n really big
    public static void sort2(int [] arr){
        long start = System.nanoTime();
        int swap = 1;
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
        }
        long elapsedTime = System.nanoTime() - start;
        System.out.println("ElapsedTime : " + elapsedTime);
    }

    public static void sort(int[] arr){
        long startTime = System.nanoTime();
        boolean swap = false;
        int aux;

        for(int i = 0 ; i < arr.length - 1; i++){
            for (int j = 0 ; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                    swap = true;
                }
            }
            if (!swap) break;
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Elapsed time : " + elapsedTime);
    }
}
