/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirfnb;

/**
 *
 * @author Ditha
 */
public class Menu {
    public static void page() {

       dtMenu DA = new dtMenu(10);
       String ul ="ulang";
       do{
            System.out.println("Aplikasi InStock (Input Data)");
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
            System.out.println("A. Lihat Data Menu");
            System.out.println("B. Tambah Data Menu");
            System.out.println("C. Ubah Data Menu");
            System.out.println("D. Hapus Data Menu");
            System.out.println("E. Order Menu");
            System.out.println("F. LogOut");
            System.out.println("Pilih A/B/C/D/E/F: ");
            String mPIL = DA.dtIN.nextLine();
            
            switch(mPIL){
                case "A":
                    DA.viewData();
                    break; 
                
                case "B":
                    DA.InputData();
                    break; 
                
                case "C":
                    DA.UpdateData();
                    break; 
                
                case "D":
                    DA.DestroyData();
                    break; 
                
                case "E":
                    DA.order();
                    break;
                     
                case "F":
                    KasirFnb fnb = new KasirFnb();
                    fnb.mainMenu();
                    break; 
                    
                    
                default:
                        System.out.println("Plihan Tidak tersedia");
                    break;
            }
       }while( ul.equals("ulang"));
}
}
