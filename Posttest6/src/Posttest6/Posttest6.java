package Posttest6;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Posttest6 {

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
                    keluar();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada!");
            }
        }
    }    
   
     public static void jenisProduk()
    {
        System.out.println("\n====================");
        System.out.println("|Pilh Jenis Pakaian |");
        System.out.println("|1. Pakaian Anak    |");
        System.out.println("|2. Pakaian Dewasa  |");
        System.out.println("====================");
    }
     
    static final void keluar(){
        System.out.println("\n=======================================");            
        System.out.println("|     TERIMA KASIH DATANG KEMBALI     |");
        System.out.println("======================================="); 
    } 
    
     public static void tambahProduk() throws IOException {
         
        jenisProduk();
        
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
                  
            PakaianAnak ank = new PakaianAnak(namaProduk, stok_produk, gender, harga_produk, usia, bahan);
            pAnak.add(ank);
            ank.toko(namaProduk, harga_produk);
            ank.tambah();
            
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
            
            PakaianDewasa dws = new PakaianDewasa(namaProduk, stok_produk, gender, harga_produk, kategori, size_chart);
            pDewasa.add(dws);
            dws.toko(namaProduk, harga_produk);
            dws.tambah();
            

        }else{
            System.out.println("Pilihan tidak ada!");

        }
    }
     
    public static void tampilProduk() throws IOException{
        
        jenisProduk();
        
        System.out.print("Pilih Nomor: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("-Data Pakaian Anak-");  
            if (pAnak.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < pAnak.size();i++){
                System.out.println("\nProduk Ke-" + (i+1));
                pAnak.get(i).DataToko();
                PakaianAnak.pengiriman();
                    }
                }
                System.out.println("\n-------------------------------------------------");
        }else if(pil == 2){
            System.out.println("-Data Pakaian Dewasa-");  
            if (pDewasa.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < pDewasa.size();i++){
                System.out.println("\nProduk Ke-" + (i+1));
                pDewasa.get(i).DataToko();
                PakaianDewasa.pengiriman();
                }
            }
                System.out.println("\n-------------------------------------------------");
        }else{
            System.out.println("Pilihan tidak ada!");

        }
    }     

    static void ubahProduk()throws IOException {
        
        jenisProduk();
        
        System.out.print("Pilih Nomor: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (pAnak.isEmpty()) {
                System.out.println("Belum ada produk yang tersimpan!");
            } else {
                
                 for(int i = 0; i < pAnak.size();i++){
                    System.out.println("Produk anak dengan nomor " + i+1);
                    
                    pAnak.get(i).DataToko();
                    }
                 
                System.out.print("Masukkan Nomor Produk Anak yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                
                if (index <= pAnak.size() || index > 0) {
                    
                    System.out.println("\n-Masukkan produk anak yang baru-");
                    
                    System.out.print("Masukkan Nama Produk               : ");                  
                    String namaProduk = input.readLine();
                    pAnak.get(index-1).setNamaProduk(namaProduk);
                    
                    System.out.print("Masukkan Jumlah Stok               : ");
                    int stok_produk = Integer.parseInt (input.readLine());
                    pAnak.get(index-1).setStok_produk(stok_produk);
                    
                    System.out.print("Masukkan Gender (laki/perempuan)   : ");
                    String gender = input.readLine();
                    pAnak.get(index-1).setGender(gender);
                    
                    System.out.print("Masukkan Harga Produk              : ");
                    int harga_produk = Integer.parseInt (input.readLine());
                    pAnak.get(index-1).setHarga_produk(harga_produk);
                    
                    System.out.print("Masukkan Usia                      : ");
                    int usia = Integer.parseInt (input.readLine());
                    pAnak.get(index-1).setUsia(usia);   
                    
                    System.out.print("Masukkan Bahan                     : ");
                    String bahan = input.readLine();
                    pAnak.get(index-1).setBahan(bahan);                    
                    
                    pAnak.get(index-1).toko(namaProduk);
                    pAnak.get(index-1).edit();
                }else{
                    System.out.println("indeks tidak ditemukan");
                }
            }
        }else if(pil == 2){
            if (pDewasa.isEmpty()) {
                System.out.println("Belum ada produk yang tersimpan!");
            } else {
                
                for(int i = 0; i < pDewasa.size();i++){
                    System.out.println("Produk dewasa dengan nomor " + i+1);
                    
                    pDewasa.get(i).DataToko();
                    }
                
                System.out.print("Masukkan Nomor Produk Dewasa yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index <= pDewasa.size() || index > 0){
                    
                    System.out.println("\n-Masukkan produk dewasa yang baru-");
                    
                    System.out.print("Masukkan Nama Produk                  : ");                  
                    String namaProduk = input.readLine();
                    pDewasa.get(index-1).setNamaProduk(namaProduk);
                    
                    System.out.print("Masukkan Jumlah Stok                  : ");
                    int stok_produk = Integer.parseInt (input.readLine());
                    pDewasa.get(index-1).setStok_produk(stok_produk);
                    
                    System.out.print("Masukkan Gender (laki/perempuan)      : ");
                    String gender = input.readLine();
                    pDewasa.get(index-1).setGender(gender);
                    
                    System.out.print("Masukkan Harga Produk                 : ");
                    int harga_produk = Integer.parseInt (input.readLine());
                    pDewasa.get(index-1).setHarga_produk(harga_produk);
                    
                    System.out.print("Masukkan Kategori (SlimFit/Oversize)  : ");
                    String kategori = input.readLine();
                    pDewasa.get(index-1).setKategori(kategori);    
                    
                    System.out.print("Masukkan Size Chart (XS/S/M/L/XL/XXL) : ");
                    String size_chart = input.readLine();
                    pDewasa.get(index-1).setSize_chart(size_chart); 
                    
                    pDewasa.get(index-1).toko(namaProduk);
                    pDewasa.get(index-1).edit();
                }
                else{
                    System.out.println("indeks tidak ditemukan");
                }
            }
            
        }else{
            System.out.println("Pilihan tidak ada!");
        }
    }
    
    static void hapusProduk() throws IOException{
        
        jenisProduk();
        
        System.out.print("Pilih Nomor: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (pAnak.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                
                for(int i = 0; i < pAnak.size();i++){
                System.out.println("Produk anak dengan nomor " + i+1);
                    
                pAnak.get(i).DataToko();
                }
                
                System.out.print("Masukkan nomor produk anak yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= pAnak.size() || index > 0) 
                {
                    pAnak.remove(index-1).hapus();
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else if(pil == 2){
            if (pDewasa.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                
                for(int i = 0; i < pDewasa.size();i++){
                System.out.println("Produk dewasa dengan nomor " + i+1);
                    
                pDewasa.get(i).DataToko();
                }
                
                System.out.print("Masukkan nomor produk dewasa yang ingin dihapus: ");
                
                int index = Integer.parseInt(input.readLine());
                if(index <= pDewasa.size() || index > 0) 
                {
                    pDewasa.remove(index-1).hapus();
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else{
            System.out.println("Pilihan tidak ada!");
        }
        
    }
    
}


