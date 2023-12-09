import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean bln = true;
        Scanner scn = new Scanner(System.in);
        ShoppingCart SC = new ShoppingCart();
        Customer CS = new Customer(null, 0, 0);

        System.out.println("===================== SELMAT DATANG DI FROZEN FOOD PROBOLINGGO =========================");
        System.out.println();
        CS.MenuKasir();
        System.out.println("================================== SELAMAT BERBELANJA ==================================");



        //daftar Barang
        Customer B1 = new Customer("Seblak", 12000, 10); //Komposisi --> TIDAK SETIAP CLAS PUNYA REFRENSI OBJEK
        Customer B2 = new Customer("Kebab Frozen isi 5", 35000, 10);
        Customer B3 = new Customer("Mariam isi 10", 30000, 10);
        Customer B4 = new Customer("Boci", 13000, 10);


        while (bln) {

                    System.out.println("| NO |" + "Nama Barang" + " \t\t\t\t| " + "Harga Barang" + " \t\t\t\t| "+"Stok Barang");
                    System.out.println("|1  | " + B1.getNamaBarang() + " \t\t\t\t\t\t| " + B1.getHarga() + " \t\t\t| " + B1.getStok() + " \t\t| ");
                    System.out.println("|2  | " + B2.getNamaBarang() + " \t\t\t| " + B2.getHarga() + " \t\t\t| " + B2.getStok() + " \t\t| ");
                    System.out.println("|3  | " + B3.getNamaBarang() + " \t\t\t\t| " + B3.getHarga() + " \t\t\t| " + B3.getStok() + " \t\t| ");
                    System.out.println("|4  | " + B4.getNamaBarang() + " \t\t\t\t\t\t\t| " + B4.getHarga() + " \t\t\t| " + B4.getStok() + " \t\t| ");
                    System.out.println();
                    System.out.println("========== K E R A N J A N G ==============");
                    System.out.println("99. Tampilkan keranjang belanja anda ");
                    System.out.println("0. Kembali ke menu sebelumnya ");
                    System.out.println("--------------- PILIHAN----------------------");
                    int pilih = scn.nextInt();

                    if (pilih == 0) {
                        bln = false;
                        System.out.println("Apakah Anda Ingin KEMBALI ke menu sebelumnya ");
                        System.out.println(" 1. Ya");
                        System.out.println(" 2. Tidak");
                        int pilihan = scn.nextInt();
                        if (pilihan == 1) {
                            CS.MenuKasir();
                        }
                        if (pilihan == 2) {
                            bln = true;
                        }
                    }
                    //Memasukan Barang ke dalam keranjang
                    if (pilih == 1) {
                        CS.addToCart(B1);
                        B1.setStok(B1.getStok() - 1); //ASOSIASI --> terdapat pengiriman atribut
                    }
                    if (pilih == 2) {
                        CS.addToCart(B2); //Agrigasi--> terdapatpengiriman objek
                        B2.setStok(B2.getStok() - 1);
                    }
                    if (pilih == 3) {
                        CS.addToCart(B3);
                        B3.setStok(B3.getStok() - 1);
                    }
                    if (pilih == 4) {
                        CS.addToCart(B4);
                        B4.setStok(B4.getStok() - 1);
                    }
                    if (pilih == 99) {
                        CS.ShowFromCart();
                        bln = false;
                        System.out.println();
                        System.out.println("0.Checkout");
                        System.out.print("Pilihan : ");
                        int cek = scn.nextInt();
                        if (cek == 0) {
                            CS.ChekoutFromCart();
                            System.out.println("Tekan 1 untuk Melanjutkan");
                            System.out.print("Pilihan : ");
                            int cc = scn.nextInt();
                            if (cc == 1) {
                                bln = true;
                            }
                        }


                    }
                }
            }
        }

