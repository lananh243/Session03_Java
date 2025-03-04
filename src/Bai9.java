import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 số bất kì : ");
        int num = scanner.nextInt();


        if (num >= 100 && num <= 999) {
            int hundreds = num / 100;
            int tens = (num % 100) / 10;
            int units = (num % 100) % 10;
            String result = "";

            switch (hundreds) {
                case 1: result += "Một trăm"; break;
                case 2: result += "Hai trăm"; break;
                case 3: result += "Ba trăm"; break;
                case 4: result += "Bốn trăm"; break;
                case 5: result += "Năm trăm"; break;
                case 6: result += "Sáu trăm"; break;
                case 7: result += "Bảy trăm"; break;
                case 8: result += "Tám trăm"; break;
                case 9: result += "Chín trăm"; break;
            }

            if(tens == 1){
                result += " mười";
            }else if(tens > 1){
                switch (tens) {
                    case 2: result += " hai mươi"; break;
                    case 3: result += " ba mươi"; break;
                    case 4: result += " bốn mươi"; break;
                    case 5: result += " năm mươi"; break;
                    case 6: result += " sáu mươi"; break;
                    case 7: result += " bảy mươi"; break;
                    case 8: result += " tám mươi"; break;
                    case 9: result += " chín mươi"; break;
                }
            }else if(units != 0){
                result += " lẻ";
            }

            if (tens == 1) {
                switch (units) {
                    case 1: result += " một"; break;
                    case 2: result += " hai"; break;
                    case 3: result += " ba"; break;
                    case 4: result += " bốn"; break;
                    case 5: result += " năm"; break;
                    case 6: result += " sáu"; break;
                    case 7: result += " bảy"; break;
                    case 8: result += " tám"; break;
                    case 9: result += " chín"; break;
                }
            } else if (units != 0) {
                switch (units) {
                    case 1: result += " một"; break;
                    case 2: result += " hai"; break;
                    case 3: result += " ba"; break;
                    case 4: result += " bốn"; break;
                    case 5: result += " năm"; break;
                    case 6: result += " sáu"; break;
                    case 7: result += " bảy"; break;
                    case 8: result += " tám"; break;
                    case 9: result += " chín"; break;
                }
            }
            System.out.println(result.trim());
        }else {
            System.out.println("Số nhập vào không hợp lệ");
        }
    }
}
