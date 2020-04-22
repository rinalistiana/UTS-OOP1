/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiKonsol;
import java.util.*;
/**
 *
 * @author Notebook
 */
public class Aplikasi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Aplikasi app = new Aplikasi();
        while(true) {
            app.printMenu();
            int pilihan = sc.nextInt();
            switch(pilihan) {
                case 1:
                    System.out.println("----------------------");
                    System.out.println("Formulir Tambah Data");
                    System.out.println("----------------------");
                    app.addData();
                    break;
                case 2:
                    System.out.println("----------------------");
                    System.out.println("Formulir Ubah Data");
                    System.out.println("----------------------");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("----------------------");
                    System.out.println("Formulir Hapus Data");
                    System.out.println("----------------------");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("------------------------");
                    System.out.println("Tampilkan seluruh Data");
                    System.out.println("------------------------");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang ingin dihapus: "); int idx = Integer.parseInt(sc.nextLine());
        // proses hapus data
        Operasi.removeData(idx-1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang ingin diubah: "); int idx = Integer.parseInt(sc.nextLine());
        System.out.println("--------------------------");
        System.out.print(" NIM : "); String nim = sc.nextLine();
        System.out.print(" Nama : "); String nama = sc.nextLine();
        System.out.print(" Kelas : "); String kelas = sc.nextLine();
        System.out.print(" Semester : "); String semester = sc.nextLine();
        System.out.print(" Alamat : "); String alamat = sc.nextLine();
        // Proses ubah data
        Operasi.editData(new Data(nim, nama, kelas, semester, alamat), idx-1);
    }

    public void listData() {
        // Proses tampilkan data
        List<Data> result = Operasi.getListData();
        for(int i=0; i<result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i+1));
            System.out.println("  NIM : " + result.get(i).getNim());
            System.out.println("  Nama : " + result.get(i).getNama());
            System.out.println("  Kelas : " + result.get(i).getKelas());
            System.out.println("  Semester : " + result.get(i).getSemester());
            System.out.println("  Alamat : " + result.get(i).getAlamat());
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("NIM : "); String nim = sc.nextLine();
        System.out.print("Nama : "); String nama = sc.nextLine();
        System.out.print("Kelas : "); String kelas = sc.nextLine();
        System.out.print("Semester : "); String semester = sc.nextLine();
        System.out.print("Alamat : "); String alamat = sc.nextLine();
        // proses tambah data
        Operasi.addData(new Data(nim, nama, kelas, semester, alamat));
    }

    public void printMenu() {
        System.out.println("***********************************");
        System.out.println("APLIKASI PEREKAMAN DATA MAHASISWA");
        System.out.println("***********************************");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan: ");
    }
}
