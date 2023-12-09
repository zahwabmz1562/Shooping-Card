public class ShiftKerja extends SuperClass { //kelas anak dari Superclass
    private String waktuShift;

    public ShiftKerja(String namaKaryawan, String waktuShift) {
        super(namaKaryawan, waktuShift);
        setNamaKaryawan(namaKaryawan);
    }


    public void showdataShif() {
        System.out.println("=================================");
        System.out.println("Nama   : " + getNamaKaryawan());
        System.out.println("Waktu  : " + waktuShift);
        System.out.println("=================================");
    }
}
