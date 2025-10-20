package models;

public class Mobil extends Kendaraan{
    private int jumlahRoda;
    public Mobil(KendaraanBahanbakar bahanBakar, KendaraanNama nama,int kapasitas, int jumlahRoda){
        super(KendaraanBahanbakar.BENSIN, KendaraanNama.MOBIL, 7);
        this.jumlahRoda = jumlahRoda;
    }

    public int getJumlahRoda(){
        return this.jumlahRoda;
    }

    @Override
    public String getDetails(){
        return "Mobil";
    }
}