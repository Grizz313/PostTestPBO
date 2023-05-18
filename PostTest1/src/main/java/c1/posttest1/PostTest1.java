package c1.posttest1;

import java.util.ArrayList;
import java.util.Scanner;

class Produk {

    private final String namaProduk;
    protected int stok_produk;
    private final String warna_produk;
    private final String ukuran_produk;
    private final String gender;
    public double harga_produk;

    public Produk(String namaProduk, int stok_produk, String warna_produk, String ukuran_produk, String gender, double harga_produk) {
        this.namaProduk = namaProduk;
        this.stok_produk = stok_produk;
        this.warna_produk = warna_produk;
        this.ukuran_produk = ukuran_produk;
        this.gender = gender;
        this.harga_produk = harga_produk;
    }

    public String getName() {
        return namaProduk;
    }

    public int getstok_produk() {
        return stok_produk;
    }

    public String getwarna_produk() {
        return warna_produk;
    }
    
    public String getukuran_produk() {
        return ukuran_produk;
    }
        
    public String getgender() {
        return gender;
    }
    
    public double getharga_produk() {
        return harga_produk;
    }    
}

public class PostTest1 {

    static ArrayList<Produk> daftarProduk = new ArrayList<>();
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

            System.out.print("Pilih Menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addData();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    deleteData();
                    break;
                case 5:
                    System.out.println("TERIMA KASIH DATANG KEMBALI");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada!");
            }
        }
    }

    static void addData() {
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

        Produk data = new Produk(namaProduk, stok_produk, warna_produk, ukuran_produk, gender, harga_produk);
        daftarProduk.add(data);
        System.out.println("Data berhasil ditambahkan!");
    }

    static void showData() {
        if (daftarProduk.isEmpty()) {
            System.out.println("\nDAFTAR PRODUK TOKO THRIFT ASRAR\n");
            System.out.println("\nBelum ada data!");
        } else {
            System.out.println("===== DATA PRODUK=====");
            
            for (int i = 0; i < daftarProduk.size(); i++) {
                System.out.println("Nomor " + (i + 1));
                System.out.println("Nama Produk   : " + daftarProduk.get(i).getName());
                System.out.println("stok          : " + daftarProduk.get(i).getstok_produk());
                System.out.println("warna         : " + daftarProduk.get(i).getwarna_produk());
                System.out.println("ukuran        : " + daftarProduk.get(i).getukuran_produk());
                System.out.println("gender        : " + daftarProduk.get(i).getgender());
                System.out.println("harga         : " + daftarProduk.get(i).getharga_produk());                
                System.out.println();
            }
        }
    }

    static void updateData() {
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

                Produk data = new Produk(namaProduk, stok_produk, warna_produk, ukuran_produk, gender, harga_produk);
                daftarProduk.set(index, data);

                System.out.println("Data berhasil diupdate!");
            }
        }
    }

    static void deleteData() {
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

