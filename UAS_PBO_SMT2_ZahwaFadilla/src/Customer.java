import java.util.Scanner ;
public class Customer extends SuperClass {
    Scanner scn = new Scanner(System.in);
    private Account Acc;
    private ShoppingCart Sc;
    private DebitCard Dc;
    private ShiftKerja Sk;
    int pilih;
    private boolean menu = true;


    public Customer(String namaBarang, double harga, double stok) {
        super(namaBarang, harga, stok);
        Acc = new Account("Zahwa", "123",12000000);
        Sc = new ShoppingCart();
        Dc = new DebitCard(1000000);
    }

    public void addToCart(SuperClass product) {
        Sc.addToCartProcess(product);
    }

    public void ShowFromCart() {
        Sc.DisplayBarang();
    }

    public void ShowShiftKerja(ShiftKerja sk ) {
        ShiftKerja ShiftSiang = new ShiftKerja("Zeo", "07.00 - 15.00");
        ShiftKerja ShiftSore = new ShiftKerja("Koko", "15.00 - 17.00");
        ShiftKerja ShiftMalam = new ShiftKerja("Ardi", "17.00 - 12.00");
        ShiftSiang.showdataShif();
        ShiftSore.showdataShif();
        ShiftMalam.showdataShif();
           }



    public void ChekoutFromCart() {
        double total = Sc.CalculateSubTotal();
        if (total <= Acc.getBalance()) ;
        Sc.ResetDataSC();
    }

    public void TopUpBalance(DebitCard d, double jumlah) {
        Dc = d;
        System.out.println("Input jumlah :");
        jumlah = scn.nextDouble();
        Acc.setBalance(Acc.getBalance() + jumlah);
        System.out.println("Total Saldo Anda : " + jumlah );
    }

    public void MenuKasir() {
        while (menu) {
            System.out.println("============ M E N U ============");
            System.out.println("  1 .Mulai Belanja ");
            System.out.println("  2. Top Up OVO ");
            System.out.println("  3. Informasi Shift Karyawan");
            System.out.println("==================================");
            int pilih = scn.nextInt();

            if (pilih == 1) {
                menu = false;
            }
            if (pilih == 2) {
                TopUpBalance(Dc, 0);
                System.out.println("Top Up Anda Berhasil !!!");
            }
            if (pilih == 3) {
                System.out.println("============Shift Karyawan Hari ini =========");
                ShowShiftKerja(Sk);
            }
        }


    }

}
