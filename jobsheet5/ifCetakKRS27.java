import java.util.Scanner;

public class ifCetakKRS27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("--- Cetak KRS Siakad---");
       System.out.print("apakah ukt sudah lunas? (true/false): ");
         boolean uktLunas = scanner.nextBoolean();

         if (uktLunas) {
              System.out.println("pembayaran ukt terverifikasi");
              System.out.println("silahkan cetak krs dan minta tanda tangan DPA");


       }
   }
}
       