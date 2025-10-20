package models;

public class Helikopter extends Kendaraan{
    private int jumlahBaling;
    public Helikopter(KendaraanBahanbakar bahanbakar, KendaraanNama nama, int kapasitas, int jumlahBaling){
        super(KendaraanBahanbakar.AVTUR, KendaraanNama.HELIKOPTER, 6);
        this.jumlahBaling = jumlahBaling;
    }

    public int getJumlahBaling(){
        return this.jumlahBaling;
    }

    @Override
    public String getDetails(){
        return "Helikopter";
    }
}