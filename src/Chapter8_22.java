public class Chapter8_22 {
    /*
    Требования
    Для вывода используй только переменные из класса Constants.
    В классе MultiTroopTransport реализуйте метод printlnUsage, чтобы он выводил на экран "I can transport drones".
    В классе AllTerrainArmoredTransport реализуйте метод printlnUsage, чтобы он выводил на экран "I can shot".
    Создайте public static класс TransportResistance.
    Создайте public static класс TransportFirstOrder.
    Унаследуйте MultiTroopTransport и AllTerrainArmoredTransport от TransportResistance и TransportFirstOrder, подумайте, какой класс для кого.
    В классе TransportResistance реализуйте метод printlnUsage, чтобы он выводил на экран "I am from Resistance".
    В классе TransportFirstOrder реализуйте метод printlnDesire, чтобы он выводил на экран "I am from First Order".
    В классах TransportResistance и TransportFirstOrder для метода printlnDesire расставьте различными способами модификаторы доступа так,
     чтобы в классах MultiTroopTransport и AllTerrainArmoredTransport выполнялось расширение видимости.
    */
        public static void main(String[] args) {
            MultiTroopTranspor.printlnUsage();
            AllTerrainArmoredTransport.printlnUsage();
        }

        public static class MultiTroopTranspor extends TransportFirstOrder{
            public static void printlnUsage() {
                System.out.println(Constants.MTT);
            }
        }
        public static class AllTerrainArmoredTransport extends TransportResistance{
            public static void printlnUsage() {
                System.out.println(Constants.ATAT);
            }
        }
        public static class TransportResistance {
            public static void printlnUsage() {
                System.out.println(Constants.RESISTANCE);
            }
        }

        public static class TransportFirstOrder{
            protected static void printlnUsage() {
                System.out.println(Constants.FIRSTORDER);
            }
        }

        public static class Constants {
            public static String MTT = "I can transport drones";
            public static String ATAT = "I can shot";
            public static String RESISTANCE = "I am from Resistance";
            public static String FIRSTORDER = "I am from First Order";
        }
    }