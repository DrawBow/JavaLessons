import java.io.IOException;

public class Chapter4 {
    public static void main(String[] args) throws Exception {
        task1();
    }

    public static void task1() {
        int[] array = initArr();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initArr() {
        int[] array = new int[] {5, 11, 13, 5, 120, 18};
        return array;
    }

    public static int max(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length ; i++) {
          result = Integer.max(result, array[i]);
        }
        return result;
    }
}
