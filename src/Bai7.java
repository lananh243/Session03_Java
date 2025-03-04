import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập cạnh 1 : ");
        int a = scanner.nextInt();
        System.out.println("Nhập cạnh 2 : ");
        int b = scanner.nextInt();
        System.out.println("Nhập cạnh 3 : ");
        int c = scanner.nextInt();

        if (a + b > c && a > 0 && b > 0 && c > 0) {
            if (a == b && b == c) {
                System.out.println("Tam giác đều");
            }else  if (a == b || b == c) {
                System.out.println("Tam giác cân");
            }else if (c*c == (a*a + b*b)) {
                System.out.println("Tam giác vuông");
            }else {
                System.out.println("Tam giác thường");
            }
        }else {
            System.out.println("3 cạnh ko tạo thành tam giác");
        }
    }
}
