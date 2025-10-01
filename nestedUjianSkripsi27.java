import java.util.Scanner;

public class nestedUjianSkripsi27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pesan;

        System.out.print("apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebasKompen = scanner.nextLine().trim();

        System.out.print("masukkan jumlah log bimbingan pembimbing 1: ");
        int Bimbingan1 = scanner.nextInt();

        System.out.print("masukkan jumlah log bimbingan pembimbing 2: ");
        int Bimbingan2 = scanner.nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (Bimbingan1 >= 8 && Bimbingan2 >= 4) {
                pesan = "semua syarat terpenuhi. mahasiswa boleh mendaftar ujian skripsi";
            } else if (Bimbingan1 < 8 && Bimbingan2 < 4) {
                pesan = "gagal! log bimbingan p1 kurang dari 8 kali dan log bimbingan p2 kurang dari 4 kali";
            } else if (Bimbingan1 < 8) {
                pesan = "gagal! log bimbingan p1 belum mencapai 8 kali";
            } else {
                pesan = "gagal! log bimbingan p2 belum mencapai 4 kali";
            }
        } else {
            pesan = "gagal! mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);

    }
    
}
