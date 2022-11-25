
import java.util.Scanner;// библ для ввода с клавиатуры
public class Main {


    public static long fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }




    private static Scanner inn = new Scanner(System.in);// метод для ввода с клавиатуры

    public static <string> void main(String[] args) {
        System.out.println(fib(10));



    }
}
