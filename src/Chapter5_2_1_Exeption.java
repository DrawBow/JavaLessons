import java.util.*;

public class Chapter5_2_1_Exeption {
    public static void main(String[] args){
      symplyExeption();
      try {
          method1();
      }
      catch(Exception1 e) {
          System.out.println(e.toString()); // ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 3
      }

    }

    private static void symplyExeption() {
        try {
            int a = 42 / 0;
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getClass().getSimpleName()); // ArithmeticException / by zero
        }
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (Exception e) {
            System.out.println(e.toString()); // java.lang.NullPointerException
        }
        try {
            int[] m = new int[3];
            m[6] = 5;
        } catch (Exception e) {
            System.out.println(e.toString()); // ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 3
        }
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (Exception e) {
            System.out.println(e.toString()); //IndexOutOfBoundsException: Index 18 out of bounds for length 0
        }
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (Exception e) {
            System.out.println(e.toString()); // NullPointerException
        }
    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }
}
    class Exception1 extends Exception {
    }
    class Exception2 extends Exception1 {
    }
    class Exception3 extends Exception2 {
    }

