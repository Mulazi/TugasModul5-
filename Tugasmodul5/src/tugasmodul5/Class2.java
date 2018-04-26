/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul5;

import java.util.Scanner;

/**
 *
 * @author Mulazi
 */
public class Class2 {
    public String memesan() {
        int x = 2;
        
        do{
        try{
            System.out.println();
            System.out.println("Program penjualan Handphone");
            System.out.println("===========================");
            System.out.println("Stok HP yang tersedia");
            System.out.println("===========================");
            System.out.println("1. Samsung");
            System.out.println("2. Iphone");
            System.out.println("3. Lenovo");
            Scanner k = new Scanner(System.in);
            System.out.print ("Masukkan pilihan  : ");
            int pilihan = k.nextInt();
            switch(pilihan){
                case 1:
                    Scanner p1 = new Scanner(System.in);
                    int i;
                    do {
                        System.out.print("Masukkan jumlah pesanan : ");
                    int pesanan = p1.nextInt();
                    if (pesanan > 50) {
                        return "Pesanan "+ pesanan +" melebihi batas pembelian";
                    }
                    else {
                        return "Jumlah pesanan : "+pesanan+"\nTerimasih Telah Berbelanja di Toko Kami ";
                    }
                    } while(i>50);
                    
                case 2:
                    Scanner p2 = new Scanner(System.in);
                    System.out.print("Masukkan jumlah pesanan : ");
                    int pesanan2 = p2.nextInt();
                    if (pesanan2 > 50) {
                        return "Pesanan "+ pesanan2 +" melebihi batas pembelian";
                    }
                    else {
                        return "Jumlah pesanan "+pesanan2+"\nTerimasih Telah Berbelanja di Toko Kami ";
                    }
                case 3:
                         Scanner p3 = new Scanner(System.in);
                    System.out.print("Masukkan jumlah pesanan : ");
                    int pesanan3 = p3.nextInt();
                    if (pesanan3 > 50) {
                        return "Pesanan "+ pesanan3 +" melebihi batas pembelian";
                    }
                    else {
                        return "Jumlah pesanan "+pesanan3+"\nTerimasih Telah Berbelanja di Toko Kami ";
                    }
                default:
                    System.out.println("Pilih pilihan diatas");
            }
        }
        catch (Exception e){
            System.out.println("Salah masukan");
        }
        }while (x==2);
        return null;
    }
}

