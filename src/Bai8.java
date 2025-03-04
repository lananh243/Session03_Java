import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a : ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập b : ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập c : ");
        double c = Double.parseDouble(scanner.nextLine());
        double delta = b*b - 4*a*c;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                }else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }else {
                double x = -(c/b);
                System.out.printf("Phương trình có nghiệm là : x = %.1f", x);
            }

        }else {
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / 2;
                double x2 = (-b - Math.sqrt(delta)) / 2;
                System.out.printf("Pt có 2 nghiệm phân biệt: x1 = %.1f, x2 = %.1f", x1, x2);
            }else if (delta == 0) {
                double x = (-b / 2*a);
                System.out.printf("Pt có 1 nghiệm kép :  x = %.1f", x);
            }else if (delta < 0) {
                System.out.println("Pt vô nghiệm");
            }
        }
    }
}
