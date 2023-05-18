package Posttest4;


public class PakaianAnak extends DataToko {
    private int usia;
    private String bahan;
    
        public PakaianAnak(String namaProduk, int stok_produk, String gender, int harga_produk, int          usia, String bahan) {
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
    public void DataToko(){
       super.DataToko();
       System.out.println("Usia                           : " + usia);
       System.out.println("Bahan                          : " + bahan);
    }
    
    // overloading
    public void DataToko(boolean showID){
       if(showID) DataToko();
       else super.DataToko();
    }
}
