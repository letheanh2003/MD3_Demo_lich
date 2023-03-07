import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao thang: ");
            int month = sc.nextInt();
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng này có 31 Ngày");
                    break;
                case 2:
                    System.out.println("Tháng này có 28,29 ngày");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng này có 30 ngày");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);


    }

}