/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Sabtu, 02 Mei 2020
Waktu   : 16.00 WITA
*/
package tugas8;

public class This{ 
    String matkul;
    String materi;  

void input (String newMatkul,String newMateri) { 
    this.matkul = newMatkul; 
    this.materi = newMateri; 
} 
public static void main (String[] args){ 
    This a = new This (); 
    a.input ("Pemrograman Berorientasi Objek","Materi Penggunaan This"); 
    System.out.println( "Nama Mata Kuliah : "+ a.matkul); 
    System.out.println( "Materi : " + a.materi); 
} 
}

