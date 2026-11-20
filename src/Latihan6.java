import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        if (umur < 0) {
            System.out.println("Umur tidak valid");
        } else if (umur < 12) {
            System.out.println("Kategori: Anak, harga: Rp25000");
        } else if (umur <= 60) {
            System.out.println("Kategori: Dewasa, harga: Rp50000");
        } else {
            System.out.println("Kategori: Lansia, harga: Rp30000");
        }
    }
}
