import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h0 = h - a;
        int shag = a - b;
        System.out.println(1 + h0 / shag + (h0 % shag + shag - 1) / shag);
    }
}
