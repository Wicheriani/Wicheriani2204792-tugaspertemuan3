import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan peringkat kamu: ");
            int rangking = input.nextInt();
            System.out.print("Apakah kamu naik kelas? (true/false): ");
            boolean naikKelas = input.nextBoolean();
            // Mengecek apakah kondisi terpenuhi
            if (rangking == 1 && naikKelas) {
                System.out.println("Selamat! kamu dapat hadiah.");
            } else {
                System.out.println("Maaf, kamu tidak dapat hadiah.");
            }
        }
    }
}
