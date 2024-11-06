class CreditMetode extends Pembayaran {
    public CreditMetode(double jumlah) {
        super(jumlah);
    }

    @Override
    double prosesPembayaran() {
        System.out.println("Proses pembayaran dengan Kartu Kredit.");
        return jumlah;
    }

    @Override
    double hitungBonus() {
        double bonus = jumlah * 0.15;  // Bonus 15%
        System.out.println("Bonus Kredit: " + bonus);
        return bonus;
    }
}