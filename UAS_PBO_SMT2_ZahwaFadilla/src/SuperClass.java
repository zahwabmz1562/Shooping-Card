public class SuperClass {
    private String namaKaryawan;
    private String namaBarang;
    private double harga;
    private double Stok;


    public SuperClass(String namaBarang, double harga, double stok) {
        this.namaBarang = namaBarang;
        this.harga = harga;
        Stok = stok;
    }

    public SuperClass(String namaKaryawan, String waktuShift) {
        this.namaKaryawan = namaKaryawan;
    }


    protected String getNamaKaryawan() {
        return namaKaryawan ;
    }

    protected void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getStok() {
        return Stok;
    }

    public void setStok(double stok) {
        Stok = stok;
    }
}


