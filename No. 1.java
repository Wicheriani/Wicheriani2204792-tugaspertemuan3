import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Input pecahan pertama
            System.out.print("Masukkan pecahan pertama (pembilang/pembagi): ");
            int pembilang1 = input.nextInt();
            int pembagi1 = input.nextInt();
            
            // Input pecahan kedua
            System.out.print("Masukkan pecahan kedua (pembilang/pembagi): ");
            int pembilang2 = input.nextInt();
            int pembagi2 = input.nextInt();
            
            // Input pecahan ketiga
            System.out.print("Masukkan pecahan ketiga (pembilang/pembagi): ");
            int pembilang3 = input.nextInt();
            int pembagi3 = input.nextInt();
            
            // Operasi penjumlahan
            double jumlah = (double)(pembilang1 * pembagi2 * pembagi3 + pembilang2 * pembagi1 * pembagi3 + pembilang3 * pembagi1 * pembagi2) /
                    (double)(pembagi1 * pembagi2 * pembagi3);
            
            // Operasi pengurangan
            double kurang = (double)(pembilang1 * pembagi2 * pembagi3 - pembilang2 * pembagi1 * pembagi3 - pembilang3 * pembagi1 * pembagi2) /
                    (double)(pembagi1 * pembagi2 * pembagi3);
            
            // Operasi perkalian
            double kali = (double)(pembilang1 * pembilang2 * pembilang3) /
                    (double)(pembagi1 * pembagi2 * pembagi3);
            
            // Operasi pembagian
            double bagi = (double)(pembilang1 * pembagi2 * pembagi3) /
                    (double)(pembagi1 * pembilang2 * pembagi3);
            
            // Menampilkan hasil
            System.out.println("Hasil penjumlahan: " + jumlah);
            System.out.println("Hasil pengurangan: " + kurang);
            System.out.println("Hasil perkalian: " + kali);
            System.out.println("Hasil pembagian: " + bagi);
        }
    }
}
