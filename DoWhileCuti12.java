import java.util.Scanner;

public class DoWhileCuti12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();
        do {
            System.out.print("Apakah Anda Ingin mengambil cuti (y/t) ? ");
            konfirmasi=sc.next();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah Hari : ");
                jumlahHari=sc.nextInt();
                if(jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println(" Dikarenakan Sisa jatah cuti Anda tidak mencukupi");
                    System.out.println("Anda bisa hanya mendapatkan cuti maksimal " + jatahCuti + " Hari");
                    // break;
                }
            }
        } while (jatahCuti > 0);
    }
}