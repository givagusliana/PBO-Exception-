class Transaksi extends Produk {
    private String noFaktur;
    private int jumlahBeli;
    private double total;

    // Konstruktor untuk menginisialisasi atribut transaksi
    public Transaksi(String kodeBarang, String namaBarang, double hargaBarang, String noFaktur, int jumlahBeli) {
        // Memanggil konstruktor dari superclass (Produk)
        super(kodeBarang, namaBarang, hargaBarang);
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
        this.total = 0; // Total diinisialisasi ke 0
    }

    // Metode untuk menghitung total harga
    public void hitungTotal() {
        try {
            // Validasi: Harga barang dan jumlah beli harus positif
            if (jumlahBeli < 0 || hargaBarang < 0) {
                throw new IllegalArgumentException("Jumlah beli dan harga barang harus bernilai positif.");
            }
            total = jumlahBeli * hargaBarang; // Menghitung total jika valid
        } catch (IllegalArgumentException e) {
            // Exception Handling:
            // Menangkap kesalahan validasi dan memberikan pesan error
            System.out.println("Error: " + e.getMessage());
            total = 0; // Mengatur total menjadi 0 jika terjadi kesalahan
        }
    }

    // Metode untuk menampilkan faktur transaksi
    public String displayInvoice() {
        // Memanfaatkan metode displayInfo() dari superclass untuk menampilkan info barang
        return "No Faktur: " + noFaktur + "\n"
                + displayInfo() + "\n"
                + "Jumlah Beli: " + jumlahBeli + "\n"
                + "Total: " + total;
    }
}
