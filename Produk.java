class Produk {
    // Atribut produk yang bersifat protected, agar dapat diakses oleh subclass
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    // Konstruktor untuk menginisialisasi atribut
    public Produk(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Metode untuk menampilkan informasi produk
    public String displayInfo() {
        return "Kode: " + kodeBarang + ", Nama:" + namaBarang + ", Harga:" + hargaBarang;
    }
}
