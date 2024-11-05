package exercise2;
import java.util.Scanner;
public class Exercise2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong so Fibonacci can in: ");
        int n = scanner.nextInt();

        int first = 0, second = 1, next;

        System.out.print("Day Fibonacci: " + first + " " + second + " ");

        for (int i = 3; i <= n; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

        scanner.close();
    }
}
