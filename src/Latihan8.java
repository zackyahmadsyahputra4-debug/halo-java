
import java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Angka pertama: ");
        double a = input.nextDouble();
        System.out.print("Operator (+ - * /): ");
        String op = input.next();
        System.out.print("Angka kedua: ");
        double b = input.nextDouble();

        switch (op) {
            case "+":
                System.out.println("Hasil: " + (a + b));
                break;
            case "-":
                System.out.println("Hasil: " + (a - b));
                break;
            case "*":
                System.out.println("Hasil: " + (a * b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Tidak bisa di bagi 0");
                } else {
                    System.out.println("Hasil: " + (a / b));
                }
                break;
            default:
                System.out.println("Operator tidak valid");
        }
    }
}

