package models;

enum KendaraanBahanbakar {
    BENSIN,
    DIESEL,
    AVTUR
}
enum KendaraanNama {
    MOBIL,
    TRUK,
    HELIKOPTER,
    PESAWAT
}

public abstract class Kendaraan {
    private KendaraanBahanbakar bahanBakar;
    private int kapasitas;
    private KendaraanNama nama;

    public Kendaraan(KendaraanBahanbakar bahanBakar, KendaraanNama nama, int kapasitas){
        this.bahanBakar = bahanBakar;
        this.nama = nama;
        this.kapasitas = kapasitas;
    }

    public KendaraanBahanbakar getBahanBakar(){
        return this.bahanBakar;
    }

    public int getKapasitas(){
        return this.kapasitas;
    }

    public KendaraanNama getNama(){
        return this.nama;
    }

    public String getBahanBakarString(){
        switch (bahanBakar) {
            case BENSIN:
                return "BENSIN";
            case DIESEL:
                return "DIESEL";
            case AVTUR:
                return "AVTUR"; 
            default:
                return "UNKNOWN";
        }
    }

    public String getNamaString(){
        switch (nama) {
            case MOBIL:
                return "Mobil GTR";
            case TRUK:
                return "Hino Dutro";
            case HELIKOPTER:
                return "Helikopter";
            case PESAWAT:
                return "Air Force"; 
            default:
                return "UNKNOWN";
        }
    }

    public abstract String getDetails();
}