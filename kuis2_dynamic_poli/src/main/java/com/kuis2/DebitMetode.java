public class DebitMetode  extends Pembayaran{

    public DebitMetode(double jumlah) {
        super(jumlah);
    }
    
    @Override
    double prosesPembayaran() {
        System.out.println("Proses pembayaran dengan Kartu Debit.");
        return jumlah;
    }

    @Override
    double hitungBonus() {
        double bonus = jumlah * 0.05;  // Bonus 5%
        System.out.println("Bonus Debit: " + bonus);
        return bonus;
    }
}
