import java.util.Scanner;

public class Latihan12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka 1-10: ");
        int angka = input.nextInt();

        while (angka < 1 || angka > 10) {
            System.out.println("Angka tidak valid, coba lagi.");
            System.out.print("Masukkan angka 1-10: ");
            angka = input.nextInt();
        }

        System.out.println("Terima kasih, kamu memasukkan " + angka);
    }
}
