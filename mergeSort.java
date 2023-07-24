package CrackYourPlacement;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {


    void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> a = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                a.add(arr[left]);
                left++;
            }else{
                a.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            a.add(arr[left]);
            left++;
        }
        while(right<=high){
            a.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high; i++){
            arr[i]=a.get(i-low);
        }


    }
    void ms(int[] arr, int low, int high){
        if(low==high) return;
        int mid=(low+high)/2;
        ms(arr, low, mid);
        ms(arr,mid+1, high);
        merge(arr, low, mid, high);
    }
    void ms1 (int[] arr) {
        // add your logic here
        ms(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,1,3};
        mergeSort solution =new mergeSort();
        System.out.println("Original array: " + Arrays.toString(arr));
        solution.ms1(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));


    }


}
