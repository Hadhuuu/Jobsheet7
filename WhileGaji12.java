import java.util.Scanner;

public class WhileGaji12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        //deklarasi inisialisasi
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur=0.0, totalGajiLembur=0.0;
        String jabatan;
        //input 1
        System.out.print("Masukkan Jumlah Karyawan : ");
        jumlahKaryawan=scan.nextInt();
        int i=0;
        //perulangan
        while (i<jumlahKaryawan) {
            //input 2
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan=scan.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jumlahJamLembur=scan.nextInt();
            if (jabatan.equalsIgnoreCase("direktur")) {
                gajiLembur=jumlahJamLembur*0;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur=jumlahJamLembur*100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur=jumlahJamLembur*75000;
            } else {
            System.out.println("Jabatan invalid ''MOHON MASUKKAN ULANG''");
            continue;}
            totalGajiLembur += gajiLembur;
            i++;
        }
        // output
        System.out.println("Total gaji lembur : " + totalGajiLembur);
    }
}