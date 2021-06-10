public class Chapter8_28 {
        public static Jedi jedi;

        static {
            jedi = new Jedi();
            jedi.name = "Anakin";
            System.out.println(jedi.name);
            double r= 9.46E15;
            double r1=9.46e15;
            //double r=2.9X106;
            double r3=326.75;
            String name = new String("");
        }

        public static void main(String[] args) {
            int balance = 10;
            while (balance >= 1){
             if (balance < 9)
                 break;
             balance = balance - 9;
            }
            System.out.println(balance);
        }

        public static class Jedi {
            public String name;
        }
    }