/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan50.EnergiKinetik;

/**
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program menghitung Energi Kinetik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKinetik objEnergiKinetik = new EnergiKinetik();
        System.out.println("=== Diketahui === ");
        objEnergiKinetik.setMassa(145);
        objEnergiKinetik.setKecepatan(25);
        System.out.println("massa (m) : "+ objEnergiKinetik.getMassa() + " gram");
        System.out.println("Kecepatan (v) : "+ objEnergiKinetik.getKecepatan()+ " m/s");
        System.out.println("=== Ditanyakan ===");
        System.out.println("a. Berapa Energi Kinetiknya");
        System.out.println("-> EK = 1/2 m * v^2 ");
        objEnergiKinetik.hitungEnergiKinetik(objEnergiKinetik.getMassa(), objEnergiKinetik.getKecepatan());
        System.out.println("b. Berapakah usaha yang dilakukan pada bola untuk mencapai kecepatan ini, jika dimulai dari keadaan diam");
        System.out.println("-> W = ??");
        System.out.println("-> W = (Delta)EK");
        objEnergiKinetik.hitungUsaha(objEnergiKinetik.getMassa(),objEnergiKinetik.getKecepatan() , 0);
        
    }
    
}
