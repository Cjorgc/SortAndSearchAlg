package org.example.Search;

public class Binary {
    /*
        Always divide the array in 2, so if n is the length of the array, the sequence would be
        n / 2 -> result / 2 -> result / 2 .... and so on
        In a nutshell, the complexity expressed mathematically would be log(base2) n
    */
    public static int search(int [] arr, int target, int low, int top){
        if(isInvalidLowAndTop(arr, low, top)) return -1;

        int mid = low + ((top - low) / 2);

        if(arr[mid] == target) return mid;

        if(arr[mid] < target){
            return Binary.search(arr, target, mid +1 , top );
        } else{
            return Binary.search(arr, target, low , mid -1);
        }
    }

    private static boolean isInvalidLowAndTop(int[] arr, int low, int top) {
        return low < 0 || top > arr.length || low > top;
    }
}
