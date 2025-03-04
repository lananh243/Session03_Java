import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập c: ");
        double c = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập d: ");
        double d = Double.parseDouble(scanner.nextLine());


        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println(d == 0 ? "Phương trình có vô số nghiệm" : "Phương trình vô nghiệm");
                } else {
                    double x = -d / c;
                    System.out.printf("Phương trình có nghiệm duy nhất: x = %.2f\n", x);
                }
            } else {
                double delta = c * c - 4 * b * d;
                if (delta > 0) {
                    double x1 = (-c + Math.sqrt(delta)) / (2 * b);
                    double x2 = (-c - Math.sqrt(delta)) / (2 * b);
                    System.out.printf("Phương trình có 2 nghiệm: x1 = %.2f, x2 = %.2f\n", x1, x2);
                } else if (delta == 0) {
                    double x = -c / (2 * b);
                    System.out.printf("Phương trình có nghiệm kép: x = %.2f\n", x);
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
            return;
        }

        double delta = b * b - 3 * a * c;
        double k = (9 * a * b * c - 2 * b * b * b - 27 * a * a * d) / (2 * Math.sqrt(Math.pow(Math.abs(delta), 3)));

        if (delta > 0) {
            if (Math.abs(k) <= 1) {
                double theta = Math.acos(k) / 3;
                double x1 = (2 * Math.sqrt(delta) * Math.cos(theta) - b) / (3 * a);
                double x2 = (2 * Math.sqrt(delta) * Math.cos(theta - 2 * Math.PI / 3) - b) / (3 * a);
                double x3 = (2 * Math.sqrt(delta) * Math.cos(theta + 2 * Math.PI / 3) - b) / (3 * a);
                System.out.printf("Phương trình có 3 nghiệm thực: x1 = %.2f, x2 = %.2f, x3 = %.2f\n", x1, x2, x3);
            } else {
                double absK = Math.abs(k);
                double x = (Math.sqrt(delta) * absK / (3 * a * k)) *
                        (Math.cbrt(absK + Math.sqrt(k * k - 1)) + Math.cbrt(absK - Math.sqrt(k * k - 1))) - b / (3 * a);
                System.out.printf("Phương trình có 1 nghiệm thực duy nhất: x = %.2f\n", x);
            }
        }
        else if (delta == 0) {
            double x = (-b + Math.cbrt(b * b * b - 27 * a * a * d)) / (3 * a);
            System.out.printf("Phương trình có nghiệm bội: x = %.2f\n", x);
        }
        else {
            double x = (Math.sqrt(Math.abs(delta)) / (3 * a)) *
                    (Math.cbrt(k + Math.sqrt(k * k + 1)) + Math.cbrt(k - Math.sqrt(k * k + 1))) - b / (3 * a);
            System.out.printf("Phương trình có 1 nghiệm thực duy nhất: x = %.2f\n", x);
        }
    }
}
