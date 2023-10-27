import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array :");
        
        int jumlahElemen = input.nextInt();
        int[] arrayInt = new int[jumlahElemen];
        int key;
        int hasil = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" +i+ " : ");
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Masukkan key yang ingin di cari :");
        key = input.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        if (hasil == -1) {
            System.out.println("Key tidak ditemukan");
        } else {
            System.out.println("Key ada dalam array pada posisi indeks ke-" +hasil);
        }
    }
}