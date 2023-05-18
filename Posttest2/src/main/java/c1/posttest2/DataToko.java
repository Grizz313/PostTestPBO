package c1.posttest2;

public class DataToko {
    private String namaProduk;
    private int stok_produk;
    private String warna_produk;
    private String ukuran_produk;
    private String gender;
    private double harga_produk;

    public DataToko(String namaProduk, int stok_produk, String warna_produk, String ukuran_produk, String gender, double harga_produk) {
        this.namaProduk = namaProduk;
        this.stok_produk = stok_produk;
        this.warna_produk = warna_produk;
        this.ukuran_produk = ukuran_produk;
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

    public String getWarna_produk() {
        return warna_produk;
    }

    public void setWarna_produk(String warna_produk) {
        this.warna_produk = warna_produk;
    }

    public String getUkuran_produk() {
        return ukuran_produk;
    }

    public void setUkuran_produk(String ukuran_produk) {
        this.ukuran_produk = ukuran_produk;
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

    public void setHarga_produk(double harga_produk) {
        this.harga_produk = harga_produk;
    }
}
