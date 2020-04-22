/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiKonsol;

/**
 *
 * @author Notebook
 */
public class Data {
    private String nim;
    private String nama;
    private String kelas; 
    private String semester;
    private String alamat;

    public Data() {
        nim = "";
        nama = "";
        kelas = "";
        semester = "";
        alamat = "";
    }

    public Data(String nim, String nama, String kelas, String semester, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.semester = semester;
        this.alamat = alamat;
    }

    public void setNim(String nim) { 
        this.nim = nim; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public void setKelas(String kelas) { 
        this.kelas = kelas; 
    }

    public void setSemester(String semester) { 
        this.semester = semester; 
    }
    
    public void setAlamat(String alamat) { 
        this.alamat = alamat; 
    }

    public String getNim() { 
        return nim; 
    }

    public String getNama() { 
        return nama; 
    }

    public String getKelas() { 
        return kelas; 
    }
    
    public String getSemester() { 
        return semester; 
    }
    
    public String getAlamat() { 
        return alamat; 
    }
}
