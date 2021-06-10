import java.io.*;
import java.util.*;

public class Chapter2 {
   public void Call() {
      System.out.println("======= Chapter2 Begin ==========");
       // Task1();
       // Task2();
        Task3();
       // Task4();
       Task5();
      System.out.println("======= Chapter2 End   ==========");
   }
   private void Task1(){
           System.out.println(" = Task 1 Input Buffer =");
           InputStream inputStream = System.in;
           Reader inputStreamReader = new InputStreamReader(inputStream);
           BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
           try {
               System.out.println("Type smf and press Enter");
               String phrase = bufferedReader.readLine();
               System.out.println("Reseive phrase: \"" + phrase + "\"");
           } catch (IOException e) {
               e.printStackTrace();
           }
   }
    private void Task2() {
        System.out.println(" = Task 2 Input Buffer Scanner=");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type Name and Age");
        try {
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            System.out.println("Name:" + name + "Age:" + age);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
    private void Task3(){
            System.out.println(" = Task 3 Operators=");
            int i = 634;
            int sumDigits = i/100 + i/10%10 + i%10;
            System.out.println("Digits summ = " + sumDigits);
            if ( sumDigits > 10 ) {
                System.out.println("Too much");
                System.out.println("Too much");
            }
             else
                System.out.println("Not too Much");
    }
    private void Task4(){
        System.out.println(" = Task 4 Operators <> | & =");
        int a = 12;
        int b = -5;
        boolean c = a >= b;         // true
        boolean d = a >= 11;
        System.out.println(" c= " + c + "d=" + d);
   }
   private void Task5(){
       System.out.println(" = Task 5 or(int i=0, j = n - 1; i < j; i++, j--)   =");
       int n = 10;
       for(int i=0, j = n - 1; i < j; i++, j--){
           System.out.println("i=" + i + " j=" +  j--);
       }
   }

}
