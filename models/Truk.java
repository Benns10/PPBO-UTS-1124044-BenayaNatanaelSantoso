package models;

public class Truk extends Kendaraan{
    private int jumlahRoda;
    public Truk(KendaraanBahanbakar bahanbakar, KendaraanNama nama, int kapasitas, int jumlahRoda){
        super(KendaraanBahanbakar.DIESEL, KendaraanNama.TRUK, 7);
        this.jumlahRoda = jumlahRoda;
    }

    public int getJumlahRoda(){
        return this.jumlahRoda;
    }

    @Override
    public String getDetails(){
        return "Truk";
    }
}