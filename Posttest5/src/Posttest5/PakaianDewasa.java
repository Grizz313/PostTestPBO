package Posttest5;

public final class PakaianDewasa extends DataToko{
    private String kategori;
    private String size_chart;
    
        public final String jenis = "Pakaian Dewasa";
    
        public PakaianDewasa(String namaProduk, int stok_produk, String gender, int harga_produk,String kategori, String           size_chart) {
        super(namaProduk, stok_produk,gender, harga_produk);
        this.kategori = kategori;
        this.size_chart = size_chart;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getSize_chart() {
        return size_chart;
    }

    public void setSize_chart(String size_chart) {
        this.size_chart = size_chart;
    }
    
    @Override
    public void tambah(){
        System.out.println("\n------------------------------------------------");
        System.out.println("|  Produk " + this.jenis + " Berhasil Ditambahkan  |");
        System.out.println("------------------------------------------------");        
    }
    
    @Override
    public void edit(){
        System.out.println("\n------------------------------------------------");
        System.out.println("|     Produk " + this.jenis + " Berhasil Diubah    |");
        System.out.println("-------------------------------------------------");    
    }
    
    @Override
    public void hapus(){
        System.out.println("\n------------------------------------------------");
        System.out.println("|     Produk " + this.jenis + " Berhasil Dihapus   |");
        System.out.println("-------------------------------------------------");    
    }
    
    @Override
    public void DataToko(){
       System.out.println("Nama Produk                    : " + getNamaProduk());
       System.out.println("Jumlah Stok                    : " + getStok_produk());
       System.out.println("Gender (laki/perempuan)        : " + getGender());
       System.out.println("Harga Produk                   : " + getHarga_produk());
       System.out.println("Kategori (SlimFit/Oversize)    : " + kategori);
       System.out.println("Size Chart (XS/S/M/L/XL/XXL)   : " + size_chart);
    }
}
