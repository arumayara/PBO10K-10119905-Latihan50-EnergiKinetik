/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan50.EnergiKinetik;

/**
 *
 * @author aruma
 */
public class EnergiKinetik {
    private double massa;
    private double kecepatan;
    private double energiKinetik;
    private double usaha;
    
    public double getMassa(){
        return massa;
    }
    
    public void setMassa(double massa){
        this.massa = massa;
    }
    
    public double getKecepatan(){
        return kecepatan;
    }
    
    public void setKecepatan(double kecepatan){
        this.kecepatan = kecepatan;
    }
    
    public void hitungEnergiKinetik( double massa , double kecepatan){
        energiKinetik = 0.5*(massa/1000)*(kecepatan*kecepatan);
        System.out.println("-> EK = "+ energiKinetik + " J");
    }
    
    public void hitungUsaha(double massa, double kecepatan, double EKawal){
        usaha = ((0.5*(massa/1000)*(kecepatan*kecepatan))- EKawal);
        System.out.println("-> W = "+ usaha + " J");
    } 
    
}
