package Sort;

import java.util.Arrays;

/**
 * Created by dingyunxiang on 16/5/6.
 */
public class SelectSort {

    public static void main(String[] args) {
        SelectSort sort = new SelectSort();
        int[] arr = {9,4,3,3,1};
        sort.selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public void selectSort(int[] arrs){
        int length = arrs.length;
        for(int i = 0;i < length;i++){
            int index = arrs[i];
            int num = i;
            for(int j = i;j<length;j++){
                if(arrs[j] < index){
                    index = arrs[j];
                    num = j;
                }
            }
            if(i != num){
                swap(arrs,i,num);
            }
        }
    }


    public void swap(int[] arr, int i, int j) {
        int index = arr[i];
        arr[i] = arr[j];
        arr[j] = index;
    }


}
