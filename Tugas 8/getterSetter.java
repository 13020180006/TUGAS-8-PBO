/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Sabtu, 02 Mei 2020
Waktu   : 16.57 WITA
*/
package tugas8;

public class getterSetter {
    private String nidn,namaDosen, jurusan, fakultas, email;
    
    public void setNidn(String nidn){
        this.nidn = nidn;
    }
    public String getNidn(){
        return this.nidn;
    }
    
    public void setNamaDosen(String namaDosen){
        this.namaDosen = namaDosen;
    }
    public String getNamaDosen(){
        return this.namaDosen;
    }
    
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public String getJurusan(){
        return this.jurusan;
    }
    
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
    public String getFakultas(){
        return this.fakultas;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    
}
