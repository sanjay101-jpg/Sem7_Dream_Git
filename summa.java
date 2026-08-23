public class summa {
    private int[] arr = {10, 20, 30, 40};

    public static void main(String[] args) {
        summa obj = new summa();
        obj.removeLastElement();
    }

    public void removeLastElement() {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int lastIndex = arr.length - 1;
        int lastValue = arr[lastIndex];
        System.out.println("lastValue: " + lastValue);
    }
}