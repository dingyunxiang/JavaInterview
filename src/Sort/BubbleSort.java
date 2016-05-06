package Sort;

import java.util.Arrays;

/**
 * Created by dingyunxiang on 16/5/6.
 */
public class BubbleSort {


    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] arr = {5, 4, 3,2,1};
        sort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //升序
    public void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = length - 1; i >= 0; i--) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int index = arr[i];
        arr[i] = arr[j];
        arr[j] = index;
    }

}
