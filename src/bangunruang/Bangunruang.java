/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangunruang;
import java.util.Scanner;

/**
 *
 * @author m.dien vito
 */
public class Bangunruang {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double vol, phi = 3.14;
        int p, l,t,r;
        System.out.println("Menghitung Bangun Ruang");
        
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. bola");
        System.out.println("5. kerucut");
        System.out.println("==========================");
        System.out.println("Pilih Bangun Ruang Yang Ingin di Hitung");
        int pilih = input.nextInt();
        System.out.println(" ");
        
        
        switch(pilih) {
            case 1 :
                System.out.println("Hitung Bangun Ruang Kubus:");
                System.out.println("==========================");
                System.out.println("Input sisi kubus");
                r = input.nextInt();
                System.out.println("Volume kubus adalah: " + kubus(r));
                break;
            case 2 :
                System.out.println("Hitung Bangun Ruang balok:");
                System.out.println("==========================");
                System.out.println("Input panjang balok");
                p = input.nextInt();
                System.out.println("Input lebar balok");
                l = input.nextInt();
                System.out.println("Input tinggi balok");
                t = input.nextInt();
                System.out.println("Volume balok adalah: " + balok(p,l,t));
                break;
            case 3 :
                System.out.println("Hitung Bangun Ruang tabung:");
                System.out.println("==========================");
                System.out.println("Input Jari-jari tabung");
                r = input.nextInt();
                System.out.println("Input tinggi tabung");
                t = input.nextInt();
                
                System.out.println("Volume tabung adalah: " + tabung(r,t,phi));
                break;
            case 4 :
                System.out.println("Hitung Bangun Ruang Bola:");
                System.out.println("==========================");
                System.out.println("Input Jari-jari bola");
                r = input.nextInt();
                
                System.out.println("Volume bola adalah: " + bola(r,phi));
                break;
            case 5 :
                System.out.println("Hitung Bangun Ruang volume kerucut:");
                System.out.println("==========================");
                System.out.print("Input jari-jari Kerucut: ");
                r = input.nextInt();
                System.out.print("Input tinggi kerucut: ");
                t = input.nextInt();
                
                System.out.println();
                System.out.println("Volume Kerucut = "+kerucut(r,t,phi));
                break;
        }
    }
   static double kubus(int r){
       double vol = r*r*r;
       return vol;
   }
   static double balok(int p,int l,int t){
       double vol = p*l*t;
       return vol;
   }
   static double tabung(int r,int t,double phi){
       double vol = phi*r*r+t;
       return vol;
   }
   static double bola(int r,double phi){
       double vol = (4 * phi * r * r * r) / 3;
       return vol;
   }
   static double kerucut(int r,int t,double phi){
       double vol = (1 * phi * r * r * t) / 3;
       return vol;
   }
}
