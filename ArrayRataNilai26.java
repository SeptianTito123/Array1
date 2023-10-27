import java.util.Scanner;
public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa = ");
        int jumlahMhs = input.nextInt();
        int[] nilaiMhs= new int[jumlahMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rataLulus;
        double rataTidakLulus;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            nilaiMhs[i] = input.nextInt();
        } for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }
        rataLulus = (jumlahLulus > 0) ? totalLulus / jumlahLulus : 0;
        rataTidakLulus = (totalTidakLulus > 0) ? totalLulus / jumlahTidakLulus :0;

        System.out.println("Rata-rata nilai lulus = " +rataLulus);
        System.out.println("Jumlah mahasiswa yang lulus = " +jumlahLulus);
    }
}