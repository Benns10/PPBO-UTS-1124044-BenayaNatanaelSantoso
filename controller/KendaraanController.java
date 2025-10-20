package controller;

import java.util.*;

import models.Kendaraan;
import models.Mobil;
import models.Truk;
import models.Helikopter;
import models.Pesawat;
import repositories.KendaraanRepository;

public class KendaraanController{
    private KendaraanRepository kendaraanRepository;

    public KendaraanController(){
        this.kendaraanRepository = new KendaraanRepository();
    }

    public List<Kendaraan> getAllFurnitures(){
        return this.kendaraanRepository.findAll();
    }

    public void add(Kendaraan kendaraan){
        this.kendaraanRepository.add(kendaraan);
    }

    public void addMobil(int kapasitas, int jumlahRoda){
        this.add(new Mobil(null, null, 8, 4));
    }

    public void addTruk(int kapasitas, int jumlahRoda){
        this.add(new Truk(null, null, 7, 10));
    }

    public void addHelikopter(int kapasitas, int jumlahBaling){
        this.add(new Helikopter(null, null, 6, 4));
    }

    public void addPesawat(int kapasitas, int jumlahRoda){
        this.add(new Pesawat(null, null, 100, 6, true));
    }
}