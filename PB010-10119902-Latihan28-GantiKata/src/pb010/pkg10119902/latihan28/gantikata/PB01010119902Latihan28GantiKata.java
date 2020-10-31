/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb010.pkg10119902.latihan28.gantikata;

import java.util.Scanner;

/**
 * 
 * @author
 * NAMA     : Muhammad Nurkholiq
 * KELAS    : IF-10K
 * NIM      : 10119902
 * Deskripsi Program : Program ini berisi program untuk Mengganti Kata Dalam Sebuah Kalimat
 * 
 */

public class PB01010119902Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String kalimatAwal, kalimatBaru, kataDiganti, kataPengganti;

        System.out.println("====Program Mengganti Kata====\n");

        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scanner.nextLine();

        System.out.print("Ganti Kata : ");
        kataDiganti = scanner.nextLine();

        System.out.print("Menjadi Kata : ");
        kataPengganti = scanner.nextLine();

        kalimatBaru = kalimatAwal.replace(kataDiganti, kataPengganti);

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimatAwal);
        System.out.println("Kalimat baru : " + kalimatBaru);
    }
    
}
