package org.example.Sort;

/*
    Complexity O(n log n)
    Space N
 */

public class Merge {
    public static void sort(int [] arr, int l, int r){
        int mid;

        if(l >= r){
            return ;
        }
        mid = l + (r - l) / 2;
        sort(arr,l, mid);
        sort(arr, mid + 1, r);

        merge(arr, l, mid, r);

    }

    private static void merge(int[] arr, int l, int mid, int r) {
        //Size of subarrays
        int n1 = mid - l + 1;
        int n2 = r - mid;

        //Temporary arr
        int [] L = new int[n1];
        int [] R = new int[n2];

        //Copy to temp
        for(int i = 0 ; i < n1 ; i++){
            L[i] = arr[l + i];
        }
        for(int j = 0 ; j < n2 ; j++){
            R[j] = arr[mid + 1 + j];
        }

        //Compare an merge
        int i = 0, j = 0;
        int k = l;

        while(i < n1 && j < n2){
            if(L[i] < R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }




    }
}
