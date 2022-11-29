/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3001;

/**
 *21103001
 * @author Aisyah Fitri Hidayati
 * S1SI05A
 */
public class Asisten_Praktikum_3001 extends Mahasiswa_3001 {
    String mkAsisten_3001;
    int jmlPertemuan_3001;
    String nim_3001;
    
    
    public double totalPendapatanAsisten(){
        return(jmlPertemuan_3001 * 50000);
    }
    public void tampilDataAsistenPraktikum_3001() {
        super.tampilDataMhs();
        System.out.println(" Mata Kuliah    : " + mkAsisten_3001);
        System.out.println(" Jumlah Pertemuan   : " + jmlPertemuan_3001);
        System.out.println(" Total Pendapatan : " + totalPendapatanAsisten());
        
        
    }
    
}
