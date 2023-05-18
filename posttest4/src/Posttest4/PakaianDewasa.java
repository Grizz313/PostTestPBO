package Posttest4;

 
public class PakaianDewasa extends DataToko{
    private String kategori;
    private String size_chart;
    
        public PakaianDewasa(String namaProduk, int stok_produk, String gender, int harga_produk,            String kategori, String size_chart) {
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
    public void DataToko(){
       super.DataToko();
       System.out.println("Kategori (SlimFit/Oversize)    : " + kategori);
       System.out.println("Size Chart (XS/S/M/L/XL/XXL)   : " + size_chart);
    }
}
