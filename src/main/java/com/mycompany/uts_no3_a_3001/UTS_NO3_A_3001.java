/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_a_3001;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *21103001
 * @author Aisyah Fitri Hidayati
 * S1SI05A
 */
public class UTS_NO3_A_3001{
    public static void main(String[] args) {
        
        //Membuat object menggunakan array
        Asisten_Praktikum_3001[] A = new Asisten_Praktikum_3001[1];
        Student_Staff_3001[] S = new Student_Staff_3001[1];
        
        A[0] = new Asisten_Praktikum_3001();
        S[0] = new Student_Staff_3001();

        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                A[i].nim_3001 = br.readLine();
                System.out.print("Nama             : ");
                A[i].nama_3001 = br.readLine();
                System.out.print("Jurusan          : ");
                A[i].jurusan_3001 =br.readLine();
                System.out.print("IPK              : ");
                A[i].ipk_3001 =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                A[i].mkAsisten_3001 = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                A[i].jmlPertemuan_3001 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(Asisten_Praktikum_3001 a : A){
                a.tampilDataAsistenPraktikum_3001();
                System.out.println("");
            }

            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                S[i].nim_3001 = br.readLine();
                System.out.print("Nama        : ");
                S[i].nama_3001 = br.readLine();
                System.out.print("Jurusan     : ");
                S[i].jurusan_3001 =br.readLine();
                System.out.print("IPK         : ");
                S[i].ipk_3001 =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                S[i].unitKerja_3001 = Integer.parseInt(br.readLine());
                System.out.print("Jam Kerja   : ");
                S[i].jamKerja_3001 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            
            System.out.println("DATA STUDENT STAFF");
            for(Student_Staff_3001 s : S){
                s.tampilDataStudentStaff_3001();
                System.out.println("");
            }
        } 
        catch (Exception ex){ 
            System.out.println(ex);
        }
        
    }
}