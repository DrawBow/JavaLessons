/*
Упростите код:

уберите всё то, что будет генерироваться автоматически при компиляции.
уберите все наследования классов, которые и так будут добавлены автоматически при компиляции.
уберите все конструкторы, которые создаются и добавляются автоматически.

В классе Car не должно быть явно реализованных конструкторов без параметров.
В классе Machine не должно быть явно реализованных конструкторов без параметров.
Класс Car должен быть потомком класса Machine.
В коде не должно быть явного наследования от Object (extends Object).
Класс Car не должен явно наследовать интерфейс Runnable.
 */

public class Chapter8_26 {
    public static void main(String[] args) {
      //double d = 12381923719d;
      //float f;
      //f = (float)d;

      String s = new String("Figna");
      Object o = s;
      String d = (String)o;
      System.out.println(s == o);
        System.out.println(s == d);
      System.out.println(s.equals(d));
      d = "Figna";
      System.out.println(s == d);
      System.out.println(s.equals(d));

      int x = -2;
      int y = 10;
      while(x<y){
          x = x + 1;
          if (x>0) {y = y - 2;}
          else {y=y-1;};
      }
        System.out.println("res=" + (y+x*10));

    }

    public interface Runnable {}

    public class Machine implements Runnable {
        public Machine(int i) {
        }
    }

    public class Car extends Machine {
       public Car() {
           //int init = 10;
           super(40);
       }
    }
}