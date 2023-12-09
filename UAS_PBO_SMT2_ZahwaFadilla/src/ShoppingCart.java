public class ShoppingCart   {
    private SuperClass[] listProduct ;
    private int productCount ;

    public ShoppingCart(){
        listProduct = new SuperClass[10];
        productCount = 0;
    }
    public void addToCartProcess(SuperClass product){
        this.listProduct[productCount] = product;
        this.productCount++;
    }
    public double CalculateSubTotal(){
        System.out.println("============= Total ============");
        double SubTotal = 0;
        for(int i = 0; i < productCount; i++){
            SubTotal+= listProduct[i].getHarga();
        }
            System.out.println("Total Harga : " + SubTotal);
            System.out.println("===============================");
            return 0;
    }
    public void DisplayBarang(){
        System.out.println("          JL. AMAD YANI NO 3               ");
        System.out.println("        FROZEN FOOD PROBOLINGGO            ");
        System.out.println();
        System.out.println("Tanggal : 18 Juni 2022");
        System.out.println("Hari    : Sabtu");
        System.out.println("waktu   : 07.30");
        System.out.println("========== JUMLAH PESANAN ==================");
        for(int i = 0 ; i < productCount; i++){
            System.out.println("|1  | " + listProduct[i].getNamaBarang() + " \t\t\t| " + listProduct[i].getHarga() + " \t\t\t| "); //KOMPOSISI
            System.out.println("Jumlah barang yang di pesan :" + productCount);

        }
    }
    public void ResetDataSC(){
        listProduct = new SuperClass[10];
        productCount = 0;

    }
}
