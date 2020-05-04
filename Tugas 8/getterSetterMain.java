/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Sabtu, 02 Mei 2020
Waktu   : 17.14 WITA
*/
package tugas8;

public class getterSetterMain {
        public static void main(String[] args){
        getterSetter dina = new getterSetter();
        
        dina.setNidn("0906078701");
        dina.setNamaDosen("Mardiyyah Hasnawi, S.Kom., M.T");
        dina.setJurusan("Teknik Informatika");
        dina.setFakultas("Ilmu Komputer");
        dina.setEmail("mardiyyah.hm@gmail.com");
        
        System.out.println("NIDN          : "+dina.getNidn());
        System.out.println("Nama Dosen    : "+dina.getNamaDosen());
        System.out.println("Jurusan       : "+dina.getJurusan());
        System.out.println("Fakultas      : "+dina.getFakultas());
        System.out.println("Email         : "+dina.getEmail());
    }
}
