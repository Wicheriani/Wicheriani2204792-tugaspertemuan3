import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan karakter pertama: ");
            char charA = input.next().charAt(0); // Menerima input karakter pertama
            System.out.print("Masukkan karakter kedua: ");
            char charB = input.next().charAt(0); // Menerima input karakter kedua
            int asciiA = (int) charA; // Mengonversi karakter pertama menjadi kode ASCII
            int asciiB = (int) charB; // Mengonversi karakter kedua menjadi kode ASCII
            int jumlahAscii = asciiA + asciiB; // Menjumlahkan kode ASCII
            System.out.println("Jumlah ASCII dari karakter '" + charA + "' dan '" + charB + "' adalah: " + jumlahAscii);
        }
    }
}
