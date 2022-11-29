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
public class Student_Staff_3001 extends Mahasiswa_3001{
    int unitKerja_3001, jamKerja_3001;
    int ipk_3001;
    
    public double totalPendapatanStudentStaff(){
        return (jamKerja_3001 * 30000);
    }
    public void tampilDataStudentStaff_3001(){
        super.tampilDataMhs();
        System.out.println(" Unit Kerja : " + unitKerja_3001);
        System.out.println(" Jam Kerja : " +jamKerja_3001);
        System.out.println(" Total Pendapatan Student Staff : " +totalPendapatanStudentStaff());
    }
}

   
   
