/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirfnb;

import java.util.Scanner;

/**
 *
 * @author Ditha
 */
public class dtMenu {
    private int jRecord = 10;
     public int aRec = 0;
    
    //Array
    private String[][] dtProduk = new String[jRecord][3];
    Scanner dtIN = new Scanner(System.in);
    
    //constactor
    public dtMenu (int nval){
        this.jRecord = nval;
    }
 
    //StoreData
    public void InputData(){
        int idx = aRec;
        
        if(idx >= jRecord){
            System.out.println("Tempat Penyimpanan Data Sudah Penuh");
            System.out.println("");
            return;
        }
        System.out.println("Tambah Menu");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.print("Nama Menu Makanan : ");
        dtProduk[idx][0] = dtIN.nextLine();
        
        System.out.print("Deskripsi Menu : ");
        dtProduk[idx][1] = dtIN.nextLine();
        
        System.out.print("Harga Menu : ");
        dtProduk[idx][2] = dtIN.nextLine();
        
        aRec++;
    }
    
//    public void order(){
//        
//        viewData();
//        
//        String txidx = dtIN.nextLine();
//        int idx = Integer.parseInt(txidx);        
//        if(idx >= jRecord){
//            System.out.println("Tempat Penyimpanan Data Sudah Penuh");
//            System.out.println("");
//            return;
//        }
//        System.out.println("Order Menu");
//        System.out.println("~~~~~~~~~~~~~~~~~~");
//        System.out.print("Nama Menu Makanan : ");
//        dtorder[idx][0] = dtIN.nextLine();
//        
//        System.out.print("Jumlah order : ");
//        dtorder[idx][1] = dtIN.nextLine();
//        
//        
//       
//        aRec++;
//        
//        int jumlahOrder = Integer.parseInt(dtorder[idx][1]);
//        int hargaMenu = Integer.parseInt(dtProduk[idx][2]);
////        int totalHarga = hargaMenu * jumlahOrder;
////        String namaMenu = "" + dtorder[idx][0];
//
//        System.out.println("Nota Transaksi");
//        System.out.println("--------------");
////        System.out.println("Nama Menu: " + namaMenu);
//        System.out.println("Jumlah Pesanan: " + jumlahOrder);
//        System.out.println("Harga Menu: " + hargaMenu);
////        System.out.println("Total Harga: " + totalHarga);  
//        
//    }
    
    public void order(){
    viewData();
    
    System.out.print("Pilih menu (masukkan nomor menu): ");
    String txidx = dtIN.nextLine();
    int idx = Integer.parseInt(txidx);
    
    if(idx >= jRecord){
        System.out.println("Menu tidak tersedia");
        return;
    }
    
    System.out.println("Order Menu");
    System.out.println("~~~~~~~~~~~~~~~~~~");
    System.out.print("Jumlah pesanan: ");
    String jumlahOrderStr = dtIN.nextLine();
    int jumlahOrder = 0;
    try {
        jumlahOrder = Integer.parseInt(jumlahOrderStr);
    } catch (NumberFormatException e) {
        System.out.println("Input tidak valid. Silakan masukkan jumlah pesanan yang benar.");
        return;
    }
    
    int hargaMenu = Integer.parseInt(dtProduk[idx][2]);
    int totalHarga = hargaMenu * jumlahOrder;
    String namaMenu = dtProduk[idx][0];
    
    System.out.println("Nota Transaksi");
    System.out.println("--------------");
    System.out.println("Nama Menu: " + namaMenu);
    System.out.println("Jumlah Pesanan: " + jumlahOrder);
    System.out.println("Harga Menu: " + hargaMenu);
    System.out.println("Total Harga: " + totalHarga);
    
    System.out.println("Tekan enter untuk kembali ke menu awal...");
    dtIN.nextLine();
}
    
//    public void nota(){
//        
//        int idx = aRec;
//        
//        int hargaMenu = Integer.parseInt(dtProduk[idx][2]);
//        int jumlahPesanan = Integer.parseInt(dtorder[idx][1]);
//        int totalHarga = hargaMenu * jumlahPesanan;
//        String namaMenu = "" + dtorder[idx][0];
//
//        System.out.println("Nota Transaksi");
//        System.out.println("--------------");
//        System.out.println("Nama Menu: " + namaMenu);
//        System.out.println("Jumlah Pesanan: " + jumlahPesanan);
//        System.out.println("Harga Menu: " + hargaMenu);
//        System.out.println("Total Harga: " + totalHarga);
//
//    }
    
    //UpdateData = Mengubah data
    public void UpdateData(){
        System.out.println("Ubah Data Menu");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Nomor Menu: ");
        
        String txidx = dtIN.nextLine();
        int idx = Integer.parseInt(txidx);
        System.out.println("Data Lama");
        System.out.println("~~~~~~~~~");
        System.out.println("Nama Menu: "+dtProduk[idx][0]);
        System.out.print("Diubah menjadi: ");
        dtProduk[idx][0] = dtIN.nextLine();
        
        System.out.println("Deskripsi Makanan: "+dtProduk[idx][1]);
        System.out.print("Diubah menjadi: ");
        dtProduk[idx][1] = dtIN.nextLine();
        
        System.out.println("Harga Menu: "+dtProduk[idx][2]);
        System.out.print("Diubah menjadi: ");
        dtProduk[idx][2] = dtIN.nextLine();
          
        System.out.println("Data Record ke "+idx+" telah diubah");
                
    }
    
    
    
    
            
    //Destroy = Menghapus Data
    public void DestroyData(){
        String[][] tmp = new String[jRecord][5];
        
        System.out.println("Hapus Data Menu ");
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("Nomor Menu: ");
        
        String txidx = dtIN.nextLine();
        
        int idx = Integer.parseInt(txidx);
        System.out.println("Data yang dihapus");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama menu: "+dtProduk[idx][0]);
        System.out.println("Deskripsi Menu: "+dtProduk[idx][1]);
        System.out.println("Harga Menu: "+dtProduk[idx][2]);

        
        int cidx = 0;
        for(int i=0;i<aRec;i++){
            if(i == idx){
                continue;
            }
                
            tmp[cidx][0] = dtProduk[i][0];   
            tmp[cidx][1] = dtProduk[i][1];   
            tmp[cidx][2] = dtProduk[i][2];
            cidx++;
        }
        aRec--;
        for(int i=0; i<aRec; i++){
            tmp[cidx][0] = dtProduk[i][0];   
            tmp[cidx][1] = dtProduk[i][1];   
            tmp[cidx][2] = dtProduk[i][2]; 
        }

    }
    
    //ViewData = Melihat Data
    public void viewData(){
        System.out.println("Data Menu Makanan ("+aRec+"/"+jRecord+")");
        System.out.println("~~~~~~~~~~~~~~~~");
        
        for (int i=0; i<aRec; i++){
            System.out.println("Menu Makanan ke"+i);
            System.out.println("Nama Menu :"+dtProduk[i][0]);
            System.out.println("Deskripsi Menu :"+dtProduk[i][1]);
            System.out.println("Harga Menu : "+dtProduk[i][2]);
        }
        System.out.println("");
        
    }
    
}
