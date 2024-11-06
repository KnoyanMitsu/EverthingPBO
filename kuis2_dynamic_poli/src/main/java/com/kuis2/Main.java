public class Main {
    public static void main(String[] args) {
        double jumlahPembayaran = 1000.0;

        Pembayaran pembayaran;

        pembayaran = new DebitMetode(jumlahPembayaran);
        pembayaran.prosesPembayaran();
        pembayaran.hitungBonus();


        System.out.println();

        pembayaran = new CreditMetode(jumlahPembayaran);
        pembayaran.prosesPembayaran();
        pembayaran.hitungBonus();


        System.out.println();

        pembayaran = new EwalletMetode(jumlahPembayaran);
        pembayaran.prosesPembayaran();
        pembayaran.hitungBonus();
    }
}
