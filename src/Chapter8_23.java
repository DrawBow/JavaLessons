public class Chapter8_23 {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }
    public static void printMatrix(int m, int n, String value) {
        System.out.println("fill with String objects");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}