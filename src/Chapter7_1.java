//  Перегрузка операторов
public class Chapter7_1 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new AZI3()));
        System.out.println(getObjectType(new B21()));
        System.out.println(getObjectType(new IG88()));
        System.out.println(getObjectType(new R2D2()));
    }
    public static String getObjectType(Object o) {
       return o.getClass().getSimpleName();
    }

    public static class AZI3 {
    }
    public static class B21 {
    }
    public static class IG88 {
    }
    public static class R2D2 {
    }
    public static abstract class Starship {
       public abstract String getName();
    }

    public static abstract class Rocket implements Falcone {
        public abstract void fly();
        public abstract void Shoot();
    }

    public static abstract class Rocket1 implements Falcone {
        public abstract void fly();
        public abstract void Shoot();
    }
    public interface Falcone{
        public void fly();
        public void Shoot();
    }
}


