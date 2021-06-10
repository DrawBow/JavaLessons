public class Chapter3{
    public static void displayInfo(){
        System.out.println("Вызывал меня?");
        int number = 3;
        System.out.println(number*number);
        System.out.printf("Квадрат %s равен %s\n", number, number*number);
        int i = 5;
        System.out.printf("Вызываю функцию sqr(%s) = %s\n", i, sqr(i));
        System.out.println((int)Math.pow(i, 2));
        print("The power is easy to use!");
        print("The power opens many opportunities!");
    }
    public static int sqr(int value) {
        return value * value;
    }

    static void print(String value){
      for(int i = 1; i <= 4; i++){System.out.println(value);}
    }
}