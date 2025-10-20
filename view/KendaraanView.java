package view;

import util.CLIUtils;
import models.Kendaraan;
import controller.KendaraanController;

public class KendaraanView {

  private KendaraanController kendaraanController;

  public KendaraanView(){
    this.kendaraanController = new KendaraanController();
  }
  public void render() {
    this.printMenu();
    int menu = CLIUtils.getInt();
    while (menu != 0) {
      switch (menu) {
        case 1:
          this.handleTambahKendaraan();
          break;
        case 2:
          this.handlePrintKendaraan();
          break;
        case 3:
          this.handleSortKendaraan();
          break;
        case 0:
          return;
      }
      this.printMenu();
      menu = CLIUtils.getInt();
    }
  }

  private void getMenuInput() {
    System.out.println("Menu:");
    System.out.println("1. Tambah kendaraan");
    System.out.println("2. Tampilkan semua kendaraan");
    System.out.println("3. Urutkan kendaraan berdasarkan kapasitas");
    System.out.println("0. Keluar");
    System.out.print("Pilihanmu: ");
    int pilih = CLIUtils.getInt();
    switch (pilih) {
      case 1:
        
        break;
      case 2:
          
        break;
      case 3:
        
        break;
    }
  }
  private void printMenu() {
    
  }

  private void handleTambahKendaraan() {
    int tipe = 123;
    String nama = CLIUtils.askForString("Masukkan nama kendaraan: ");
    switch (tipe) {
      case 1:
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
    }
  }

  private void handlePrintKendaraan() {

  }

  private void handleSortKendaraan() {

  }
}