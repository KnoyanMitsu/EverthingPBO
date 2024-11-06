abstract class Pembayaran {
    double jumlah;

    // Constructor
    public Pembayaran(double jumlah) {
        this.jumlah = jumlah;
    }

    // Method abstrak untuk proses pembayaran
    abstract double prosesPembayaran();
    
    // Method abstrak untuk menghitung bonus
    abstract double hitungBonus();
}