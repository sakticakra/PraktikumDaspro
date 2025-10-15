import java.util.Scanner;

public class casmethod27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama,nilaihuruf,nilaihuruf1, statussem;
        int nim,utsalgo,uasalgo,tugasalgo,utsdata,uasdata,tugasdata;

        System.out.println("=====input data mahasiswa=====");
        System.out.print("Nama : ");
        nama = scanner.nextLine();
        System.out.print("nim  : ");
        nim = scanner.nextInt();

        System.out.println("---mata kuliah 1 : algoritma dan pemrograman---");
        System.out.print("nilai uts  : ");
        utsalgo = scanner.nextInt();
        System.out.print("nilai uas  : ");
        uasalgo = scanner.nextInt();
        System.out.print("nilai tugas: ");
        tugasalgo = scanner.nextInt();

        System.out.println("---mata kuliah 2 : struktur data---");
        System.out.print("nilai uts  : ");
        utsdata = scanner.nextInt();
        System.out.print("nilai uas  : ");
        uasdata = scanner.nextInt();
        System.out.print("nilai tugas: ");
        tugasdata = scanner.nextInt();

        double nilaiakhir  = (utsalgo * 0.3)+(uasalgo * 0.4)+(tugasalgo * 0.3);  
        double nilaiakhir1 = (utsdata * 0.3)+(uasdata * 0.4)+(tugasdata * 0.3);
        double rata = (nilaiakhir  + nilaiakhir1) / 2;


        if (nilaiakhir > 80 && nilaiakhir <= 100) {
            nilaihuruf = "A";
        } else if (nilaiakhir >73 && nilaiakhir <= 80) {
            nilaihuruf = "B+";
        } else if (nilaiakhir > 65 && nilaiakhir <= 73) {
            nilaihuruf = "B";
        } else if (nilaiakhir > 60 && nilaiakhir <= 65) {
            nilaihuruf = "C+";
        } else if (nilaiakhir > 50 && nilaiakhir <= 60) {
            nilaihuruf = "D";
        } else if (nilaiakhir > 39 && nilaiakhir <= 50) {
            nilaihuruf = "C";
        } else {
            nilaihuruf = "E";
        }

        if (nilaiakhir1 > 80 && nilaiakhir1 <= 100) {
            nilaihuruf1 = "A";
        } else if (nilaiakhir1 >73 && nilaiakhir1 <= 80) {
            nilaihuruf1 = "B+";
        } else if (nilaiakhir1 > 65 && nilaiakhir1 <= 73) {
            nilaihuruf1 = "B";;
        } else if (nilaiakhir1 > 60 && nilaiakhir1 <= 65) {
            nilaihuruf1 = "C+";
        } else if (nilaiakhir1 > 50 && nilaiakhir1 <= 60) {
            nilaihuruf1 = "C";
        } else if (nilaiakhir1 > 39 && nilaiakhir1 <= 50) {
            nilaihuruf1 = "D";
        } else {
            nilaihuruf1 = "E";
        }

        String statusakhir;
        String statusakhir1;

        if (nilaiakhir >= 60) {
            statusakhir = "LULUS";
        } else {
            statusakhir = "GAGAL";
        }

        if (nilaiakhir1 >= 60) {
            statusakhir1 = "LULUS";
        } else {
            statusakhir1 = "GAGAL";
        }

        if (statusakhir == "LULUS" && statusakhir1 == "LULUS") {
            if (rata >= 70) {
                statussem = "LULUS";
            } else {
                statussem = "GAGAL (nilai < 70)";
            }
        } else {
            statussem = "GAGAL (nilai < 70)";
        }


        System.out.println("==========HASIL PENILAIAN AKADEMIK==========");
        System.out.println("nama: " + nama);
        System.out.println("nim: " + nim);
        System.out.println("MATA KULIAH                    UTS  UAS     TUGAS     NILAIAKHIR     NILAI HURUF     STATUS");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("algoritma pemrograman          " + utsalgo + "   " + uasalgo + "       " + tugasalgo + "          " + nilaiakhir+ "             " + nilaihuruf + "         " + statusakhir);
        System.out.println("struktur data                  " + utsdata + "   " + uasdata + "       " + tugasdata + "          " + nilaiakhir1 + "             " + nilaihuruf1 + "         " + statusakhir1);
        System.out.println("");
        System.out.println("rata rata nilai akhir: " + rata);
        System.out.println("status semester: " + statussem);

        scanner.close();

    }
}