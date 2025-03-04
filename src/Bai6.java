import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên từ 1 - 12 : ");
        int a = scanner.nextInt();

        switch (a) {
            case 1,3,5,7,8,10,12 :
                System.out.printf("Tháng %d có 31 ngày",a);
                break;
            case 4,6,9,11 :
                System.out.printf("Tháng %d có 30 ngày",a);
                break;
            case 2 :
                System.out.printf("Tháng %d có 28 hoặc 29 ngày",a);
                break;
            default:
                System.out.println("Tháng ko hợp lệ");
        }
    }
}
