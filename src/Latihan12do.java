import java.util.Scanner;
public class Latihan12do {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka 1-10: ");
            angka = input.nextInt();
        } while (angka<1||angka>10);

        System.out.println("Terima kasih, kamu memasukkan " + angka);
    }
}
