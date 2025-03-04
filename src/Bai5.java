import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số thứ nhất : ");
        float num1 = Float.parseFloat(scanner.nextLine());

        System.out.println("Nhập số thứ hai : ");
        float num2 = Float.parseFloat(scanner.nextLine());

        System.out.println("Nhập ký hiệu phép toán : ");
        String operator =  scanner.nextLine();

        switch (operator) {
            case "+" :
                System.out.println("Kết quả : "+(num1+num2));
                break;
            case "-" :
                System.out.println("Kết quả : "+(num1-num2));
                break;
            case "*" :
                System.out.println("Kết quả : "+(num1)*num2);
                break;
            case "/" :
                if (num2 == 0) {
                    System.out.println("Không thể chia cho 0");
                }  else {
                    System.out.println("Kết quả : "+(num1/num2));
                }
                break;
            default:
                System.out.println("Phép toán ko hợp lệ ");

        }
    }
}
