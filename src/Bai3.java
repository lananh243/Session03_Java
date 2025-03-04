import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập điểm trung bình của sinh viên : ");
        float averageScore = Float.parseFloat(scanner.next());
        if (averageScore >= 0 && averageScore <= 10) {
            if (averageScore >= 8.5) {
                System.out.println("Xếp loại : Giỏi");
            }else if (averageScore >= 6.5 && averageScore < 8.5) {
                System.out.println("Xếp loại : Khá");
            }else if (averageScore >= 5 && averageScore < 6.5) {
                System.out.println("Xếp loại : Trung bình");
            }else if (averageScore < 5) {
                System.out.println("Xếp loại : Yếu");
            }
        } else {
            System.out.println("Điểm không hợp lệ");
        }

    }
}
