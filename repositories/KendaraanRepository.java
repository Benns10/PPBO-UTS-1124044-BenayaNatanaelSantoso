package repositories;
import java.util.*;

import models.Kendaraan;

public class KendaraanRepository{
    private List<Kendaraan> kendaraan;

    public KendaraanRepository(){
        this.kendaraan = new ArrayList<>();
    }
    
    public List<Kendaraan> findAll(){
        return this.kendaraan;
    }

    public void add(Kendaraan kendaraan){
        this.kendaraan.add(kendaraan);
    }
}