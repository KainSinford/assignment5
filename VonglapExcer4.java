
package vonglap.excer4;
import java.util.Scanner;
public class VonglapExcer4 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();   

        }
    }
}