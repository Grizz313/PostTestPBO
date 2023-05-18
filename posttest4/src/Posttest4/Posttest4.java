
package Posttest4;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Posttest4 {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<PakaianAnak> pAnak = new ArrayList<>();
    static ArrayList<PakaianDewasa> pDewasa = new ArrayList<>();

   public static void main(String[] args) throws IOException{       
        
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
            int choice = Integer.parseInt(input.readLine());

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
                    System.out.println("\n=======================================");            
                    System.out.println("|     TERIMA KASIH DATANG KEMBALI     |");
                    System.out.println("=======================================");    
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada!");
            }
        }
    }    
    
     public static void tambahProduk() throws IOException {
        System.out.println("\n====================");
        System.out.println("|Pilh Jenis Pakaian |");
        System.out.println("|1. Pakaian Anak    |");
        System.out.println("|2. Pakaian Dewasa  |");
        System.out.println("====================");
        System.out.print("Pilih Nomor: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("-Masukan Data Pakaian Anak-");            
            System.out.print("Masukkan Nama Produk              : ");
            String namaProduk = input.readLine();
        
            System.out.print("Masukkan Jumlah Stok              : ");
            int stok_produk = Integer.parseInt(input.readLine());
        
            System.out.print("Masukkan Gender (laki/perempuan)  : ");
            String gender = input.readLine();
        
            System.out.print("Masukkan Harga Produk             : ");
            int harga_produk = Integer.parseInt(input.readLine());
        
            System.out.print("Masukkan Usia                     : ");
            int usia = Integer.parseInt(input.readLine());  
            
            System.out.print("Masukkan Bahan                    : ");
            String bahan = input.readLine();
                  
            System.out.println("\n-------------------------------------------------");
            pAnak.add(new PakaianAnak(namaProduk, stok_produk, gender, harga_produk, usia, bahan));
            System.out.println("Produk Anak Berhasil Ditambahkan!");

        }else if(pil == 2){
            System.out.println("-Masukan Data Pakaian Dewasa-");
            System.out.print("Masukkan Nama Produk                : ");
            String namaProduk = input.readLine();
        
            System.out.print("Masukkan Jumlah Stok                : ");
            int stok_produk = Integer.parseInt(input.readLine());
        
            System.out.print("Masukkan Gender (laki/perempuan)    : ");
            String gender = input.readLine();
        
            System.out.print("Masukkan Harga Produk               : ");
            int harga_produk = Integer.parseInt(input.readLine());
        
            System.out.print("Masukkan Kategori(SlimFit/Oversize) : ");
            String kategori = input.readLine();
            
            System.out.print("Masukkan Size Chart(XS/S/M/L/XL/XXL): ");
            String size_chart = input.readLine();
            
            System.out.println("\n-------------------------------------------------");
            pDewasa.add(new PakaianDewasa(namaProduk, stok_produk, gender, harga_produk, kategori, size_chart));
            System.out.println("Produk Dewasa Berhasil Ditambahkan!");

        }else{
            System.out.println("Pilihan tidak ada!");

        }
    }
     
    public static void tampilProduk() throws IOException{
        System.out.println("\n====================");
        System.out.println("|Pilh Jenis Pakaian |");
        System.out.println("|1. Pakaian Anak    |");
        System.out.println("|2. Pakaian Dewasa  |");
        System.out.println("====================");
        System.out.print("Pilih Nomor: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("-Data Pakaian Anak-");  
            if (pAnak.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < pAnak.size();i++){
                System.out.println("Produk Ke-" + (i));
                pAnak.get(i).DataToko();
                    }
                }
                System.out.println("\n-------------------------------------------------");
        }else if(pil == 2){
            System.out.println("-Data Pakaian Dewasa-");  
            if (pDewasa.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < pDewasa.size();i++){
                pDewasa.get(i).DataToko();
                }
            }
                System.out.println("\n-------------------------------------------------");
        }else{
            System.out.println("Pilihan tidak ada!");

        }
    }     

    static void ubahProduk()throws IOException {
        System.out.println("\n====================");
        System.out.println("|Pilh Jenis Pakaian |");
        System.out.println("|1. Pakaian Anak    |");
        System.out.println("|2. Pakaian Dewasa  |");
        System.out.println("====================");
        System.out.print("Pilih Nomor: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (pAnak.isEmpty()) {
                System.out.println("Belum ada produk yang tersimpan!");
            } else {
                System.out.print("Masukkan Nomor Produk Anak yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= pAnak.size()) {
                    System.out.println("Nomor tidak ditemukan!");
                } else {
                    PakaianAnak ank = pAnak.get(index);
                    System.out.println("Produk anak dengan nomor " + index);
                    System.out.println("-Masukkan produk anak yang baru-");
                    
                    System.out.print("Masukkan Nama Produk               : ");                  
                    ank.setNamaProduk(input.readLine());
                    
                    System.out.print("Masukkan Jumlah Stok               : ");
                    ank.setStok_produk(Integer.parseInt(input.readLine()));
                    
                    System.out.print("Masukkan Gender (laki/perempuan)   : ");
                    ank.setGender(input.readLine());
                    
                    System.out.print("Masukkan Harga Produk             : ");
                    ank.setHarga_produk(Integer.parseInt(input.readLine()));
                    
                    System.out.print("Masukkan Usia                      : ");
                    ank.setUsia(Integer.parseInt(input.readLine()));    
                    
                    System.out.print("Masukkan Bahan                     : ");
                    ank.setBahan(input.readLine());                    
                    
                    System.out.println("\n-------------------------------------------------");
                    System.out.println("Produk Anak berhasil diubah!");
                }
            }
        }else if(pil == 2){
            if (pDewasa.isEmpty()) {
                System.out.println("Belum ada produk yang tersimpan!");
            } else {
                System.out.print("Masukkan Nomor Produk Dewasa yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= pDewasa.size()) {
                    System.out.println("Nomor tidak ditemukan!");
                } else {
                    PakaianDewasa dws = pDewasa.get(index);
                    System.out.println("Produk dewasa dengan nomor " + index);
                    System.out.println("-Masukkan produk dewasa yang baru-");
                    
                    System.out.print("Masukkan Nama Produk                  : ");                  
                    dws.setNamaProduk(input.readLine());
                    
                    System.out.print("Masukkan Jumlah Stok                  : ");
                    dws.setStok_produk(Integer.parseInt(input.readLine()));
                    
                    System.out.print("Masukkan Gender (laki/perempuan)      : ");
                    dws.setGender(input.readLine());
                    
                    System.out.print("Masukkan Harga Produk                 : ");
                    dws.setHarga_produk(Integer.parseInt(input.readLine()));
                    
                    System.out.print("Masukkan Kategori (SlimFit/Oversize)  : ");
                    dws.setKategori(input.readLine());     
                    
                    System.out.print("Masukkan Size Chart (XS/S/M/L/XL/XXL) : ");
                    dws.setSize_chart(input.readLine());   
                    System.out.println("\n-------------------------------------------------");
                    System.out.println("Produk Dewasa berhasil diubah!");
                }
            }
            
        }else{
            System.out.println("Pilihan tidak ada!");
        }
    }
    
    static void hapusProduk() throws IOException{
        System.out.println("\n====================");
        System.out.println("|Pilh Jenis Pakaian |");
        System.out.println("|1. Pakaian Anak    |");
        System.out.println("|2. Pakaian Dewasa  |");
        System.out.println("====================");
        System.out.print("Pilih Nomor: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (pAnak.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan nomor produk anak yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= pAnak.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    PakaianAnak ank = pAnak.get(index);
                    pAnak.remove(index);
                    System.out.println("Produk anak berhasil dihapus:");
                }
            }
        }else if(pil == 2){
            if (pDewasa.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan nomor produk dewasa yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= pDewasa.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    PakaianDewasa dws = pDewasa.get(index);
                    pDewasa.remove(index);
                    System.out.println("Produk dewasa berhasil dihapus:");
                    
                }
            }
        }else{
            System.out.println("Pilihan tidak ada!");
        }
        
    }
    
}


