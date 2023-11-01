import java.util.Scanner;

public class WhileKelipatan12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, counter=0, total=0;
        double ratarata;
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan=scan.nextInt();
        int i=1;
        while (i<=50) {
            if (i % kelipatan == 0) {
                total = total + i;
                counter++;
            } i++;
            
        }
        // for (int i=1 ; i <= 50; i++) {
        //     if (i % kelipatan == 0) {
        //         total += i;
        //         counter++;
                
        //     }
        // }
        ratarata=total/counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan,counter);
        System.out.printf("Total bilangn kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan,total);
        System.out.println("Rata-rata dari seluruh bilangan kelipatan dari rentan 1 sampai 50 adalah " +ratarata);
    }
}