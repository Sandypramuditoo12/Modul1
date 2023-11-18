/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cobapa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class DaftarHarga extends Penyewaan {
    private List<String> daftar;

    public DaftarHarga() {
        daftar = new ArrayList<>();
        daftar.add("1. Chevilly Resort & Camp              \t Rp. 570.000,-\t Malam");
        daftar.add("2. Terrace Villa Golf                 \t Rp. 306.000,-\t Malam");
        daftar.add("3. Nirvana Villas Puncak              \t Rp. 2.700.000,-\t Malam");
        daftar.add("4. The Jayakarta Cisarua Inn & Villas \t Rp. 437.000 ,-\t Malam");
        daftar.add("5. Marseillia Hills                   \t Rp. 1.820.000,-\t Malam");
        daftar.add("6. Grand Cempaka Resort               \t Rp. 266.000,-\t Malam");
        daftar.add("7. Al Marina Resort                   \t Rp. 1.525.000,-\t Malam");
        daftar.add("8. Masada Village                     \t Rp. 302.000,-\t Malam");
        daftar.add("9. Villa Sabrina Bumi Ciherang        \tRp. 1.100.000,-\t Malam");
    }

    @Override
    protected void create() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("-------------------------Tambah Data Villa---------------------");
        System.out.println("Masukkan Nama Villa     : ");
        String villa = input.nextLine();
        System.out.println("Masukkan Harga Villa    : ");
        String harga = input.nextLine();
        daftar.add(villa + "\t" + harga);
        System.out.println("Data villa berhasil ditambahkan.");
    }

    @Override
    protected void read() {
        System.out.println("----------------------------DAFTAR VILLA DAN HARGANYA-----------------------");
        for (String villa : daftar) {
            System.out.println(villa);
        }
    }

    @Override
    protected void update() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("--------------------------Update Data Villa-----------------------");
        System.out.println("Masukkan nomor villa yang ingin diubah: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 1 && index <= daftar.size()) {
            System.out.println("Masukkan Nama Villa Baru   : ");
            String villa = input.nextLine();
            System.out.println("Masukkan Harga Villa Baru  : ");
            String harga = input.nextLine();
            daftar.set(index - 1, villa + "\t" + harga);
            System.out.println("Data villa berhasil diubah.");
        } else {
            System.out.println("Nomor villa tidak valid.");
        }
    }

    @Override
    protected void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}