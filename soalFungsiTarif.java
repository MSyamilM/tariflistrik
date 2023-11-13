/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbuaul;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author MOKLET010
 */
public class soalFungsiTarif {
    static void tampilNamaPelanggan(int id) throws IOException{
        String namaPelanggan[] = {"Ali","Budi","Dani","Edi","Umar"};
        System.out.println("Nama Pelanggan: "+namaPelanggan[id-1]);
    }
    
    static void hitungTarif(int jumlahPakai){
        int harga = 0;
        if(jumlahPakai >0 && jumlahPakai<=10){
            jumlahPakai = 10;
            harga = jumlahPakai*2000;
        }else if(jumlahPakai>=11 && jumlahPakai <= 20){
            harga = jumlahPakai*3000;
        }else if(jumlahPakai>=21 && jumlahPakai <= 30){
            harga = jumlahPakai*4000;
        }else if(jumlahPakai>=31){
            harga = jumlahPakai*5000;
        }
        
        harga += 10000;
        
        System.out.println("Jumlah Pemakaian: "+jumlahPakai);
        System.out.println("Tarif Pemakaian: Rp"+String.format("%, d", (harga-10000)));
        System.out.println("Tarif Pemakaian Dengan Biaya Administrasi: Rp "+String.format("%,d", harga));
    }
    
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int p = 1;
        
        while(p == 1) {
            System.out.print("Masukkan Nomor ID Pelanggan: ");
            int nomorId = input.nextInt();
            System.out.print("Masukkan Jumlah Pemakaian: ");
            int jumlahPemakaian = input.nextInt();
            
            tampilNamaPelanggan(nomorId);
            hitungTarif(jumlahPemakaian);
            
            System.out.print("Lanjutkan Program? (y/n): ");
            String lanjut = input.next();
            
            switch (lanjut) {
                case "n":
                    p = 0;
                    break;
                default:
                    p = 1;
            }
        }
    }
}
