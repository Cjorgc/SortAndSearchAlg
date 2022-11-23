package org.example.Search;

import java.util.Arrays;

public class Linear {
    /*
        Complxity -> O(n)

    */
    public static int search(double[] array, double target){
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == target) return i;
        }
        return -1;
    }
}
