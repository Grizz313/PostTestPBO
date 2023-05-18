
package Posttest3;

public class DataToko {
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
}

