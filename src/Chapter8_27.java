import java.util.HashMap;
import java.util.Map;


public class Chapter8_27 {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(1.1, "one");
        labels.put(1.2, "two");
        labels.put(1.3, "three");
        labels.put(1.4, "four");
        labels.put(1.5, "five");
    }

    int intVar = 10;
    double doubleVar = 12.4;
    Double DoubleVar = 15.3;
    boolean booleanVar = true;
    Object ObjectVar = null;
    Exception ExceptionVar ;
    String StringVar = "Bla";

    public static void main(String[] args) {
        System.out.println(labels);
    }
}