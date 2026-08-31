public class TwoSum {
    int[] arr = {1, 4, 5, 6, 7};
    int target = 8;

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();

        for (int i = 0; i < obj.arr.length; i++) {
            for (int j = i + 1; j < obj.arr.length; j++) {
                if (obj.arr[i] + obj.arr[j] == obj.target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}