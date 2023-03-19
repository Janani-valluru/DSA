import java.util.*;

public class reversearray {

    public static void main(String[] args) {

        int arr[] = { 1, 9, 4, 6, 7 };
        int n = arr.length;
        rev_array(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void rev_array(int[] arr, int start, int end) {
        if (start > end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        rev_array(arr, start + 1, end - 1);
    }
}