package cobapa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DaftarHarga daftarHarga = new DaftarHarga();
        
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        
        do {
            System.out.println("===== MENU PENYEWAAN VILLA =====");
            System.out.println("1. Tambah Data Villa");
            System.out.println("2. Tampilkan Daftar Villa");
            System.out.println("3. Ubah Data Villa");
            System.out.println("4. Hapus Data Villa");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    daftarHarga.create();
                    break;
                case 2:
                    daftarHarga.read();
                    break;
                case 3:
                    daftarHarga.update();
                    break;
                case 4:
                    daftarHarga.delete();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            
            System.out.println();
        } while (pilihan != 0);
    }
}
