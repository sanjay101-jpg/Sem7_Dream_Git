public class miss_XOR {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int x = arr.length + 1;

        for (int i = 0; i < arr.length; i++) {
            x = x ^ (i + 1) ^ arr[i];
        }

        System.out.println(x);
    }
}