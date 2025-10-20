package models;

public class Pesawat extends Kendaraan{
    private int jumlahRoda;
    private Boolean pesawatTempur;
    public Pesawat(KendaraanBahanbakar bahanbakar, KendaraanNama nama, int kapasitas, int jumlahRoda, Boolean pesawatTempur){
        super(KendaraanBahanbakar.AVTUR, KendaraanNama.PESAWAT, 100);
        this.jumlahRoda = jumlahRoda;
        this.pesawatTempur = pesawatTempur;
    }

    public int getJumlahRoda(){
        return this.jumlahRoda;
    }

    public Boolean getPesawatTempur(){
        return this.pesawatTempur;
    }

    @Override
    public String getDetails(){
        return "Pesawat";
    }
}