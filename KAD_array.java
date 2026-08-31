public class KAD_array {
    public static void main(String[] args) {
        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int cs = arr1[0];
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            cs = Math.max(arr1[i], cs + arr1[i]);
            max = Math.max(max, cs);
        }
        System.out.println("ans:" + max);
    }
}
