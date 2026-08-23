import java.util.Arrays;

public class rev_Array_rec {
    static void revA(int[] arr1, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr1[left];
        arr1[left] = arr1[right];
        arr1[right] = temp;
        revA(arr1, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        revA(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
