package Sort;

import java.util.Arrays;

/**
 * Created by dingyunxiang on 16/5/6.
 */
public class InsertSort {
    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        int[] arr = {9,4,12,3,1};
        sort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public void insertSort(int[] arrs){
        int length = arrs.length;
        for(int i=0;i<length;i++){
            int select = arrs[i];
            int j = i;
            for(; j>0 && select<arrs[j-1];j--){
               arrs[j] = arrs[j-1];
            }
            arrs[j] = select;
        }


    }


    public void swap(int[] arr, int i, int j) {
        int index = arr[i];
        arr[i] = arr[j];
        arr[j] = index;
    }



}
