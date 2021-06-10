import java.util.*;

public class Chapter5_6 {
    public static void main(String[] args) {
        System.out.println(getInsertTime(new ArrayList())); // При добавлении элемента происходит перераспределение памяти.
        System.out.println(getInsertTime(new LinkedList()));
    }
    public static long getInsertTime(List list) {
        Date startTimr = new Date();
        insert10000(list);
        Date stopTimer = new Date();
        return stopTimer.getTime() - startTimr.getTime();
    }
    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
