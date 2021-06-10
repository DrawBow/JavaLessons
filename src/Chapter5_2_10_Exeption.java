import java.io.IOException;
import java.rmi.RemoteException;

public class Chapter5_2_10_Exeption{
        public static void main(String[] args) {
            handleExceptions(new Chapter5_2_10_Exeption());
        }
        public static void handleExceptions(Chapter5_2_10_Exeption obj) {
           for (int i=0; i<3; i++ ) {
               try {
                   switch(i) {
                       case 0: obj.method1(); break;
                       case 1: obj.method2(); break;
                       case 2: obj.method3(); break;
                   }
               } catch (NoSuchFieldException e) {
                   System.out.println(e.toString()); //IndexOutOfBoundsException: Index 18 out of bounds for length 0
                   printStack(e);
               } catch (RemoteException e) {
                   System.out.println(e.toString()); //IndexOutOfBoundsException: Index 18 out of bounds for length 0
                   printStack(e);
               } catch (IOException e) {
                   System.out.println(e.toString()); //IndexOutOfBoundsException: Index 18 out of bounds for length 0
                   e.printStackTrace();
               }
               ;
           }
        }
        public static void printStack(Throwable throwable) {
            System.out.println(throwable);
            for (StackTraceElement element : throwable.getStackTrace()) {
                System.out.println(element);
            }
        }
        public void method1() throws IOException {
            throw new IOException();
        }
        public void method2() throws NoSuchFieldException {
            throw new NoSuchFieldException();
        }
        public void method3() throws RemoteException {
            throw new RemoteException();
        }
}
