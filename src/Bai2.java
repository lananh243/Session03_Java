import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a : ");
        int a = scanner.nextInt();

        System.out.println("Nhập b : ");
        int b = scanner.nextInt();

        System.out.println("Nhập c : ");
        int c = scanner.nextInt();

        int max;
        if (a == b && b == c) {
            System.out.println("Ba số nguyên bằng nhau");
        } else {
            if (a > b && a > c) {
                max = a;
                System.out.printf("Số lớn nhất là %d", max);
            } else if (b > a && b > c) {
                max = b;
                System.out.printf("Số lớn nhất là %d", max);
            } else if (c > a && c > b) {
                max = c;
                System.out.printf("Số lớn nhất là %d", max);
            }
        }
    }
}
