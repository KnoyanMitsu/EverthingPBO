
public class EwalletMetode extends Pembayaran {

    public EwalletMetode(double jumlah) {
        super(jumlah);
    }

    @Override
    double prosesPembayaran() {
        System.out.println("Proses pembayaran dengan E-Wallet.");
        return jumlah;
    }

    @Override
    double hitungBonus() {
        double bonus = jumlah * 0.10;  // Bonus 10%
        System.out.println("Bonus Ewallet: " + bonus);
        return bonus;
    }
}