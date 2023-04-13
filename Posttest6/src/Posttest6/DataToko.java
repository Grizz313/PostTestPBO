package Posttest6;

public abstract class DataToko {
    private String namaProduk;
    private int stok_produk;
    private String gender;
    private int harga_produk;

    public DataToko(String namaProduk, int stok_produk, String gender, int harga_produk) {
        this.namaProduk = namaProduk;
        this.stok_produk = stok_produk;
        this.gender = gender;
        this.harga_produk = harga_produk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getStok_produk() {
        return stok_produk;
    }

    public void setStok_produk(int stok_produk) {
        this.stok_produk = stok_produk;
    }

    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHarga_produk() {
        return harga_produk;
    }

    public void setHarga_produk(int harga_produk) {
        this.harga_produk = harga_produk;
    }
    
    public void tambah(){
        System.out.println("------------------------------------------------");
        System.out.println("|       Produk toko Berhasil Ditambahkan!       |");
        System.out.println("------------------------------------------------");        
    }
    
    public void edit(){
        System.out.println("------------------------------------------------");
        System.out.println("|          Produk toko Berhasil Diubah!        |");
        System.out.println("------------------------------------------------");   
    }
    
    public void hapus(){
        System.out.println("------------------------------------------------");
        System.out.println("|         Produk toko Berhasil Dihapus!         |");
        System.out.println("------------------------------------------------");   
    }
    
    //Overloading
    public void toko(String namaProduk, int harga_produk){
        System.out.println("\n------------------------------------------------");
        System.out.println("Data produk dengan nama " + namaProduk);
        System.out.println("Harga Rp." + harga_produk + " stok " + stok_produk + "pcs Berhasil Ditambahkan");
        System.out.println("------------------------------------------------");
    }
    
    //Overloading
    public void toko(String namaProduk){
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("  | Data produk dengan nama " + namaProduk + " telah diubah |");
        System.out.println("-----------------------------------------------------------");
    }
    
    //Abstract Method
    public abstract void DataToko();
    
    //Penggunaan Static
        public static void pengiriman(){
        System.out.println("\nSyarat Pengambilan Barang: ");
        System.out.println("1. Batas Waktu Pengambilan Barang Maks 5 Hari");
        System.out.println("2. Tidak Menerima Pengembalian Barang Berdasarkan Kesalahan Pelanggan");
    }
}

