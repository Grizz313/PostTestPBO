package c1.posttest2;

import java.util.Scanner;
import java.util.ArrayList;

public class Posttest2 {

    static ArrayList<DataToko> daftarProduk = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {       
        
        while (true) {
            System.out.println("\n=======================================");            
            System.out.println("|           TOKO THRIFT ASRAR         |");
            System.out.println("=======================================");            
            System.out.println("| 1. TAMBAH PRODUK                    |");
            System.out.println("| 2. LIHAT DAFTAR PRODUK              |");
            System.out.println("| 3. UBAH DATA PRODUK                 |");
            System.out.println("| 4. HAPUS PRODUK                     |");
            System.out.println("| 5. EXIT                             |");
            System.out.println("======================================="); 
            
            System.out.print("Pilih Menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tambahProduk();
                    break;
                case 2:
                    tampilProduk();
                    break;
                case 3:
                    ubahProduk();
                    break;
                case 4:
                    hapusProduk();
                    break;
                case 5:
                    System.out.println("TERIMA KASIH DATANG KEMBALI");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada!");
            }
        }
    }

    static void tambahProduk() {
        System.out.print("Masukkan Nama Produk : ");
        scanner.nextLine(); // utk membuang newline (enter)
        String namaProduk = scanner.next();
        
        System.out.print("Masukkan Jumlah Stok: ");
        int stok_produk = scanner.nextInt();
        
        System.out.print("Masukkan Warna Produk : ");
        scanner.nextLine();
        String warna_produk = scanner.next();
        
        System.out.print("Masukkan Ukuran Produk (S/M/L/XL) :  ");
        scanner.nextLine();
        String ukuran_produk = scanner.next();
        
        System.out.print("Masukkan Gender (laki/perempuan):  ");
        scanner.nextLine();
        String gender = scanner.next();
        
        System.out.print("Masukkan Harga Produk: ");
        double harga_produk = scanner.nextDouble();

        DataToko data = new DataToko(namaProduk, stok_produk, warna_produk, ukuran_produk, gender, harga_produk);
        daftarProduk.add(data);
        System.out.println("Data berhasil ditambahkan!");
    }

    static void tampilProduk() {
        if (daftarProduk.isEmpty()) {
            System.out.println("\nDAFTAR PRODUK TOKO THRIFT ASRAR\n");
            System.out.println("\nBelum ada data!");
        } else {
            System.out.println("===== DATA PRODUK=====");
            
            for (int i = 0; i < daftarProduk.size(); i++) {
                System.out.println("Nomor " + (i + 1));
                System.out.println("Nama Produk   : " + daftarProduk.get(i).getNamaProduk());
                System.out.println("stok          : " + daftarProduk.get(i).getStok_produk());
                System.out.println("warna         : " + daftarProduk.get(i).getWarna_produk());
                System.out.println("ukuran        : " + daftarProduk.get(i).getUkuran_produk());
                System.out.println("gender        : " + daftarProduk.get(i).getGender());
                System.out.println("harga         : " + daftarProduk.get(i).getHarga_produk());                
                System.out.println();
            }
        }
    }

    static void ubahProduk() {
        if (daftarProduk.isEmpty()) {
            System.out.println("Belum ada data!");
        } else {
            System.out.print("Nomor data yang akan diupdate: ");
            int index = scanner.nextInt() - 1;

            if (index < 0 || index >= daftarProduk.size()) {
                System.out.println("Nomor data tidak valid!");
            } else {
                
                System.out.print("Masukkan Nama Produk : ");
                String namaProduk = scanner.next();

                System.out.print("Masukkan Stok Produk : ");
                int stok_produk = scanner.nextInt();                

                System.out.print("Masukkan Warna Produk : ");
                String warna_produk = scanner.next();

                System.out.print("Masukkan Ukuran Produk (S/M/L/XL): ");
                String ukuran_produk = scanner.next();

                System.out.print("Masukkan Gender (laki/perempuan): ");
                String gender = scanner.next();
                
                System.out.print("Masukkan Harga Produk : ");
                double harga_produk = scanner.nextDouble();                

                DataToko data = new DataToko(namaProduk, stok_produk, warna_produk, ukuran_produk, gender, harga_produk);
                daftarProduk.set(index, data);

                System.out.println("Data berhasil diupdate!");
            }
        }
    }

    static void hapusProduk() {
        if (daftarProduk.isEmpty()) {
            System.out.println("Belum ada data!");
        } else {
            System.out.print("Nomor data yang akan dihapus: ");
            int index = scanner.nextInt() - 1;

            if (index < 0 || index >= daftarProduk.size()) {
                System.out.println("Nomor data tidak valid!");
            } else {
                daftarProduk.remove(index);
                System.out.println("Data berhasil dihapus!");
            }
        }
    }
}

