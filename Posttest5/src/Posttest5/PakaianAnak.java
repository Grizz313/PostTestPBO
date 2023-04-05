package Posttest5;

public final class PakaianAnak extends DataToko {
    private int usia;
    private String bahan;
    
     public final String jenis = "Pakaian Anak";
    
        public PakaianAnak(String namaProduk, int stok_produk, String gender, int harga_produk, int usia, String bahan) {
        super(namaProduk, stok_produk,gender, harga_produk);
        this.usia = usia;
        this.bahan = bahan;
    }
    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
    
    @Override
    public void tambah(){
        System.out.println("\n------------------------------------------------");
        System.out.println("|  Produk " + this.jenis + " Berhasil Ditambahkan    |");
        System.out.println("------------------------------------------------");         
    }
    
    @Override
    public void edit(){
        System.out.println("\n-------------------------------------------------");
        System.out.println("|     Produk " + this.jenis + " Berhasil Diubah      |");
        System.out.println("-------------------------------------------------");    
    }
    
    @Override
    public void hapus(){
        System.out.println("\n-------------------------------------------------");
        System.out.println("|     Produk " + this.jenis + " Berhasil Dihapus     |");
        System.out.println("-------------------------------------------------");    
    }
    
    @Override
    public void DataToko(){
       System.out.println("Nama Produk                    : " + getNamaProduk());
       System.out.println("Jumlah Stok                    : " + getStok_produk());
       System.out.println("Gender (laki/perempuan)        : " + getGender());
       System.out.println("Harga Produk                   : " + getHarga_produk());
       System.out.println("Usia                           : " + usia);
       System.out.println("Bahan                          : " + bahan);
    }
    
}
