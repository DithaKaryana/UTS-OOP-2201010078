
package kasirfnb;

import java.util.Scanner;

/**
 *
 * @author Ditha
 */
public class KasirFnb {

    
    public static void main(String[] args) {
        
        KasirFnb kasirFnb = new KasirFnb();
        kasirFnb.mainMenu();
}
    public void mainMenu(){
        
        System.out.println("Login Kasir Fnb ");
        System.out.println("Masukkan Username dan Password");
        
        login();
       }
       
       public void login(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Username : ");
        String username = scanner.nextLine();
        System.out.print("Password : ");
        String password = scanner.nextLine();
        
        System.out.println("Selamat datang Admin " + username);
        
        System.out.println("Ketik 1 untuk lanjut ke halaman selanjutnya");
        
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
               Menu.page();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        
        scanner.close();
       
    
    }
    
}
