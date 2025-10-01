import java.util.Scanner;

public class AksesWifiKampus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jenis pengguna (dosen/mahasiswa/lain): ");
        String jenis = scanner.nextLine().toLowerCase();

        if (jenis.equals("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (jenis.equals("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = scanner.nextInt();
            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
    }
}